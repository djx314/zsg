package asuna.macros.multiply

import asuna.macros.multiply.utils.PropertyOverrideHelper
import asuna.{AppendTag, TupleTag}

import scala.language.experimental.macros

trait AsunaMultiplyRepGeneric[Table, Model, Rep] {
  def rep(table: Table): Rep
}

object AsunaMultiplyRepGeneric {
  implicit def macroImpl[Table, Model, Rep]: AsunaMultiplyRepGeneric[Table, Model, Rep] = macro AsunaMultiplyRepGenericApply.MacroImpl.generic[Table, Model, Rep]
}

object AsunaMultiplyRepGenericApply {

  class MacroImpl(override val c: scala.reflect.macros.blackbox.Context) extends PropertyOverrideHelper {
    self =>

    import c.universe._

    def generic[Table: c.WeakTypeTag, Model: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaMultiplyRepGeneric[Table, Model, M]] = {
      try {
        val t     = weakTypeOf[Table]
        val m     = weakTypeOf[Model]
        val tType = t.resultType
        val mType = m.resultType

        val props = mType.members.toList
          .filter { s =>
            s.isTerm && s.asTerm.isVal && s.asTerm.isCaseAccessor
          }
          .map(s => (s.name, s))
          .collect {
            case (TermName(n), s) =>
              val proName = n.trim
              proName
          }
          .reverse

        val tableFields = tType.members.toList
          .filter(s => s.isTerm)
          .map(s => (s.name, s))
          .collect {
            case (TermName(n), s) =>
              val proName = n.trim
              (List(proName), s, s.typeSignatureIn(tType))
          }
          .reverse

        val tableProps = tableFields.map(s => tablePropsGen(s._1, s._2, s._3, Map.empty)).foldLeft(Map.empty[String, List[String]]) { (start, path) =>
          start ++ path
        }

        def tableProperty(s: String): Tree = {
          tableProps
            .get(s)
            .map(
              (fieldName) =>
                fieldName.foldLeft(q"""table""": Tree) { (start, termName) =>
                  q"""${start}.${TermName(termName)}"""
                }
            )
            .getOrElse(
              q"""asuna.macros.utils.PlaceHolder.value"""
            )
        }

        val proTypeTag = props.map(s => tableProperty(s))

        def nameTagGen(tree: List[Tree]): Tree =
          if (tree.length <= 8) {
            q"""(table: ${tType}) => { asuna.BuildContent.${TermName("tuple" + tree.length)}(..${tree}) }"""
          } else {
            val groupedTree = tree.grouped(8).toList
            nameTagGen(groupedTree.map(s => q"""asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaMultiplyRepGeneric[Table, Model, M]] {
          nameTagGen(proTypeTag)
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}