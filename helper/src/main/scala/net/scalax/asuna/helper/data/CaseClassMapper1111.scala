package net.scalax.asuna.helper.data.macroImpl

import net.scalax.asuna.helper.decoder.macroImpl.ModelGen
import net.scalax.asuna.helper.{BaseCaseClassMapperUtils, TableFieldsGen}
import net.scalax.asuna.helper.encoder.InputTable
import net.scalax.asuna.helper.mapper.CaseClassMapper

import scala.annotation.tailrec

object CaseClassMapperMacro {

  class DecoderMapperImpl(override val c: scala.reflect.macros.whitebox.Context) extends BaseCaseClassMapperUtils with TableFieldsGen {
    self =>

    import c.universe._

    def caseclassDecoderGeneric[
        Input: c.WeakTypeTag
      , Output: c.WeakTypeTag
      , Sub: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , Rep: c.WeakTypeTag
      , TempData: c.WeakTypeTag
    ]: c.Expr[InputTable[Table, DecoderDataGen.Aux[Input, Output, Sub, Rep, TempData]]] = {
      val rep            = weakTypeOf[Rep]
      val tempData       = weakTypeOf[TempData]
      val input          = weakTypeOf[Input]
      val output         = weakTypeOf[Output]
      val sub            = weakTypeOf[Sub]
      val table          = weakTypeOf[Table]
      val outputModelGen = weakTypeOf[ModelGen[Output]]
      val lazyData       = weakTypeOf[LazyData[Input, Output, Sub]]
      val inputTable     = weakTypeOf[InputTable[Table, DecoderDataGen.Aux[Input, Output, Sub, Rep, TempData]]]

      val modelGenName = c.freshName("modelGen")
      val tableName    = c.freshName("tableInstance")

      //Model to input's fields
      val inputFieldNames = input.members
        .filter { s =>
          s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod)
        }
        .map(_.name)
        .collect { case TermName(n) => n.trim }
        .toList

      //Model to output's fields
      //Some not confirm to inputFieldNames is use to map to the table
      val outputFieldNames = output.members
        .filter { s =>
          s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal
        }
        .map(s => (s, s.name))
        .collect { case (member, TermName(n)) => (member, n.trim) }
        .toList

      //.reverse
      //Model to sub's fields
      val subFieldNames = sub.members
        .filter { s =>
          s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod)
        }
        .map(_.name)
        .collect { case TermName(n) => n.trim }
        .toList

      //Table fields
      /*val tableFieldNames = table.members
        .filter { s =>
          s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod)
        }
        .map { s =>
          try {
            s.asTerm.typeSignature.members.toList.mkString("\n")
            s.asTerm.annotations.map { s =>
              s.tree match {
                case q"""new ${r}(${Literal(Constant(num: Int))})""" if r.tpe.<:<(weakTypeOf[RootTable]) =>
                  println("11" * 100)
                  println(num)
                case q"""new ${r}(${t})""" if r.tpe.<:<(weakTypeOf[RootTable]) =>
                  println("22" * 100)
                  println(t)
                case _ =>
                //println("22" * 100)
                //println(s.tree)
              }
            }
            //println(s.name + "1111")
          } catch {
            case e: Throwable =>
              println("11" * 100)
              e.printStackTrace
          }
          (s, s.name)
        }
        .collect { case (member, TermName(n)) => (List(member), n.trim) }
        .toList*/

      val tableFieldNames = fetchTableFields(table)

      def mgDef = q"""val ${TermName(modelGenName)}: $outputModelGen = ${outputModelGen.typeSymbol.companion}.value[$output]"""

      val (fieldsPrepare, _, _) = outputFieldNames.foldLeft((List.empty[FieldName], 0, 0)) {
        case ((nameList, lawIndex, helperIndex), (member, strName)) =>
          val newLawIndex    = lawIndex + 1
          val needInput      = inputFieldNames.contains(strName)
          val usePlaceHolder = tableFieldNames.find { case (s, _) => s == strName }
          val newHelperIndex = if (!needInput) helperIndex + 1 else helperIndex
          val fieldName = FieldName(
              tableFields = usePlaceHolder.map(_._2.members)
            , lawModelMember = member
            , law = strName
            , lawIndex = newLawIndex
            , mapperIndex = newHelperIndex
            , needInput = needInput
            , needSub = subFieldNames.contains(strName)
          )
          ((fieldName :: nameList), newLawIndex, newHelperIndex)
      }

      val needToMapFields = fieldsPrepare.filter(s => !s.needInput)

      def appendIndexToTree(tree: Tree, deepIndex: List[Int]): Tree = {
        deepIndex.foldLeft(tree) { (treeItem, index) =>
          q"""$treeItem.${TermName("data" + index.toString)}"""
        }
      }

      case class FieldNameWrap(field: FieldName, deepIndex: List[Int])

      def countDeepImpl[T](base: List[T])(cv: T => List[FieldNameWrap]): List[FieldNameWrap] = {
        base match {
          case Nil =>
            c.abort(c.enclosingPosition, "Can't not map empty case class")
          case head :: Nil =>
            cv(head)
          case l =>
            val groupedList = l.grouped(maxNum).toList
            val newCv = { list: List[T] =>
              list.zipWithIndex.flatMap {
                case (list, index) =>
                  cv(list).map(r => r.copy(deepIndex = (index + 1) :: r.deepIndex))
              }
            }

            countDeepImpl(groupedList)(newCv)
        }
      }

      def countDeep(base: List[FieldName]) = countDeepImpl(base)(s => List(FieldNameWrap(s, List.empty)))

