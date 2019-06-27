package org.scalax.asuna.mapper.item
import org.scalax.asuna.mapper.item.impl._
class ItemTag14[
  T1,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5,
  M5 <: org.scalax.asuna.mapper.item.Message,
  T6,
  M6 <: org.scalax.asuna.mapper.item.Message,
  T7,
  M7 <: org.scalax.asuna.mapper.item.Message,
  T8,
  M8 <: org.scalax.asuna.mapper.item.Message,
  T9,
  M9 <: org.scalax.asuna.mapper.item.Message,
  T10,
  M10 <: org.scalax.asuna.mapper.item.Message,
  T11,
  M11 <: org.scalax.asuna.mapper.item.Message,
  T12,
  M12 <: org.scalax.asuna.mapper.item.Message,
  T13,
  M13 <: org.scalax.asuna.mapper.item.Message,
  T14,
  M14 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type XyyItemType = Item14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
  override type M[M <: org.scalax.asuna.mapper.item.Message] = ItemTag14[
    T1,
    M :-<>-: M1,
    T2,
    M :-<>-: M2,
    T3,
    M :-<>-: M3,
    T4,
    M :-<>-: M4,
    T5,
    M :-<>-: M5,
    T6,
    M :-<>-: M6,
    T7,
    M :-<>-: M7,
    T8,
    M :-<>-: M8,
    T9,
    M :-<>-: M9,
    T10,
    M :-<>-: M10,
    T11,
    M :-<>-: M11,
    T12,
    M :-<>-: M12,
    T13,
    M :-<>-: M13,
    T14,
    M :-<>-: M14
  ]
  def debug[
    K <: org.scalax.asuna.mapper.KindContext,
    I1 <: org.scalax.asuna.mapper.TypeParam,
    I2 <: org.scalax.asuna.mapper.TypeParam,
    I3 <: org.scalax.asuna.mapper.TypeParam,
    I4 <: org.scalax.asuna.mapper.TypeParam,
    I5 <: org.scalax.asuna.mapper.TypeParam,
    I6 <: org.scalax.asuna.mapper.TypeParam,
    I7 <: org.scalax.asuna.mapper.TypeParam,
    I8 <: org.scalax.asuna.mapper.TypeParam,
    I9 <: org.scalax.asuna.mapper.TypeParam,
    I10 <: org.scalax.asuna.mapper.TypeParam,
    I11 <: org.scalax.asuna.mapper.TypeParam,
    I12 <: org.scalax.asuna.mapper.TypeParam,
    I13 <: org.scalax.asuna.mapper.TypeParam,
    I14 <: org.scalax.asuna.mapper.TypeParam
  ](c: org.scalax.asuna.mapper.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugItemApplication[K, T1, I1, M1],
    dapp2: org.scalax.asuna.mapper.DebugItemApplication[K, T2, I2, M2],
    dapp3: org.scalax.asuna.mapper.DebugItemApplication[K, T3, I3, M3],
    dapp4: org.scalax.asuna.mapper.DebugItemApplication[K, T4, I4, M4],
    dapp5: org.scalax.asuna.mapper.DebugItemApplication[K, T5, I5, M5],
    dapp6: org.scalax.asuna.mapper.DebugItemApplication[K, T6, I6, M6],
    dapp7: org.scalax.asuna.mapper.DebugItemApplication[K, T7, I7, M7],
    dapp8: org.scalax.asuna.mapper.DebugItemApplication[K, T8, I8, M8],
    dapp9: org.scalax.asuna.mapper.DebugItemApplication[K, T9, I9, M9],
    dapp10: org.scalax.asuna.mapper.DebugItemApplication[K, T10, I10, M10],
    dapp11: org.scalax.asuna.mapper.DebugItemApplication[K, T11, I11, M11],
    dapp12: org.scalax.asuna.mapper.DebugItemApplication[K, T12, I12, M12],
    dapp13: org.scalax.asuna.mapper.DebugItemApplication[K, T13, I13, M13],
    dapp14: org.scalax.asuna.mapper.DebugItemApplication[K, T14, I14, M14]
  ): org.scalax.asuna.mapper.Application[
    K,
    org.scalax.asuna.mapper.item.ItemTag14[T1, M1, T2, M2, T3, M3, T4, M4, T5, M5, T6, M6, T7, M7, T8, M8, T9, M9, T10, M10, T11, M11, T12, M12, T13, M13, T14, M14],
    EatXyyType14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]
  ] =
    ItemTag14.appendEatXyy14(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11, dapp12, dapp13, dapp14)
}
object ItemTag14 {
  implicit def appendEatXyy14[
    K <: org.scalax.asuna.mapper.KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    M1 <: org.scalax.asuna.mapper.item.Message,
    M2 <: org.scalax.asuna.mapper.item.Message,
    M3 <: org.scalax.asuna.mapper.item.Message,
    M4 <: org.scalax.asuna.mapper.item.Message,
    M5 <: org.scalax.asuna.mapper.item.Message,
    M6 <: org.scalax.asuna.mapper.item.Message,
    M7 <: org.scalax.asuna.mapper.item.Message,
    M8 <: org.scalax.asuna.mapper.item.Message,
    M9 <: org.scalax.asuna.mapper.item.Message,
    M10 <: org.scalax.asuna.mapper.item.Message,
    M11 <: org.scalax.asuna.mapper.item.Message,
    M12 <: org.scalax.asuna.mapper.item.Message,
    M13 <: org.scalax.asuna.mapper.item.Message,
    M14 <: org.scalax.asuna.mapper.item.Message
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.Application[K, H14, T14]
  ): org.scalax.asuna.mapper.Application[
    K,
    org.scalax.asuna.mapper.item.ItemTag14[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7, H8, M8, H9, M9, H10, M10, H11, M11, H12, M12, H13, M13, H14, M14],
    EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
  ] =
    new org.scalax.asuna.mapper.Application[
      K,
      org.scalax.asuna.mapper.item.ItemTag14[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7, H8, M8, H9, M9, H10, M10, H11, M11, H12, M12, H13, M13, H14, M14],
      EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
    ] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] = {
        if (context.isReverse) {
          context.append(
            ItemTag13.appendEatXyy13(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14).application(context),
            t1.application(context),
            ArticleXyyPlus14.put14
          )
        } else {
          context.append(
            ItemTag13.appendEatXyy13(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13).application(context),
            t14.application(context),
            ArticleXyyPlus14.plus14
          )
        }
      }
    }
}
