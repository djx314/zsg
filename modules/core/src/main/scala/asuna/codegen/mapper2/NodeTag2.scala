package asuna
import asuna.support.TypeHListPlus1
import asuna.support.TypeHListPlus2
import scala.language.higherKinds
import impl._
final class NodeTag2[T1 <: TupleTag, M1 <: Message, T2 <: TupleTag, M2 <: Message] extends TupleTag {
  override final type M[M <: Message] = NodeTag2[T1, M :-<>-: M1, T2, M :-<>-: M2]
  def find0: T1#M[`Number： 0`] = throw new Exception("debugging...")
  def find1: T2#M[`Number： 1`] = throw new Exception("debugging...")
  def debug[K <: KindContext, I1 <: TypeHList, I2 <: TypeHList](c: Context[K])(
    implicit
    dapp1: DebugApplication[K, T1, I1, `Message： Please change .debug(context) to .find0.debug(context).`],
    dapp2: DebugApplication[K, T2, I2, `Message： Please change .debug(context) to .find1.debug(context).`]
  ): Application[K, NodeTag2[T1, M1, T2, M2], TupleTypeHList2[I1, I2]] =
    NodeTag2.noteTagApplicationImplicit2(dapp1, dapp2)
}
final object NodeTag2 {
  final implicit def noteTagApplicationImplicit2[K <: KindContext, H1 <: TupleTag, H2 <: TupleTag, T1 <: TypeHList, M1 <: Message, T2 <: TypeHList, M2 <: Message](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2]
  ): Application[K, NodeTag2[H1, M1, H2, M2], TupleTypeHList2[T1, T2]] = { context =>
    context.append[TupleTypeHList1[T2], T1, TupleTypeHList2[T1, T2]](
      context.append[TupleTypeHList0, T2, TupleTypeHList1[T2]](context.start, t2.application(context), TypeHListPlus1.plus1),
      t1.application(context),
      TypeHListPlus2.plus2
    )
  }
  implicit def noteTagApplicationImplicit_tagNum2_typeParamNum1[
    F[_],
    H1 <: TupleTag,
    H2 <: TupleTag,
    M1 <: Message,
    M2 <: Message,
    X1_C1,
    X2_C1
  ](
    implicit
    t1: Application1[F, H1, X1_C1],
    t2: Application1[F, H2, X2_C1]
  ): Application1[F, NodeTag2[H1, M1, H2, M2], AsunaTuple2[X1_C1, X2_C1]] = { context: Context1[F] =>
    context.append(context.append(context.start, t2.application(context))(Plus1.plusWithTypeParameter0), t1.application(context))(Plus1.plusWithTypeParameter1)
  }
  implicit def noteTagApplicationImplicit_tagNum2_typeParamNum2[
    F[_, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    M1 <: Message,
    M2 <: Message,
    X1_C1,
    X1_C2,
    X2_C1,
    X2_C2
  ](
    implicit
    t1: Application2[F, H1, X1_C1, X1_C2],
    t2: Application2[F, H2, X2_C1, X2_C2]
  ): Application2[F, NodeTag2[H1, M1, H2, M2], AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2]] = { context: Context2[F] =>
    context.append(context.append(context.start, t2.application(context))(Plus2.plusWithTypeParameter0), t1.application(context))(Plus2.plusWithTypeParameter1)
  }
  implicit def noteTagApplicationImplicit_tagNum2_typeParamNum3[
    F[_, _, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    M1 <: Message,
    M2 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X2_C1,
    X2_C2,
    X2_C3
  ](
    implicit
    t1: Application3[F, H1, X1_C1, X1_C2, X1_C3],
    t2: Application3[F, H2, X2_C1, X2_C2, X2_C3]
  ): Application3[F, NodeTag2[H1, M1, H2, M2], AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3]] = { context: Context3[F] =>
    context.append(context.append(context.start, t2.application(context))(Plus3.plusWithTypeParameter0), t1.application(context))(Plus3.plusWithTypeParameter1)
  }
  implicit def noteTagApplicationImplicit_tagNum2_typeParamNum4[
    F[_, _, _, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    M1 <: Message,
    M2 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4
  ](
    implicit
    t1: Application4[F, H1, X1_C1, X1_C2, X1_C3, X1_C4],
    t2: Application4[F, H2, X2_C1, X2_C2, X2_C3, X2_C4]
  ): Application4[F, NodeTag2[H1, M1, H2, M2], AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3], AsunaTuple2[X1_C4, X2_C4]] = {
    context: Context4[F] =>
      context.append(context.append(context.start, t2.application(context))(Plus4.plusWithTypeParameter0), t1.application(context))(Plus4.plusWithTypeParameter1)
  }
  implicit def noteTagApplicationImplicit_tagNum2_typeParamNum5[
    F[_, _, _, _, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    M1 <: Message,
    M2 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4,
    X2_C5
  ](
    implicit
    t1: Application5[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5],
    t2: Application5[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5]
  ): Application5[F, NodeTag2[H1, M1, H2, M2], AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3], AsunaTuple2[X1_C4, X2_C4], AsunaTuple2[
    X1_C5,
    X2_C5
  ]] = { context: Context5[F] =>
    context.append(context.append(context.start, t2.application(context))(Plus5.plusWithTypeParameter0), t1.application(context))(Plus5.plusWithTypeParameter1)
  }
  implicit def noteTagApplicationImplicit_tagNum2_typeParamNum6[
    F[_, _, _, _, _, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    M1 <: Message,
    M2 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X1_C6,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4,
    X2_C5,
    X2_C6
  ](
    implicit
    t1: Application6[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6],
    t2: Application6[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6]
  ): Application6[F, NodeTag2[H1, M1, H2, M2], AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3], AsunaTuple2[X1_C4, X2_C4], AsunaTuple2[
    X1_C5,
    X2_C5
  ], AsunaTuple2[X1_C6, X2_C6]] = { context: Context6[F] =>
    context.append(context.append(context.start, t2.application(context))(Plus6.plusWithTypeParameter0), t1.application(context))(Plus6.plusWithTypeParameter1)
  }
  implicit def noteTagApplicationImplicit_tagNum2_typeParamNum7[
    F[_, _, _, _, _, _, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    M1 <: Message,
    M2 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X1_C6,
    X1_C7,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4,
    X2_C5,
    X2_C6,
    X2_C7
  ](
    implicit
    t1: Application7[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7],
    t2: Application7[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7]
  ): Application7[F, NodeTag2[H1, M1, H2, M2], AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3], AsunaTuple2[X1_C4, X2_C4], AsunaTuple2[
    X1_C5,
    X2_C5
  ], AsunaTuple2[X1_C6, X2_C6], AsunaTuple2[X1_C7, X2_C7]] = { context: Context7[F] =>
    context.append(context.append(context.start, t2.application(context))(Plus7.plusWithTypeParameter0), t1.application(context))(Plus7.plusWithTypeParameter1)
  }
  implicit def noteTagApplicationImplicit_tagNum2_typeParamNum8[
    F[_, _, _, _, _, _, _, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    M1 <: Message,
    M2 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X1_C6,
    X1_C7,
    X1_C8,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4,
    X2_C5,
    X2_C6,
    X2_C7,
    X2_C8
  ](
    implicit
    t1: Application8[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8],
    t2: Application8[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8]
  ): Application8[F, NodeTag2[H1, M1, H2, M2], AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3], AsunaTuple2[X1_C4, X2_C4], AsunaTuple2[
    X1_C5,
    X2_C5
  ], AsunaTuple2[X1_C6, X2_C6], AsunaTuple2[X1_C7, X2_C7], AsunaTuple2[X1_C8, X2_C8]] = { context: Context8[F] =>
    context.append(context.append(context.start, t2.application(context))(Plus8.plusWithTypeParameter0), t1.application(context))(Plus8.plusWithTypeParameter1)
  }
}
