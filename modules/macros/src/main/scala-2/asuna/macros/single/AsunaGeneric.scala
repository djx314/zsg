package asuna.macros.single

import asuna.macros.AsunaParameters
import asuna.macros.single.utils.TypeHelper

import scala.language.experimental.macros
import scala.collection.compat._

trait AsunaGeneric[H] {
  type WT
  def tag: WT
}

object AsunaGeneric {

  val value = new AsunaGeneric[Any] {
    override type WT = Any
    override def tag: Any = 2
  }
  type Aux[H, II] = AsunaGeneric[H] { type WT = II }
  @inline def Aux[H, II]: Aux[H, II] = value.asInstanceOf[Aux[H, II]]

  class GenericApply[M] {
    def generic[WW](implicit i: AsunaGeneric.Aux[M, WW]): AsunaGeneric.Aux[M, WW] = i
    @inline def value[K](i: PropertyApply[M] => K): AsunaGeneric.Aux[M, K]        = Aux[M, K]
  }

  object GenericApply {
    val value                                                  = new GenericApply[Any]
    @inline def apply[T]: AsunaGeneric.GenericApply[T]         = value.asInstanceOf[GenericApply[T]]
    @inline implicit def init[M]: AsunaGeneric.GenericApply[M] = GenericApply[M]
  }

  implicit def macroImpl[H, II](implicit prop: AsunaGeneric.GenericApply[H]): AsunaGeneric.Aux[H, II] = macro AsunaGenericMacroApply.MacroImpl.generic[H, II]

}

object AsunaGenericMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.whitebox.Context) extends TypeHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, II: c.WeakTypeTag](prop: c.Expr[AsunaGeneric.GenericApply[H]]): c.Expr[AsunaGeneric.Aux[H, II]] = {
      try {
        val h     = weakTypeOf[H]
        val hType = h.resultType

        val props = caseClassMembersByType(hType)

        val proTypeTag = props.map(s => q"""item.to(_.${s.fieldTermName})""")

        def typeTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""..$tree"""
          } else {
            val groupedTree = tree.grouped(AsunaParameters.maxPropertyNum).to(List)
            typeTagGen(groupedTree.map(s => q"""_root_.asuna.BuildContent.${TermName("tuple" + s.length)}(..$s)"""))
          }

        c.Expr[AsunaGeneric.Aux[H, II]] {
          q"""$prop.value(item => ${typeTagGen(proTypeTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}