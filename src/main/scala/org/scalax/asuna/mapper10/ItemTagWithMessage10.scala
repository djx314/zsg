package org.scalax.asuna.mapper.item
class ItemTagWithMessage10[
  T1,
  Message1 <: org.scalax.asuna.mapper.item.Message,
  T2,
  Message2 <: org.scalax.asuna.mapper.item.Message,
  T3,
  Message3 <: org.scalax.asuna.mapper.item.Message,
  T4,
  Message4 <: org.scalax.asuna.mapper.item.Message,
  T5,
  Message5 <: org.scalax.asuna.mapper.item.Message,
  T6,
  Message6 <: org.scalax.asuna.mapper.item.Message,
  T7,
  Message7 <: org.scalax.asuna.mapper.item.Message,
  T8,
  Message8 <: org.scalax.asuna.mapper.item.Message,
  T9,
  Message9 <: org.scalax.asuna.mapper.item.Message,
  T10,
  Message10 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type XyyItemType = XyyItem10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage10[
    T1,
    I#HeadItem,
    T2,
    I#TailItem#HeadItem,
    T3,
    I#TailItem#TailItem#HeadItem,
    T4,
    I#TailItem#TailItem#TailItem#HeadItem,
    T5,
    I#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T6,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T7,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T8,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T9,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T10,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
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
    I10 <: org.scalax.asuna.mapper.TypeParam
  ](c: org.scalax.asuna.mapper.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugItemApplication[K, T1, I1, Message1],
    dapp2: org.scalax.asuna.mapper.DebugItemApplication[K, T2, I2, Message2],
    dapp3: org.scalax.asuna.mapper.DebugItemApplication[K, T3, I3, Message3],
    dapp4: org.scalax.asuna.mapper.DebugItemApplication[K, T4, I4, Message4],
    dapp5: org.scalax.asuna.mapper.DebugItemApplication[K, T5, I5, Message5],
    dapp6: org.scalax.asuna.mapper.DebugItemApplication[K, T6, I6, Message6],
    dapp7: org.scalax.asuna.mapper.DebugItemApplication[K, T7, I7, Message7],
    dapp8: org.scalax.asuna.mapper.DebugItemApplication[K, T8, I8, Message8],
    dapp9: org.scalax.asuna.mapper.DebugItemApplication[K, T9, I9, Message9],
    dapp10: org.scalax.asuna.mapper.DebugItemApplication[K, T10, I10, Message10]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], EatXyyType10[
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8,
    I9,
    I10
  ]] =
    ItemTag10.appendEatXyy10(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10)
}
object ItemTagWithMessage10 {
  implicit def appendEatXyy10[
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
    Message1 <: org.scalax.asuna.mapper.item.Message,
    Message2 <: org.scalax.asuna.mapper.item.Message,
    Message3 <: org.scalax.asuna.mapper.item.Message,
    Message4 <: org.scalax.asuna.mapper.item.Message,
    Message5 <: org.scalax.asuna.mapper.item.Message,
    Message6 <: org.scalax.asuna.mapper.item.Message,
    Message7 <: org.scalax.asuna.mapper.item.Message,
    Message8 <: org.scalax.asuna.mapper.item.Message,
    Message9 <: org.scalax.asuna.mapper.item.Message,
    Message10 <: org.scalax.asuna.mapper.item.Message,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam
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
    t10: org.scalax.asuna.mapper.Application[K, H10, T10]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTagWithMessage10[
    H1,
    Message1,
    H2,
    Message2,
    H3,
    Message3,
    H4,
    Message4,
    H5,
    Message5,
    H6,
    Message6,
    H7,
    Message7,
    H8,
    Message8,
    H9,
    Message9,
    H10,
    Message10
  ], EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTagWithMessage10[
      H1,
      Message1,
      H2,
      Message2,
      H3,
      Message3,
      H4,
      Message4,
      H5,
      Message5,
      H6,
      Message6,
      H7,
      Message7,
      H8,
      Message8,
      H9,
      Message9,
      H10,
      Message10
    ], EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = {
        if (context.isReverse) {
          context.append(ItemTag9.appendEatXyy9(t2, t3, t4, t5, t6, t7, t8, t9, t10).application(context), t1.application(context), ArticleXyyPlus10.put10)
        } else {
          context.append(ItemTag9.appendEatXyy9(t1, t2, t3, t4, t5, t6, t7, t8, t9).application(context), t10.application(context), ArticleXyyPlus10.plus10)
        }
      }
    }
}
