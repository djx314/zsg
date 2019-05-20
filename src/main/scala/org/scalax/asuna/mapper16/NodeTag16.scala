package org.scalax.asuna.ii.item
class NodeTag16[
    T1 <: org.scalax.asuna.mapper.item.ItemTag
  , T2 <: org.scalax.asuna.mapper.item.ItemTag
  , T3 <: org.scalax.asuna.mapper.item.ItemTag
  , T4 <: org.scalax.asuna.mapper.item.ItemTag
  , T5 <: org.scalax.asuna.mapper.item.ItemTag
  , T6 <: org.scalax.asuna.mapper.item.ItemTag
  , T7 <: org.scalax.asuna.mapper.item.ItemTag
  , T8 <: org.scalax.asuna.mapper.item.ItemTag
  , T9 <: org.scalax.asuna.mapper.item.ItemTag
  , T10 <: org.scalax.asuna.mapper.item.ItemTag
  , T11 <: org.scalax.asuna.mapper.item.ItemTag
  , T12 <: org.scalax.asuna.mapper.item.ItemTag
  , T13 <: org.scalax.asuna.mapper.item.ItemTag
  , T14 <: org.scalax.asuna.mapper.item.ItemTag
  , T15 <: org.scalax.asuna.mapper.item.ItemTag
  , T16 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTag15[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
  override type Sub      = NodeTag16[T1#Sub, T2#Sub, T3#Sub, T4#Sub, T5#Sub, T6#Sub, T7#Sub, T8#Sub, T9#Sub, T10#Sub, T11#Sub, T12#Sub, T13#Sub, T14#Sub, T15#Sub, T16#Sub]
  override type NoMessage = NodeTag16[
      T1#NoMessage
    , T2#NoMessage
    , T3#NoMessage
    , T4#NoMessage
    , T5#NoMessage
    , T6#NoMessage
    , T7#NoMessage
    , T8#NoMessage
    , T9#NoMessage
    , T10#NoMessage
    , T11#NoMessage
    , T12#NoMessage
    , T13#NoMessage
    , T14#NoMessage
    , T15#NoMessage
    , T16#NoMessage
  ]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag16[
      HeadItem#Sub#Pull[I#HeadItem#Sub]
    , TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub]
    , TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub]
    , TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub]
    , TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub]
    , TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub]
    , TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub]
    , TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub]
    , TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
        I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
    , TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
        I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
    , TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
        I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
    , TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
        I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
    , TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
        I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
    , TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
        I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
    , TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
        I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
    , TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
        I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1  = T1#InputMessage[I];
    type Type2  = T2#InputMessage[Type1#Left];
    type Type3  = T3#InputMessage[Type2#Left];
    type Type4  = T4#InputMessage[Type3#Left];
    type Type5  = T5#InputMessage[Type4#Left];
    type Type6  = T6#InputMessage[Type5#Left];
    type Type7  = T7#InputMessage[Type6#Left];
    type Type8  = T8#InputMessage[Type7#Left];
    type Type9  = T9#InputMessage[Type8#Left];
    type Type10 = T10#InputMessage[Type9#Left];
    type Type11 = T11#InputMessage[Type10#Left];
    type Type12 = T12#InputMessage[Type11#Left];
    type Type13 = T13#InputMessage[Type12#Left];
    type Type14 = T14#InputMessage[Type13#Left];
    type Type15 = T15#InputMessage[Type14#Left];
    type Type16 = T16#InputMessage[Type15#Left];
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag16[
        Type1#Result
      , Type2#Result
      , Type3#Result
      , Type4#Result
      , Type5#Result
      , Type6#Result
      , Type7#Result
      , Type8#Result
      , Type9#Result
      , Type10#Result
      , Type11#Result
      , Type12#Result
      , Type13#Result
      , Type14#Result
      , Type15#Result
      , Type16#Result
    ], Type16#Left]
  })#II
  override type XyyItemType = XyyItem16[
      T1#XyyItemType
    , T2#XyyItemType
    , T3#XyyItemType
    , T4#XyyItemType
    , T5#XyyItemType
    , T6#XyyItemType
    , T7#XyyItemType
    , T8#XyyItemType
    , T9#XyyItemType
    , T10#XyyItemType
    , T11#XyyItemType
    , T12#XyyItemType
    , T13#XyyItemType
    , T14#XyyItemType
    , T15#XyyItemType
    , T16#XyyItemType
  ]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
    , I8 <: org.scalax.asuna.mapper.item.TypeParam
    , I9 <: org.scalax.asuna.mapper.item.TypeParam
    , I10 <: org.scalax.asuna.mapper.item.TypeParam
    , I11 <: org.scalax.asuna.mapper.item.TypeParam
    , I12 <: org.scalax.asuna.mapper.item.TypeParam
    , I13 <: org.scalax.asuna.mapper.item.TypeParam
    , I14 <: org.scalax.asuna.mapper.item.TypeParam
    , I15 <: org.scalax.asuna.mapper.item.TypeParam
    , I16 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`]
    , dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`]
    , dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`]
    , dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`]
    , dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`]
    , dapp6: org.scalax.asuna.mapper.item.DebugApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`]
    , dapp7: org.scalax.asuna.mapper.item.DebugApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`]
    , dapp8: org.scalax.asuna.mapper.item.DebugApplication[K, T8, I8, `Application can not load with index 8, please eat xyy.`]
    , dapp9: org.scalax.asuna.mapper.item.DebugApplication[K, T9, I9, `Application can not load with index 9, please eat xyy.`]
    , dapp10: org.scalax.asuna.mapper.item.DebugApplication[K, T10, I10, `Application can not load with index 10, please eat xyy.`]
    , dapp11: org.scalax.asuna.mapper.item.DebugApplication[K, T11, I11, `Application can not load with index 11, please eat xyy.`]
    , dapp12: org.scalax.asuna.mapper.item.DebugApplication[K, T12, I12, `Application can not load with index 12, please eat xyy.`]
    , dapp13: org.scalax.asuna.mapper.item.DebugApplication[K, T13, I13, `Application can not load with index 13, please eat xyy.`]
    , dapp14: org.scalax.asuna.mapper.item.DebugApplication[K, T14, I14, `Application can not load with index 14, please eat xyy.`]
    , dapp15: org.scalax.asuna.mapper.item.DebugApplication[K, T15, I15, `Application can not load with index 15, please eat xyy.`]
    , dapp16: org.scalax.asuna.mapper.item.DebugApplication[K, T16, I16, `Application can not load with index 16, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType16[
      I1
    , I2
    , I3
    , I4
    , I5
    , I6
    , I7
    , I8
    , I9
    , I10
    , I11
    , I12
    , I13
    , I14
    , I15
    , I16
  ]] =
    NodeTag16.appendNodeTagEatXyy16(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11, dapp12, dapp13, dapp14, dapp15, dapp16)
}
object NodeTag16 {
  implicit def appendNodeTagEatXyy16[
      K <: org.scalax.asuna.mapper.item.KindContext
    , H1 <: org.scalax.asuna.mapper.item.ItemTag
    , H2 <: org.scalax.asuna.mapper.item.ItemTag
    , H3 <: org.scalax.asuna.mapper.item.ItemTag
    , H4 <: org.scalax.asuna.mapper.item.ItemTag
    , H5 <: org.scalax.asuna.mapper.item.ItemTag
    , H6 <: org.scalax.asuna.mapper.item.ItemTag
    , H7 <: org.scalax.asuna.mapper.item.ItemTag
    , H8 <: org.scalax.asuna.mapper.item.ItemTag
    , H9 <: org.scalax.asuna.mapper.item.ItemTag
    , H10 <: org.scalax.asuna.mapper.item.ItemTag
    , H11 <: org.scalax.asuna.mapper.item.ItemTag
    , H12 <: org.scalax.asuna.mapper.item.ItemTag
    , H13 <: org.scalax.asuna.mapper.item.ItemTag
    , H14 <: org.scalax.asuna.mapper.item.ItemTag
    , H15 <: org.scalax.asuna.mapper.item.ItemTag
    , H16 <: org.scalax.asuna.mapper.item.ItemTag
    , T1 <: org.scalax.asuna.mapper.item.TypeParam
    , T2 <: org.scalax.asuna.mapper.item.TypeParam
    , T3 <: org.scalax.asuna.mapper.item.TypeParam
    , T4 <: org.scalax.asuna.mapper.item.TypeParam
    , T5 <: org.scalax.asuna.mapper.item.TypeParam
    , T6 <: org.scalax.asuna.mapper.item.TypeParam
    , T7 <: org.scalax.asuna.mapper.item.TypeParam
    , T8 <: org.scalax.asuna.mapper.item.TypeParam
    , T9 <: org.scalax.asuna.mapper.item.TypeParam
    , T10 <: org.scalax.asuna.mapper.item.TypeParam
    , T11 <: org.scalax.asuna.mapper.item.TypeParam
    , T12 <: org.scalax.asuna.mapper.item.TypeParam
    , T13 <: org.scalax.asuna.mapper.item.TypeParam
    , T14 <: org.scalax.asuna.mapper.item.TypeParam
    , T15 <: org.scalax.asuna.mapper.item.TypeParam
    , T16 <: org.scalax.asuna.mapper.item.TypeParam
  ](
      implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1]
    , t2: org.scalax.asuna.mapper.item.Application[K, H2, T2]
    , t3: org.scalax.asuna.mapper.item.Application[K, H3, T3]
    , t4: org.scalax.asuna.mapper.item.Application[K, H4, T4]
    , t5: org.scalax.asuna.mapper.item.Application[K, H5, T5]
    , t6: org.scalax.asuna.mapper.item.Application[K, H6, T6]
    , t7: org.scalax.asuna.mapper.item.Application[K, H7, T7]
    , t8: org.scalax.asuna.mapper.item.Application[K, H8, T8]
    , t9: org.scalax.asuna.mapper.item.Application[K, H9, T9]
    , t10: org.scalax.asuna.mapper.item.Application[K, H10, T10]
    , t11: org.scalax.asuna.mapper.item.Application[K, H11, T11]
    , t12: org.scalax.asuna.mapper.item.Application[K, H12, T12]
    , t13: org.scalax.asuna.mapper.item.Application[K, H13, T13]
    , t14: org.scalax.asuna.mapper.item.Application[K, H14, T14]
    , t15: org.scalax.asuna.mapper.item.Application[K, H15, T15]
    , t16: org.scalax.asuna.mapper.item.Application[K, H16, T16]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag16[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16], EatXyyType16[
      T1
    , T2
    , T3
    , T4
    , T5
    , T6
    , T7
    , T8
    , T9
    , T10
    , T11
    , T12
    , T13
    , T14
    , T15
    , T16
  ]] =
    new org.scalax.asuna.mapper.item.Application[
        K
      , org.scalax.asuna.ii.item.NodeTag16[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16]
      , EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
    ] {
      override def application(
          context: org.scalax.asuna.mapper.item.Context[K]
      ): K#M[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]] = {
        if (context.isReverse) {
          context.append(
              NodeTag15.appendNodeTagEatXyy15(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16).application(context)
            , t1.application(context)
            , ArticleXyyPlus.put16
          )
        } else {
          context.append(
              NodeTag15.appendNodeTagEatXyy15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15).application(context)
            , t16.application(context)
            , ArticleXyyPlus.plus16
          )
        }
      }
    }
}