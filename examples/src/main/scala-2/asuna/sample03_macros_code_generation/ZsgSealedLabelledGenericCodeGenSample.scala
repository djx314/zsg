package zsg.sample03_macros_code_generation

import zsg._
import zsg.macros.single.ZsgSealedLabelledGeneric

object ZsgSealedLabelledGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult: ZsgSealedLabelledGeneric[Foo, NodeTuple2[ZsgTuple2[String, String], ZsgTuple2[String, String]]] =
    ZsgSealedLabelledGeneric.value(BuildContent.nodeTuple2(BuildContent.tuple2("Bar1", "Bar2"), BuildContent.tuple2("Bar3", "Bar4")))

  sameType(implicitly[ZsgSealedLabelledGeneric[Foo, NodeTuple2[ZsgTuple2[String, String], ZsgTuple2[String, String]]]], genResult)

}