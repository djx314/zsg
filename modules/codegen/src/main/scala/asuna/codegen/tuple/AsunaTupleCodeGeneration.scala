package asuna.codegen.tuple

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source

object AsunaTupleCodeGeneration {
  val maxPropertyNum = 8

  def main(i: Array[String]): Unit = {
    val maxTupleNum = 22
    val rootDir =
      Paths.get("./").resolve("modules").resolve("scala-tuple").resolve("src").resolve("main").resolve("scala").resolve("asuna").resolve("tuple").resolve("codegen")
    val supportDir =
      rootDir.resolve("tupleSupport")

    {
      val filePath = rootDir.resolve("ScalaTupleTypeHList.scala")
      Files.createDirectories(filePath.getParent)
      val writer          = new PrintWriter(filePath.toFile, "utf-8")
      val content         = Source.fromString(asuna.codegen.scala_tuple.txt.ScalaTupleTypeHList(maxItem = maxTupleNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val mkStringContent = content.mkString(System.lineSeparator)
      writer.println(mkStringContent)
      writer.close()
    }

    {
      val filePath = supportDir.resolve("ScalaTupleHListTypeHList.scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val content =
        Source
          .fromString(asuna.codegen.scala_tuple.support.txt.ScalaTupleHListTypeHList(maxItem = maxTupleNum - 1).body)
          .getLines
          .toList
          .map(_.trim)
          .filter(s => !s.isEmpty)
      val mkStringContent = content.mkString(System.lineSeparator)
      writer.println(mkStringContent)
      writer.close()
    }

    /*{
      val filePath = supportDir.resolve("ScalaTupleHListTypeHListPlus.scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val content =
        Source
          .fromString(asuna.codegen.scala_tuple.support.txt.ScalaTupleHListTypeHListPlus(maxNum = maxTupleNum - 1).body)
          .getLines
          .toList
          .map(_.trim)
          .filter(s => !s.isEmpty)
      val mkStringContent = content.mkString(System.lineSeparator)
      writer.println(mkStringContent)
      writer.close()
    }*/

    for (i <- 1 to maxPropertyNum - 1) yield {
      val filePath = rootDir.resolve("mapper" + i).resolve("HListPlus" + i + ".scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val content =
        Source.fromString(asuna.codegen.scala_tuple.txt.PlusX(tagNum = i, maxAsunaTupleNum = 22).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val linerContent = content.mkString(System.lineSeparator)
      writer.println(linerContent)
      writer.close()
    }

    {
      val filePath = supportDir.resolve("HListToScalaTupleTypeHListPlus.scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val content =
        Source
          .fromString(asuna.codegen.scala_tuple.support.txt.HListToScalaTupleTypeHListPlus(maxNum = maxTupleNum).body)
          .getLines
          .toList
          .map(_.trim)
          .filter(s => !s.isEmpty)
      val mkStringContent = content.mkString(System.lineSeparator)
      writer.println(mkStringContent)
      writer.close()
    }

    {
      val filePath = rootDir.resolve("ScalaTupleImplicits.scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val content =
        Source.fromString(asuna.codegen.scala_tuple.txt.ScalaTupleImplicits(maxNum = maxTupleNum).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val mkStringContent = content.mkString(System.lineSeparator)
      writer.println(mkStringContent)
      writer.close()
    }

    {
      val filePath = rootDir.resolve("TypeHList.scala")
      Files.createDirectories(filePath.getParent)
      val writer = new PrintWriter(filePath.toFile, "utf-8")
      val content =
        Source.fromString(asuna.codegen.scala_tuple.txt.TypeHList(maxItem = 8).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val mkStringContent = content.mkString(System.lineSeparator)
      writer.println(mkStringContent)
      writer.close()
    }

  }
}
