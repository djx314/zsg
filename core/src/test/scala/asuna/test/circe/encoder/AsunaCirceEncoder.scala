package asuna.test

import asuna.{Application, Context, Item0, ItemTag, KindContext, Plus, TypeHList}
import asuna.macros.{AsunaGeneric, AsunaGetterGeneric, AsunaLabelledGeneric}
import io.circe.{Encoder, Json, JsonObject}

object AsunaCirceEncoder {

  def encoder[H, R <: ItemTag, I <: TypeHList](
    implicit ll: AsunaGeneric.Aux[H, R],
    app: Application[KContext, R, I],
    cv1: AsunaLabelledGeneric[H, I#H],
    cv2: AsunaGetterGeneric[H, I#T#H]
  ): Encoder.AsObject[H] = {
    val names = cv1.names.withContext(ii)
    Encoder.AsObject.instance { o: H =>
      JsonObject.fromIterable(app.application(ii).p(cv2.getter(o).withContext(ii), names, List.empty))
    }
  }

  def caseObjectEncoder[T]: Encoder.AsObject[T] = Encoder.AsObject.instance(f => JsonObject.empty)

  trait JsonEncoder[T, II] {
    def p(obj: T, name: II, m: List[(String, Json)]): List[(String, Json)]
  }

  class KContext extends KindContext {
    override type M[P <: TypeHList] = JsonEncoder[P#T#H, P#H]
  }

  object ii extends Context[KContext] {
    override def isReverse: Boolean = false

    override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
      x: JsonEncoder[X#T#H, X#H],
      y: JsonEncoder[Y#T#H, Y#H],
      plus: Plus[X, Y, Z]
    ): JsonEncoder[Z#T#H, Z#H] = new JsonEncoder[Z#T#H, Z#H] {
      override def p(obj: Z#T#H, name: Z#H, m: List[(String, Json)]): List[(String, Json)] =
        x.p(plus.sub.takeHead(obj), plus.takeHead(name), y.p(plus.sub.takeTail(obj), plus.takeTail(name), m))
    }

    override def start: JsonEncoder[Item0, Item0] = new JsonEncoder[Item0, Item0] {
      override def p(name: Item0, obj: Item0, m: List[(String, Json)]): List[(String, Json)] = m
    }
  }

  //编译期调试辅助函数开始
  def initEncoder[H]: ImplicitApply1[H] = new ImplicitApply1[H] {
    def asunaGeneric[R <: ItemTag](implicit ll: AsunaGeneric.Aux[H, R]): ImplicitApply2[H, R] = new ImplicitApply2[H, R] {
      override def encoder[I <: TypeHList](
        implicit
        app: Application[KContext, R, I],
        cv1: AsunaLabelledGeneric[H, I#H],
        cv2: AsunaGetterGeneric[H, I#T#H]
      ): Encoder.AsObject[H] = {
        Encoder.AsObject.instance { o: H =>
          JsonObject.fromIterable(app.application(ii).p(cv2.getter(o).withContext(ii), cv1.names.withContext(ii), List.empty))
        }
      }
    }
  }

  trait ImplicitApply1[H] {
    def asunaGeneric[R <: ItemTag](implicit ll: AsunaGeneric.Aux[H, R]): ImplicitApply2[H, R]
  }

  trait ImplicitApply2[H, R <: ItemTag] {
    def encoder[I <: TypeHList](
      implicit
      app: Application[KContext, R, I],
      cv1: AsunaLabelledGeneric[H, I#H],
      cv2: AsunaGetterGeneric[H, I#T#H]
    ): Encoder.AsObject[H]

    def toTag: R = throw new Exception("123")
    def toIH[I <: TypeHList](
      implicit
      app: Application[KContext, R, I]
    ): I#H = throw new Exception("123")
  }
  //编译期调试辅助函数结束

}