      val deepFields = countDeep(fieldsPrepare.filter(s => !s.needInput))

      val fields    = deepFields
      val subFields = deepFields.filter(s => s.field.needSub)

      val q = c.Expr[InputTable[Table, DecoderDataGen.Aux[Input, Output, Sub, Rep, TempData]]] {
        q"""
        ${inputTable.typeSymbol.companion}{ ${TermName(tableName)}: ${table} =>
          $mgDef
          ${toRepMapper(fields = needToMapFields, tableName = tableName, modelGenName = modelGenName)}
          .dataGenWrap
          .asDecoder { (tempData, rep) =>
            ${lazyData.typeSymbol.companion}.init(gen = {s: ${input} => ${output.typeSymbol.companion}(
              ..${List(
            fields.map { field =>
            q"""${TermName(field.field.law)} = ${appendIndexToTree(q"""tempData""", field.deepIndex)}"""
          }
          , fieldsPrepare.filter(_.needInput).map { field =>
            q"""${TermName(field.law)} = s.${TermName(field.law)}"""
          }
        ).flatten}

            ) }, sub = ${sub.typeSymbol.companion}(..${subFields.map { field =>
          q"""${TermName(field.field.law)} = ${appendIndexToTree(q"""tempData""", field.deepIndex)}"""
        }}))
          }
        }
        """

      }
      //println(q + "\n" + "22" * 100)
      q
    }
  }

  class EncoderMapperImpl(override val c: scala.reflect.macros.whitebox.Context) extends BaseCaseClassMapperUtils with TableFieldsGen {

    import c.universe._

    def caseclassEncoderGeneric[Output: c.WeakTypeTag, Table: c.WeakTypeTag, Rep: c.WeakTypeTag, TempData: c.WeakTypeTag]
      : c.Expr[InputTable[Table, EncoderDataGen.Aux[Output, Rep, TempData]]] = {
      val rep             = weakTypeOf[Rep]
      val tempData        = weakTypeOf[TempData]
      val output          = weakTypeOf[Output]
      val table           = weakTypeOf[Table]
      val outputModelGen  = weakTypeOf[ModelGen[Output]]
      val inputTable      = weakTypeOf[InputTable[Table, EncoderDataGen.Aux[Output, Rep, TempData]]]
      val caseClassMapper = weakTypeOf[CaseClassMapper]

      val modelGenName = c.freshName("modelGen")
      val tableName    = c.freshName("tableInstance")

      val outputFieldNames = output.members
        .filter { s =>
          s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal
        }
        .map { s =>
          (s, s.name)
        }
        .collect { case (member, TermName(n)) => (member, n.trim) }
        .toList
        .reverse

      /*val tableFieldNames = table.members
        .filter { s =>
          s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod)
        }
        .map { s =>
          (s, s.name)
        }
        .collect { case (member, TermName(n)) => (List(member), n.trim) }
        .toList*/

      val tableFieldNames = fetchTableFields(table)

      def mgDef = q"""val ${TermName(modelGenName)}: $outputModelGen = ${outputModelGen.typeSymbol.companion}.value[$output]"""

      val (fieldsPrepare, _) = outputFieldNames.foldLeft((List.empty[FieldName], 0)) {
        case ((nameList, lawIndex), (member, strName)) =>
          val newLawIndex    = lawIndex + 1
          val usePlaceHolder = tableFieldNames.find { case (s, _) => s == strName }

          val fieldName = FieldName(
              tableFields = usePlaceHolder.map(_._2.members)
            , lawModelMember = member
            , law = strName
            , lawIndex = newLawIndex
            , mapperIndex = newLawIndex
            , needInput = false
            , needSub = false
          )

          ((fieldName :: nameList), newLawIndex)
      }

      @tailrec
      def setCaseClass(treeList: List[Tree]): List[Tree] = {
        if (treeList.size == 1)
          treeList
        else {
          val upper = treeList.grouped(maxNum).toList.map { items =>
            val q =
              q"""
           ${caseClassMapper.typeSymbol.companion}.withData(
                 ..${items.zipWithIndex.flatMap {
                case (field, index) =>
                  val plusIndex = index + 1
                  List(
                      q"""${TermName("data" + plusIndex.toString)} = ${field}"""
                  )
              }}
                 )
          """

            q
          }
          setCaseClass(upper)
        }
      }

      def initSetCaseClass(nameList: List[FieldName]): List[Tree] = {
        nameList.grouped(maxNum).toList.map { item =>
          val q =
            q"""
           ${caseClassMapper.typeSymbol.companion}.withData(
                 ..${item.zipWithIndex.flatMap {
              case (fieldItem, index) =>
                val plusIndex = index + 1
                List(
                    q"""${TermName("data" + plusIndex.toString)} = caseClass.${TermName(fieldItem.law)}"""
                )
            }}
                 )
          """

          q
        }
      }

      def fullSetCaseClass(nameList: List[FieldName]): Tree = setCaseClass(initSetCaseClass(nameList)).head

      val fields = fieldsPrepare

      val q = c.Expr[InputTable[Table, EncoderDataGen.Aux[Output, Rep, TempData]]] {
        q"""
        ${inputTable.typeSymbol.companion}{ ${TermName(tableName)}: ${table} =>
          $mgDef
          ${toRepMapper(fields = fields, tableName = tableName, modelGenName = modelGenName)}
          .dataGenWrap
          .asEncoder[$output] { (caseClass, rep) =>
            ${fullSetCaseClass(fields)}
          }
        }
        """
      }
      //println(q + "\n" + "22" * 100)
      q
    }

  }

}