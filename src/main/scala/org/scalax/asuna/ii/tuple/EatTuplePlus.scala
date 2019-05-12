package org.scalax.asuna.ii.item
object ArticleXyyTuplePlus {
  def miaomiaomiao1[T0 <: EatXyyType0, T1 <: org.scalax.asuna.mapper.item.TypeParam]: org.scalax.asuna.mapper.item.Plus[T0, T1, XyyTupleType1[T1]] =
    new org.scalax.asuna.mapper.item.Plus[T0, T1, XyyTupleType1[T1]] {
      override def plus(p: T0#H, item: T1#H): Tuple1[T1#H]                                 = ArticleXyy0.eatToTuple(item)
      override def takeHead(t: Tuple1[T1#H]): T1#H                                         = t._1
      override def takeTail(t: Tuple1[T1#H]): T0#H                                         = ArticleXyy0
      override def sub: org.scalax.asuna.mapper.item.Plus[T0#T, T1#T, XyyTupleType1[T1#T]] = miaomiaomiao1[T0#T, T1#T]
    }
  def miaomiaomiao2[T0 <: EatXyyType0, T1 <: org.scalax.asuna.mapper.item.TypeParam]: org.scalax.asuna.mapper.item.Plus[T0, T1, XyyTupleType1[T1]] =
    new org.scalax.asuna.mapper.item.Plus[T0, T1, XyyTupleType1[T1]] {
      override def plus(p: T0#H, item: T1#H): Tuple1[T1#H]                                 = ArticleXyyReverse0.pudaoToTuple(item)
      override def takeHead(t: Tuple1[T1#H]): T1#H                                         = t._1
      override def takeTail(t: Tuple1[T1#H]): T0#H                                         = ArticleXyyReverse0
      override def sub: org.scalax.asuna.mapper.item.Plus[T0#T, T1#T, XyyTupleType1[T1#T]] = miaomiaomiao2[T0#T, T1#T]
    }
  def miaomiaomiao3[T0 <: EatXyyType0, T1 <: org.scalax.asuna.mapper.item.TypeParam]: org.scalax.asuna.mapper.item.Plus[T0, T1, XyyTupleType1[T1]] =
    new org.scalax.asuna.mapper.item.Plus[T0, T1, XyyTupleType1[T1]] {
      override def plus(p: T0#H, item: T1#H): Tuple1[T1#H]                                 = Item2Xyy0.eatToTuple(item)
      override def takeHead(t: Tuple1[T1#H]): T1#H                                         = t._1
      override def takeTail(t: Tuple1[T1#H]): T0#H                                         = Item2Xyy0
      override def sub: org.scalax.asuna.mapper.item.Plus[T0#T, T1#T, XyyTupleType1[T1#T]] = miaomiaomiao3[T0#T, T1#T]
    }
  def miaomiaomiao4[T0 <: EatXyyType0, T1 <: org.scalax.asuna.mapper.item.TypeParam]: org.scalax.asuna.mapper.item.Plus[T0, T1, XyyTupleType1[T1]] =
    new org.scalax.asuna.mapper.item.Plus[T0, T1, XyyTupleType1[T1]] {
      override def plus(p: T0#H, item: T1#H): Tuple1[T1#H]                                 = Item2XyyReverse0.pudaoToTuple(item)
      override def takeHead(t: Tuple1[T1#H]): T1#H                                         = t._1
      override def takeTail(t: Tuple1[T1#H]): T0#H                                         = Item2XyyReverse0
      override def sub: org.scalax.asuna.mapper.item.Plus[T0#T, T1#T, XyyTupleType1[T1#T]] = miaomiaomiao4[T0#T, T1#T]
    }
  def hlistPlus1[T1 <: org.scalax.asuna.mapper.item.TypeParam] = miaomiaomiao1[EatXyyType0, T1]
  def hlistPut1[T1 <: org.scalax.asuna.mapper.item.TypeParam]  = miaomiaomiao2[EatXyyType0, T1]
  def item2Plus1[T1 <: org.scalax.asuna.mapper.item.TypeParam] = miaomiaomiao3[EatXyyType0, T1]
  def item2Put1[T1 <: org.scalax.asuna.mapper.item.TypeParam]  = miaomiaomiao4[EatXyyType0, T1]
  def hlistPlus2[T1 <: org.scalax.asuna.mapper.item.TypeParam, T2 <: org.scalax.asuna.mapper.item.TypeParam]
    : org.scalax.asuna.mapper.item.Plus[EatXyyType1[T1], T2, XyyTupleType2[T1, T2]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType1[T1], T2, XyyTupleType2[T1, T2]] {
      override def plus(p: XyyItem1[T1#H], item: T2#H): Tuple2[T1#H, T2#H]                                  = p.eatToTuple(item)
      override def takeHead(t: Tuple2[T1#H, T2#H]): T2#H                                                    = t._2
      override def takeTail(t: Tuple2[T1#H, T2#H]): XyyItem1[T1#H]                                          = ArticleXyy0.eat(t._1)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType1[T1]#T, T2#T, XyyTupleType2[T1, T2]#T] = hlistPlus2[T1#T, T2#T]
    }
  def hlistPut2[T1 <: org.scalax.asuna.mapper.item.TypeParam, T2 <: org.scalax.asuna.mapper.item.TypeParam]
    : org.scalax.asuna.mapper.item.Plus[EatXyyType1[T1], T2, XyyTupleType2[T2, T1]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType1[T1], T2, XyyTupleType2[T2, T1]] {
      override def plus(p: XyyItem1[T1#H], item: T2#H): Tuple2[T2#H, T1#H]                                  = p.pudaoToTuple(item)
      override def takeHead(t: Tuple2[T2#H, T1#H]): T2#H                                                    = t._1
      override def takeTail(t: Tuple2[T2#H, T1#H]): XyyItem1[T1#H]                                          = ArticleXyyReverse0.pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType1[T1]#T, T2#T, XyyTupleType2[T2, T1]#T] = hlistPut2[T1#T, T2#T]
    }
  def item2Plus2[T1 <: org.scalax.asuna.mapper.item.TypeParam, T2 <: org.scalax.asuna.mapper.item.TypeParam]
    : org.scalax.asuna.mapper.item.Plus[EatXyyType1[T1], T2, XyyTupleType2[T1, T2]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType1[T1], T2, XyyTupleType2[T1, T2]] {
      override def plus(p: XyyItem1[T1#H], item: T2#H): Tuple2[T1#H, T2#H]                                  = p.eatToTuple(item)
      override def takeHead(t: Tuple2[T1#H, T2#H]): T2#H                                                    = t._2
      override def takeTail(t: Tuple2[T1#H, T2#H]): XyyItem1[T1#H]                                          = Item2Xyy0.eat(t._1)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType1[T1]#T, T2#T, XyyTupleType2[T1, T2]#T] = item2Plus2[T1#T, T2#T]
    }
  def item2Put2[T1 <: org.scalax.asuna.mapper.item.TypeParam, T2 <: org.scalax.asuna.mapper.item.TypeParam]
    : org.scalax.asuna.mapper.item.Plus[EatXyyType1[T1], T2, XyyTupleType2[T2, T1]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType1[T1], T2, XyyTupleType2[T2, T1]] {
      override def plus(p: XyyItem1[T1#H], item: T2#H): Tuple2[T2#H, T1#H]                                  = p.pudaoToTuple(item)
      override def takeHead(t: Tuple2[T2#H, T1#H]): T2#H                                                    = t._1
      override def takeTail(t: Tuple2[T2#H, T1#H]): XyyItem1[T1#H]                                          = Item2XyyReverse0.pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType1[T1]#T, T2#T, XyyTupleType2[T2, T1]#T] = item2Put2[T1#T, T2#T]
    }
  def hlistPlus3[T1 <: org.scalax.asuna.mapper.item.TypeParam, T2 <: org.scalax.asuna.mapper.item.TypeParam, T3 <: org.scalax.asuna.mapper.item.TypeParam]
    : org.scalax.asuna.mapper.item.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T1, T2, T3]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T1, T2, T3]] {
      override def plus(p: XyyItem2[T1#H, T2#H], item: T3#H): Tuple3[T1#H, T2#H, T3#H]                              = p.eatToTuple(item)
      override def takeHead(t: Tuple3[T1#H, T2#H, T3#H]): T3#H                                                      = t._3
      override def takeTail(t: Tuple3[T1#H, T2#H, T3#H]): XyyItem2[T1#H, T2#H]                                      = ArticleXyy0.eat(t._1).eat(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType2[T1, T2]#T, T3#T, XyyTupleType3[T1, T2, T3]#T] = hlistPlus3[T1#T, T2#T, T3#T]
    }
  def hlistPut3[T1 <: org.scalax.asuna.mapper.item.TypeParam, T2 <: org.scalax.asuna.mapper.item.TypeParam, T3 <: org.scalax.asuna.mapper.item.TypeParam]
    : org.scalax.asuna.mapper.item.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T3, T1, T2]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T3, T1, T2]] {
      override def plus(p: XyyItem2[T1#H, T2#H], item: T3#H): Tuple3[T3#H, T1#H, T2#H]                              = p.pudaoToTuple(item)
      override def takeHead(t: Tuple3[T3#H, T1#H, T2#H]): T3#H                                                      = t._1
      override def takeTail(t: Tuple3[T3#H, T1#H, T2#H]): XyyItem2[T1#H, T2#H]                                      = ArticleXyyReverse0.pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType2[T1, T2]#T, T3#T, XyyTupleType3[T3, T1, T2]#T] = hlistPut3[T1#T, T2#T, T3#T]
    }
  def item2Plus3[T1 <: org.scalax.asuna.mapper.item.TypeParam, T2 <: org.scalax.asuna.mapper.item.TypeParam, T3 <: org.scalax.asuna.mapper.item.TypeParam]
    : org.scalax.asuna.mapper.item.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T1, T2, T3]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T1, T2, T3]] {
      override def plus(p: XyyItem2[T1#H, T2#H], item: T3#H): Tuple3[T1#H, T2#H, T3#H]                              = p.eatToTuple(item)
      override def takeHead(t: Tuple3[T1#H, T2#H, T3#H]): T3#H                                                      = t._3
      override def takeTail(t: Tuple3[T1#H, T2#H, T3#H]): XyyItem2[T1#H, T2#H]                                      = Item2Xyy0.eat(t._1).eat(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType2[T1, T2]#T, T3#T, XyyTupleType3[T1, T2, T3]#T] = item2Plus3[T1#T, T2#T, T3#T]
    }
  def item2Put3[T1 <: org.scalax.asuna.mapper.item.TypeParam, T2 <: org.scalax.asuna.mapper.item.TypeParam, T3 <: org.scalax.asuna.mapper.item.TypeParam]
    : org.scalax.asuna.mapper.item.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T3, T1, T2]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T3, T1, T2]] {
      override def plus(p: XyyItem2[T1#H, T2#H], item: T3#H): Tuple3[T3#H, T1#H, T2#H]                              = p.pudaoToTuple(item)
      override def takeHead(t: Tuple3[T3#H, T1#H, T2#H]): T3#H                                                      = t._1
      override def takeTail(t: Tuple3[T3#H, T1#H, T2#H]): XyyItem2[T1#H, T2#H]                                      = Item2XyyReverse0.pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType2[T1, T2]#T, T3#T, XyyTupleType3[T3, T1, T2]#T] = item2Put3[T1#T, T2#T, T3#T]
    }
  def hlistPlus4[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T1, T2, T3, T4]] {
      override def plus(p: XyyItem3[T1#H, T2#H, T3#H], item: T4#H): Tuple4[T1#H, T2#H, T3#H, T4#H]                          = p.eatToTuple(item)
      override def takeHead(t: Tuple4[T1#H, T2#H, T3#H, T4#H]): T4#H                                                        = t._4
      override def takeTail(t: Tuple4[T1#H, T2#H, T3#H, T4#H]): XyyItem3[T1#H, T2#H, T3#H]                                  = ArticleXyy0.eat(t._1).eat(t._2).eat(t._3)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType3[T1, T2, T3]#T, T4#T, XyyTupleType4[T1, T2, T3, T4]#T] = hlistPlus4[T1#T, T2#T, T3#T, T4#T]
    }
  def hlistPut4[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T4, T1, T2, T3]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T4, T1, T2, T3]] {
      override def plus(p: XyyItem3[T1#H, T2#H, T3#H], item: T4#H): Tuple4[T4#H, T1#H, T2#H, T3#H]                          = p.pudaoToTuple(item)
      override def takeHead(t: Tuple4[T4#H, T1#H, T2#H, T3#H]): T4#H                                                        = t._1
      override def takeTail(t: Tuple4[T4#H, T1#H, T2#H, T3#H]): XyyItem3[T1#H, T2#H, T3#H]                                  = ArticleXyyReverse0.pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType3[T1, T2, T3]#T, T4#T, XyyTupleType4[T4, T1, T2, T3]#T] = hlistPut4[T1#T, T2#T, T3#T, T4#T]
    }
  def item2Plus4[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T1, T2, T3, T4]] {
      override def plus(p: XyyItem3[T1#H, T2#H, T3#H], item: T4#H): Tuple4[T1#H, T2#H, T3#H, T4#H]                          = p.eatToTuple(item)
      override def takeHead(t: Tuple4[T1#H, T2#H, T3#H, T4#H]): T4#H                                                        = t._4
      override def takeTail(t: Tuple4[T1#H, T2#H, T3#H, T4#H]): XyyItem3[T1#H, T2#H, T3#H]                                  = Item2Xyy0.eat(t._1).eat(t._2).eat(t._3)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType3[T1, T2, T3]#T, T4#T, XyyTupleType4[T1, T2, T3, T4]#T] = item2Plus4[T1#T, T2#T, T3#T, T4#T]
    }
  def item2Put4[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T4, T1, T2, T3]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T4, T1, T2, T3]] {
      override def plus(p: XyyItem3[T1#H, T2#H, T3#H], item: T4#H): Tuple4[T4#H, T1#H, T2#H, T3#H]                          = p.pudaoToTuple(item)
      override def takeHead(t: Tuple4[T4#H, T1#H, T2#H, T3#H]): T4#H                                                        = t._1
      override def takeTail(t: Tuple4[T4#H, T1#H, T2#H, T3#H]): XyyItem3[T1#H, T2#H, T3#H]                                  = Item2XyyReverse0.pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType3[T1, T2, T3]#T, T4#T, XyyTupleType4[T4, T1, T2, T3]#T] = item2Put4[T1#T, T2#T, T3#T, T4#T]
    }
  def hlistPlus5[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T1, T2, T3, T4, T5]] {
      override def plus(p: XyyItem4[T1#H, T2#H, T3#H, T4#H], item: T5#H): Tuple5[T1#H, T2#H, T3#H, T4#H, T5#H] = p.eatToTuple(item)
      override def takeHead(t: Tuple5[T1#H, T2#H, T3#H, T4#H, T5#H]): T5#H                                     = t._5
      override def takeTail(t: Tuple5[T1#H, T2#H, T3#H, T4#H, T5#H]): XyyItem4[T1#H, T2#H, T3#H, T4#H]         = ArticleXyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4]#T, T5#T, XyyTupleType5[T1, T2, T3, T4, T5]#T] =
        hlistPlus5[T1#T, T2#T, T3#T, T4#T, T5#T]
    }
  def hlistPut5[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T5, T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T5, T1, T2, T3, T4]] {
      override def plus(p: XyyItem4[T1#H, T2#H, T3#H, T4#H], item: T5#H): Tuple5[T5#H, T1#H, T2#H, T3#H, T4#H] = p.pudaoToTuple(item)
      override def takeHead(t: Tuple5[T5#H, T1#H, T2#H, T3#H, T4#H]): T5#H                                     = t._1
      override def takeTail(t: Tuple5[T5#H, T1#H, T2#H, T3#H, T4#H]): XyyItem4[T1#H, T2#H, T3#H, T4#H] =
        ArticleXyyReverse0.pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4]#T, T5#T, XyyTupleType5[T5, T1, T2, T3, T4]#T] =
        hlistPut5[T1#T, T2#T, T3#T, T4#T, T5#T]
    }
  def item2Plus5[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T1, T2, T3, T4, T5]] {
      override def plus(p: XyyItem4[T1#H, T2#H, T3#H, T4#H], item: T5#H): Tuple5[T1#H, T2#H, T3#H, T4#H, T5#H] = p.eatToTuple(item)
      override def takeHead(t: Tuple5[T1#H, T2#H, T3#H, T4#H, T5#H]): T5#H                                     = t._5
      override def takeTail(t: Tuple5[T1#H, T2#H, T3#H, T4#H, T5#H]): XyyItem4[T1#H, T2#H, T3#H, T4#H]         = Item2Xyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4]#T, T5#T, XyyTupleType5[T1, T2, T3, T4, T5]#T] =
        item2Plus5[T1#T, T2#T, T3#T, T4#T, T5#T]
    }
  def item2Put5[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T5, T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T5, T1, T2, T3, T4]] {
      override def plus(p: XyyItem4[T1#H, T2#H, T3#H, T4#H], item: T5#H): Tuple5[T5#H, T1#H, T2#H, T3#H, T4#H] = p.pudaoToTuple(item)
      override def takeHead(t: Tuple5[T5#H, T1#H, T2#H, T3#H, T4#H]): T5#H                                     = t._1
      override def takeTail(t: Tuple5[T5#H, T1#H, T2#H, T3#H, T4#H]): XyyItem4[T1#H, T2#H, T3#H, T4#H]         = Item2XyyReverse0.pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4]#T, T5#T, XyyTupleType5[T5, T1, T2, T3, T4]#T] =
        item2Put5[T1#T, T2#T, T3#T, T4#T, T5#T]
    }
  def hlistPlus6[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T1, T2, T3, T4, T5, T6]] {
      override def plus(p: XyyItem5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): Tuple6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] = p.eatToTuple(item)
      override def takeHead(t: Tuple6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): T6#H                                           = t._6
      override def takeTail(t: Tuple6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): XyyItem5[T1#H, T2#H, T3#H, T4#H, T5#H] =
        ArticleXyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5]#T, T6#T, XyyTupleType6[T1, T2, T3, T4, T5, T6]#T] =
        hlistPlus6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
    }
  def hlistPut6[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T6, T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T6, T1, T2, T3, T4, T5]] {
      override def plus(p: XyyItem5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): Tuple6[T6#H, T1#H, T2#H, T3#H, T4#H, T5#H] = p.pudaoToTuple(item)
      override def takeHead(t: Tuple6[T6#H, T1#H, T2#H, T3#H, T4#H, T5#H]): T6#H                                           = t._1
      override def takeTail(t: Tuple6[T6#H, T1#H, T2#H, T3#H, T4#H, T5#H]): XyyItem5[T1#H, T2#H, T3#H, T4#H, T5#H] =
        ArticleXyyReverse0.pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5]#T, T6#T, XyyTupleType6[T6, T1, T2, T3, T4, T5]#T] =
        hlistPut6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
    }
  def item2Plus6[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T1, T2, T3, T4, T5, T6]] {
      override def plus(p: XyyItem5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): Tuple6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] = p.eatToTuple(item)
      override def takeHead(t: Tuple6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): T6#H                                           = t._6
      override def takeTail(t: Tuple6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): XyyItem5[T1#H, T2#H, T3#H, T4#H, T5#H] =
        Item2Xyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5]#T, T6#T, XyyTupleType6[T1, T2, T3, T4, T5, T6]#T] =
        item2Plus6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
    }
  def item2Put6[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T6, T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T6, T1, T2, T3, T4, T5]] {
      override def plus(p: XyyItem5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): Tuple6[T6#H, T1#H, T2#H, T3#H, T4#H, T5#H] = p.pudaoToTuple(item)
      override def takeHead(t: Tuple6[T6#H, T1#H, T2#H, T3#H, T4#H, T5#H]): T6#H                                           = t._1
      override def takeTail(t: Tuple6[T6#H, T1#H, T2#H, T3#H, T4#H, T5#H]): XyyItem5[T1#H, T2#H, T3#H, T4#H, T5#H] =
        Item2XyyReverse0.pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5]#T, T6#T, XyyTupleType6[T6, T1, T2, T3, T4, T5]#T] =
        item2Put6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
    }
  def hlistPlus7[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]] {
      override def plus(p: XyyItem6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H], item: T7#H): Tuple7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] = p.eatToTuple(item)
      override def takeHead(t: Tuple7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): T7#H                                                 = t._7
      override def takeTail(t: Tuple7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): XyyItem6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] =
        ArticleXyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6]#T, T7#T, XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]#T] =
        hlistPlus7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]
    }
  def hlistPut7[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T7, T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T7, T1, T2, T3, T4, T5, T6]] {
      override def plus(p: XyyItem6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H], item: T7#H): Tuple7[T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] = p.pudaoToTuple(item)
      override def takeHead(t: Tuple7[T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): T7#H                                                 = t._1
      override def takeTail(t: Tuple7[T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): XyyItem6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] =
        ArticleXyyReverse0.pudao(t._7).pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6]#T, T7#T, XyyTupleType7[T7, T1, T2, T3, T4, T5, T6]#T] =
        hlistPut7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]
    }
  def item2Plus7[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]] {
      override def plus(p: XyyItem6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H], item: T7#H): Tuple7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] = p.eatToTuple(item)
      override def takeHead(t: Tuple7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): T7#H                                                 = t._7
      override def takeTail(t: Tuple7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): XyyItem6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] =
        Item2Xyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6]#T, T7#T, XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]#T] =
        item2Plus7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]
    }
  def item2Put7[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T7, T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T7, T1, T2, T3, T4, T5, T6]] {
      override def plus(p: XyyItem6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H], item: T7#H): Tuple7[T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] = p.pudaoToTuple(item)
      override def takeHead(t: Tuple7[T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): T7#H                                                 = t._1
      override def takeTail(t: Tuple7[T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): XyyItem6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] =
        Item2XyyReverse0.pudao(t._7).pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6]#T, T7#T, XyyTupleType7[T7, T1, T2, T3, T4, T5, T6]#T] =
        item2Put7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]
    }
  def hlistPlus8[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def plus(p: XyyItem7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H], item: T8#H): Tuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H] = p.eatToTuple(item)
      override def takeHead(t: Tuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]): T8#H                                                       = t._8
      override def takeTail(t: Tuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]): XyyItem7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] =
        ArticleXyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7]#T, T8#T, XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]#T] =
        hlistPlus8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]
    }
  def hlistPut8[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T8, T1, T2, T3, T4, T5, T6, T7]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T8, T1, T2, T3, T4, T5, T6, T7]] {
      override def plus(p: XyyItem7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H], item: T8#H): Tuple8[T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] = p.pudaoToTuple(item)
      override def takeHead(t: Tuple8[T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): T8#H                                                       = t._1
      override def takeTail(t: Tuple8[T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): XyyItem7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] =
        ArticleXyyReverse0.pudao(t._8).pudao(t._7).pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7]#T, T8#T, XyyTupleType8[T8, T1, T2, T3, T4, T5, T6, T7]#T] =
        hlistPut8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]
    }
  def item2Plus8[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def plus(p: XyyItem7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H], item: T8#H): Tuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H] = p.eatToTuple(item)
      override def takeHead(t: Tuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]): T8#H                                                       = t._8
      override def takeTail(t: Tuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]): XyyItem7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] =
        Item2Xyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7]#T, T8#T, XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]#T] =
        item2Plus8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]
    }
  def item2Put8[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T8, T1, T2, T3, T4, T5, T6, T7]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T8, T1, T2, T3, T4, T5, T6, T7]] {
      override def plus(p: XyyItem7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H], item: T8#H): Tuple8[T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] = p.pudaoToTuple(item)
      override def takeHead(t: Tuple8[T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): T8#H                                                       = t._1
      override def takeTail(t: Tuple8[T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): XyyItem7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] =
        Item2XyyReverse0.pudao(t._8).pudao(t._7).pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7]#T, T8#T, XyyTupleType8[T8, T1, T2, T3, T4, T5, T6, T7]#T] =
        item2Put8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]
    }
  def hlistPlus9[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, XyyTupleType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, XyyTupleType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def plus(p: XyyItem8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], item: T9#H): Tuple9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H] =
        p.eatToTuple(item)
      override def takeHead(t: Tuple9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H]): T9#H = t._9
      override def takeTail(t: Tuple9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H]): XyyItem8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H] =
        ArticleXyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8]#T, T9#T, XyyTupleType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]#T] =
        hlistPlus9[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T]
    }
  def hlistPut9[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, XyyTupleType9[T9, T1, T2, T3, T4, T5, T6, T7, T8]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, XyyTupleType9[T9, T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def plus(p: XyyItem8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], item: T9#H): Tuple9[T9#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H] =
        p.pudaoToTuple(item)
      override def takeHead(t: Tuple9[T9#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]): T9#H = t._1
      override def takeTail(t: Tuple9[T9#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]): XyyItem8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H] =
        ArticleXyyReverse0.pudao(t._9).pudao(t._8).pudao(t._7).pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8]#T, T9#T, XyyTupleType9[T9, T1, T2, T3, T4, T5, T6, T7, T8]#T] =
        hlistPut9[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T]
    }
  def item2Plus9[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, XyyTupleType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, XyyTupleType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def plus(p: XyyItem8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], item: T9#H): Tuple9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H] =
        p.eatToTuple(item)
      override def takeHead(t: Tuple9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H]): T9#H = t._9
      override def takeTail(t: Tuple9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H]): XyyItem8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H] =
        Item2Xyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8]#T, T9#T, XyyTupleType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]#T] =
        item2Plus9[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T]
    }
  def item2Put9[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, XyyTupleType9[T9, T1, T2, T3, T4, T5, T6, T7, T8]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, XyyTupleType9[T9, T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def plus(p: XyyItem8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], item: T9#H): Tuple9[T9#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H] =
        p.pudaoToTuple(item)
      override def takeHead(t: Tuple9[T9#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]): T9#H = t._1
      override def takeTail(t: Tuple9[T9#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]): XyyItem8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H] =
        Item2XyyReverse0.pudao(t._9).pudao(t._8).pudao(t._7).pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8]#T, T9#T, XyyTupleType9[T9, T1, T2, T3, T4, T5, T6, T7, T8]#T] =
        item2Put9[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T]
    }
  def hlistPlus10[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10, XyyTupleType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10, XyyTupleType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {
      override def plus(
        p: XyyItem9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H],
        item: T10#H
      ): Tuple10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]                               = p.eatToTuple(item)
      override def takeHead(t: Tuple10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]): T10#H = t._10
      override def takeTail(t: Tuple10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]): XyyItem9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H] =
        ArticleXyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8).eat(t._9)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]#T, T10#T, XyyTupleType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]#T] =
        hlistPlus10[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T]
    }
  def hlistPut10[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10, XyyTupleType10[T10, T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10, XyyTupleType10[T10, T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def plus(
        p: XyyItem9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H],
        item: T10#H
      ): Tuple10[T10#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H]                               = p.pudaoToTuple(item)
      override def takeHead(t: Tuple10[T10#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H]): T10#H = t._1
      override def takeTail(t: Tuple10[T10#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H]): XyyItem9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H] =
        ArticleXyyReverse0.pudao(t._10).pudao(t._9).pudao(t._8).pudao(t._7).pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]#T, T10#T, XyyTupleType10[T10, T1, T2, T3, T4, T5, T6, T7, T8, T9]#T] =
        hlistPut10[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T]
    }
  def item2Plus10[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10, XyyTupleType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10, XyyTupleType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {
      override def plus(
        p: XyyItem9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H],
        item: T10#H
      ): Tuple10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]                               = p.eatToTuple(item)
      override def takeHead(t: Tuple10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]): T10#H = t._10
      override def takeTail(t: Tuple10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]): XyyItem9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H] =
        Item2Xyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8).eat(t._9)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]#T, T10#T, XyyTupleType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]#T] =
        item2Plus10[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T]
    }
  def item2Put10[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10, XyyTupleType10[T10, T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10, XyyTupleType10[T10, T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def plus(
        p: XyyItem9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H],
        item: T10#H
      ): Tuple10[T10#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H]                               = p.pudaoToTuple(item)
      override def takeHead(t: Tuple10[T10#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H]): T10#H = t._1
      override def takeTail(t: Tuple10[T10#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H]): XyyItem9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H] =
        Item2XyyReverse0.pudao(t._10).pudao(t._9).pudao(t._8).pudao(t._7).pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]#T, T10#T, XyyTupleType10[T10, T1, T2, T3, T4, T5, T6, T7, T8, T9]#T] =
        item2Put10[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T]
    }
  def hlistPlus11[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, XyyTupleType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, XyyTupleType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] {
      override def plus(
        p: XyyItem10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H],
        item: T11#H
      ): Tuple11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]                               = p.eatToTuple(item)
      override def takeHead(t: Tuple11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]): T11#H = t._11
      override def takeTail(
        t: Tuple11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]
      ): XyyItem10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H] =
        ArticleXyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8).eat(t._9).eat(t._10)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]#T, T11#T, XyyTupleType11[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11
      ]#T] = hlistPlus11[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T]
    }
  def hlistPut11[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, XyyTupleType11[T11, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, XyyTupleType11[T11, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {
      override def plus(
        p: XyyItem10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H],
        item: T11#H
      ): Tuple11[T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]                               = p.pudaoToTuple(item)
      override def takeHead(t: Tuple11[T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]): T11#H = t._1
      override def takeTail(
        t: Tuple11[T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]
      ): XyyItem10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H] =
        ArticleXyyReverse0.pudao(t._11).pudao(t._10).pudao(t._9).pudao(t._8).pudao(t._7).pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]#T, T11#T, XyyTupleType11[
        T11,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10
      ]#T] = hlistPut11[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T]
    }
  def item2Plus11[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, XyyTupleType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, XyyTupleType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] {
      override def plus(
        p: XyyItem10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H],
        item: T11#H
      ): Tuple11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]                               = p.eatToTuple(item)
      override def takeHead(t: Tuple11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]): T11#H = t._11
      override def takeTail(
        t: Tuple11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]
      ): XyyItem10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H] =
        Item2Xyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8).eat(t._9).eat(t._10)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]#T, T11#T, XyyTupleType11[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11
      ]#T] = item2Plus11[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T]
    }
  def item2Put11[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, XyyTupleType11[T11, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, XyyTupleType11[T11, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {
      override def plus(
        p: XyyItem10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H],
        item: T11#H
      ): Tuple11[T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]                               = p.pudaoToTuple(item)
      override def takeHead(t: Tuple11[T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]): T11#H = t._1
      override def takeTail(
        t: Tuple11[T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]
      ): XyyItem10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H] =
        Item2XyyReverse0.pudao(t._11).pudao(t._10).pudao(t._9).pudao(t._8).pudao(t._7).pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]#T, T11#T, XyyTupleType11[
        T11,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10
      ]#T] = item2Put11[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T]
    }
  def hlistPlus12[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T12, XyyTupleType12[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T12, XyyTupleType12[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12
    ]] {
      override def plus(
        p: XyyItem11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H],
        item: T12#H
      ): Tuple12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]                               = p.eatToTuple(item)
      override def takeHead(t: Tuple12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]): T12#H = t._12
      override def takeTail(
        t: Tuple12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]
      ): XyyItem11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H] =
        ArticleXyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8).eat(t._9).eat(t._10).eat(t._11)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]#T, T12#T, XyyTupleType12[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12
      ]#T] = hlistPlus12[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T]
    }
  def hlistPut12[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T12, XyyTupleType12[
    T12,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T12, XyyTupleType12[
      T12,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11
    ]] {
      override def plus(
        p: XyyItem11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H],
        item: T12#H
      ): Tuple12[T12#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]                               = p.pudaoToTuple(item)
      override def takeHead(t: Tuple12[T12#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]): T12#H = t._1
      override def takeTail(
        t: Tuple12[T12#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]
      ): XyyItem11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H] =
        ArticleXyyReverse0.pudao(t._12).pudao(t._11).pudao(t._10).pudao(t._9).pudao(t._8).pudao(t._7).pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]#T, T12#T, XyyTupleType12[
        T12,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11
      ]#T] = hlistPut12[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T]
    }
  def item2Plus12[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T12, XyyTupleType12[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T12, XyyTupleType12[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12
    ]] {
      override def plus(
        p: XyyItem11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H],
        item: T12#H
      ): Tuple12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]                               = p.eatToTuple(item)
      override def takeHead(t: Tuple12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]): T12#H = t._12
      override def takeTail(
        t: Tuple12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]
      ): XyyItem11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H] =
        Item2Xyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8).eat(t._9).eat(t._10).eat(t._11)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]#T, T12#T, XyyTupleType12[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12
      ]#T] = item2Plus12[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T]
    }
  def item2Put12[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T12, XyyTupleType12[
    T12,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T12, XyyTupleType12[
      T12,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11
    ]] {
      override def plus(
        p: XyyItem11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H],
        item: T12#H
      ): Tuple12[T12#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]                               = p.pudaoToTuple(item)
      override def takeHead(t: Tuple12[T12#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]): T12#H = t._1
      override def takeTail(
        t: Tuple12[T12#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]
      ): XyyItem11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H] =
        Item2XyyReverse0.pudao(t._12).pudao(t._11).pudao(t._10).pudao(t._9).pudao(t._8).pudao(t._7).pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]#T, T12#T, XyyTupleType12[
        T12,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11
      ]#T] = item2Put12[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T]
    }
  def hlistPlus13[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T13, XyyTupleType13[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T13, XyyTupleType13[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13
    ]] {
      override def plus(
        p: XyyItem12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H],
        item: T13#H
      ): Tuple13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]                               = p.eatToTuple(item)
      override def takeHead(t: Tuple13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]): T13#H = t._13
      override def takeTail(
        t: Tuple13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]
      ): XyyItem12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H] =
        ArticleXyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8).eat(t._9).eat(t._10).eat(t._11).eat(t._12)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]#T, T13#T, XyyTupleType13[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13
      ]#T] = hlistPlus13[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T]
    }
  def hlistPut13[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T13, XyyTupleType13[
    T13,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T13, XyyTupleType13[
      T13,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12
    ]] {
      override def plus(
        p: XyyItem12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H],
        item: T13#H
      ): Tuple13[T13#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]                               = p.pudaoToTuple(item)
      override def takeHead(t: Tuple13[T13#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]): T13#H = t._1
      override def takeTail(
        t: Tuple13[T13#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]
      ): XyyItem12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H] =
        ArticleXyyReverse0
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]#T, T13#T, XyyTupleType13[
        T13,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12
      ]#T] = hlistPut13[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T]
    }
  def item2Plus13[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T13, XyyTupleType13[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T13, XyyTupleType13[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13
    ]] {
      override def plus(
        p: XyyItem12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H],
        item: T13#H
      ): Tuple13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]                               = p.eatToTuple(item)
      override def takeHead(t: Tuple13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]): T13#H = t._13
      override def takeTail(
        t: Tuple13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]
      ): XyyItem12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H] =
        Item2Xyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8).eat(t._9).eat(t._10).eat(t._11).eat(t._12)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]#T, T13#T, XyyTupleType13[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13
      ]#T] = item2Plus13[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T]
    }
  def item2Put13[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T13, XyyTupleType13[
    T13,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T13, XyyTupleType13[
      T13,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12
    ]] {
      override def plus(
        p: XyyItem12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H],
        item: T13#H
      ): Tuple13[T13#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]                               = p.pudaoToTuple(item)
      override def takeHead(t: Tuple13[T13#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]): T13#H = t._1
      override def takeTail(
        t: Tuple13[T13#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]
      ): XyyItem12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H] =
        Item2XyyReverse0
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]#T, T13#T, XyyTupleType13[
        T13,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12
      ]#T] = item2Put13[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T]
    }
  def hlistPlus14[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T14, XyyTupleType14[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T14, XyyTupleType14[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14
    ]] {
      override def plus(
        p: XyyItem13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H],
        item: T14#H
      ): Tuple14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]                               = p.eatToTuple(item)
      override def takeHead(t: Tuple14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]): T14#H = t._14
      override def takeTail(
        t: Tuple14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]
      ): XyyItem13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H] =
        ArticleXyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8).eat(t._9).eat(t._10).eat(t._11).eat(t._12).eat(t._13)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]#T, T14#T, XyyTupleType14[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14
      ]#T] = hlistPlus14[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T]
    }
  def hlistPut14[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T14, XyyTupleType14[
    T14,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T14, XyyTupleType14[
      T14,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13
    ]] {
      override def plus(
        p: XyyItem13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H],
        item: T14#H
      ): Tuple14[T14#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]                               = p.pudaoToTuple(item)
      override def takeHead(t: Tuple14[T14#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]): T14#H = t._1
      override def takeTail(
        t: Tuple14[T14#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]
      ): XyyItem13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H] =
        ArticleXyyReverse0
          .pudao(t._14)
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]#T, T14#T, XyyTupleType14[
        T14,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13
      ]#T] = hlistPut14[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T]
    }
  def item2Plus14[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T14, XyyTupleType14[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T14, XyyTupleType14[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14
    ]] {
      override def plus(
        p: XyyItem13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H],
        item: T14#H
      ): Tuple14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]                               = p.eatToTuple(item)
      override def takeHead(t: Tuple14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]): T14#H = t._14
      override def takeTail(
        t: Tuple14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]
      ): XyyItem13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H] =
        Item2Xyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8).eat(t._9).eat(t._10).eat(t._11).eat(t._12).eat(t._13)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]#T, T14#T, XyyTupleType14[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14
      ]#T] = item2Plus14[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T]
    }
  def item2Put14[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T14, XyyTupleType14[
    T14,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T14, XyyTupleType14[
      T14,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13
    ]] {
      override def plus(
        p: XyyItem13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H],
        item: T14#H
      ): Tuple14[T14#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]                               = p.pudaoToTuple(item)
      override def takeHead(t: Tuple14[T14#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]): T14#H = t._1
      override def takeTail(
        t: Tuple14[T14#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]
      ): XyyItem13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H] =
        Item2XyyReverse0
          .pudao(t._14)
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]#T, T14#T, XyyTupleType14[
        T14,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13
      ]#T] = item2Put14[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T]
    }
  def hlistPlus15[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T15, XyyTupleType15[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T15, XyyTupleType15[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15
    ]] {
      override def plus(
        p: XyyItem14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H],
        item: T15#H
      ): Tuple15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]                               = p.eatToTuple(item)
      override def takeHead(t: Tuple15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]): T15#H = t._15
      override def takeTail(
        t: Tuple15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]
      ): XyyItem14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H] =
        ArticleXyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8).eat(t._9).eat(t._10).eat(t._11).eat(t._12).eat(t._13).eat(t._14)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]#T, T15#T, XyyTupleType15[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14,
        T15
      ]#T] = hlistPlus15[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T]
    }
  def hlistPut15[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T15, XyyTupleType15[
    T15,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T15, XyyTupleType15[
      T15,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14
    ]] {
      override def plus(
        p: XyyItem14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H],
        item: T15#H
      ): Tuple15[T15#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]                               = p.pudaoToTuple(item)
      override def takeHead(t: Tuple15[T15#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]): T15#H = t._1
      override def takeTail(
        t: Tuple15[T15#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]
      ): XyyItem14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H] =
        ArticleXyyReverse0
          .pudao(t._15)
          .pudao(t._14)
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]#T, T15#T, XyyTupleType15[
        T15,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14
      ]#T] = hlistPut15[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T]
    }
  def item2Plus15[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T15, XyyTupleType15[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T15, XyyTupleType15[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15
    ]] {
      override def plus(
        p: XyyItem14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H],
        item: T15#H
      ): Tuple15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]                               = p.eatToTuple(item)
      override def takeHead(t: Tuple15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]): T15#H = t._15
      override def takeTail(
        t: Tuple15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]
      ): XyyItem14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H] =
        Item2Xyy0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8).eat(t._9).eat(t._10).eat(t._11).eat(t._12).eat(t._13).eat(t._14)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]#T, T15#T, XyyTupleType15[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14,
        T15
      ]#T] = item2Plus15[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T]
    }
  def item2Put15[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T15, XyyTupleType15[
    T15,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T15, XyyTupleType15[
      T15,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14
    ]] {
      override def plus(
        p: XyyItem14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H],
        item: T15#H
      ): Tuple15[T15#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]                               = p.pudaoToTuple(item)
      override def takeHead(t: Tuple15[T15#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]): T15#H = t._1
      override def takeTail(
        t: Tuple15[T15#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]
      ): XyyItem14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H] =
        Item2XyyReverse0
          .pudao(t._15)
          .pudao(t._14)
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]#T, T15#T, XyyTupleType15[
        T15,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14
      ]#T] = item2Put15[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T]
    }
  def hlistPlus16[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16, XyyTupleType16[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16, XyyTupleType16[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16
    ]] {
      override def plus(
        p: XyyItem15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H],
        item: T16#H
      ): Tuple16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]                               = p.eatToTuple(item)
      override def takeHead(t: Tuple16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]): T16#H = t._16
      override def takeTail(
        t: Tuple16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
      ): XyyItem15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H] =
        ArticleXyy0
          .eat(t._1)
          .eat(t._2)
          .eat(t._3)
          .eat(t._4)
          .eat(t._5)
          .eat(t._6)
          .eat(t._7)
          .eat(t._8)
          .eat(t._9)
          .eat(t._10)
          .eat(t._11)
          .eat(t._12)
          .eat(t._13)
          .eat(t._14)
          .eat(t._15)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]#T, T16#T, XyyTupleType16[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14,
        T15,
        T16
      ]#T] = hlistPlus16[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T]
    }
  def hlistPut16[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16, XyyTupleType16[
    T16,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16, XyyTupleType16[
      T16,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15
    ]] {
      override def plus(
        p: XyyItem15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H],
        item: T16#H
      ): Tuple16[T16#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]                               = p.pudaoToTuple(item)
      override def takeHead(t: Tuple16[T16#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]): T16#H = t._1
      override def takeTail(
        t: Tuple16[T16#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]
      ): XyyItem15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H] =
        ArticleXyyReverse0
          .pudao(t._16)
          .pudao(t._15)
          .pudao(t._14)
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]#T, T16#T, XyyTupleType16[
        T16,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14,
        T15
      ]#T] = hlistPut16[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T]
    }
  def item2Plus16[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16, XyyTupleType16[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16, XyyTupleType16[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16
    ]] {
      override def plus(
        p: XyyItem15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H],
        item: T16#H
      ): Tuple16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]                               = p.eatToTuple(item)
      override def takeHead(t: Tuple16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]): T16#H = t._16
      override def takeTail(
        t: Tuple16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
      ): XyyItem15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H] =
        Item2Xyy0
          .eat(t._1)
          .eat(t._2)
          .eat(t._3)
          .eat(t._4)
          .eat(t._5)
          .eat(t._6)
          .eat(t._7)
          .eat(t._8)
          .eat(t._9)
          .eat(t._10)
          .eat(t._11)
          .eat(t._12)
          .eat(t._13)
          .eat(t._14)
          .eat(t._15)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]#T, T16#T, XyyTupleType16[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14,
        T15,
        T16
      ]#T] = item2Plus16[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T]
    }
  def item2Put16[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16, XyyTupleType16[
    T16,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16, XyyTupleType16[
      T16,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15
    ]] {
      override def plus(
        p: XyyItem15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H],
        item: T16#H
      ): Tuple16[T16#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]                               = p.pudaoToTuple(item)
      override def takeHead(t: Tuple16[T16#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]): T16#H = t._1
      override def takeTail(
        t: Tuple16[T16#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]
      ): XyyItem15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H] =
        Item2XyyReverse0
          .pudao(t._16)
          .pudao(t._15)
          .pudao(t._14)
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]#T, T16#T, XyyTupleType16[
        T16,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14,
        T15
      ]#T] = item2Put16[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T]
    }
  def hlistPlus17[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T17, XyyTupleType17[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T17, XyyTupleType17[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17
    ]] {
      override def plus(
        p: XyyItem16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H],
        item: T17#H
      ): Tuple17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]                               = p.eatToTuple(item)
      override def takeHead(t: Tuple17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]): T17#H = t._17
      override def takeTail(
        t: Tuple17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]
      ): XyyItem16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H] =
        ArticleXyy0
          .eat(t._1)
          .eat(t._2)
          .eat(t._3)
          .eat(t._4)
          .eat(t._5)
          .eat(t._6)
          .eat(t._7)
          .eat(t._8)
          .eat(t._9)
          .eat(t._10)
          .eat(t._11)
          .eat(t._12)
          .eat(t._13)
          .eat(t._14)
          .eat(t._15)
          .eat(t._16)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]#T, T17#T, XyyTupleType17[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14,
        T15,
        T16,
        T17
      ]#T] = hlistPlus17[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T]
    }
  def hlistPut17[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T17, XyyTupleType17[
    T17,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T17, XyyTupleType17[
      T17,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16
    ]] {
      override def plus(
        p: XyyItem16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H],
        item: T17#H
      ): Tuple17[T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]                               = p.pudaoToTuple(item)
      override def takeHead(t: Tuple17[T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]): T17#H = t._1
      override def takeTail(
        t: Tuple17[T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
      ): XyyItem16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H] =
        ArticleXyyReverse0
          .pudao(t._17)
          .pudao(t._16)
          .pudao(t._15)
          .pudao(t._14)
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]#T, T17#T, XyyTupleType17[
        T17,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14,
        T15,
        T16
      ]#T] = hlistPut17[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T]
    }
  def item2Plus17[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T17, XyyTupleType17[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T17, XyyTupleType17[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17
    ]] {
      override def plus(
        p: XyyItem16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H],
        item: T17#H
      ): Tuple17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]                               = p.eatToTuple(item)
      override def takeHead(t: Tuple17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]): T17#H = t._17
      override def takeTail(
        t: Tuple17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]
      ): XyyItem16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H] =
        Item2Xyy0
          .eat(t._1)
          .eat(t._2)
          .eat(t._3)
          .eat(t._4)
          .eat(t._5)
          .eat(t._6)
          .eat(t._7)
          .eat(t._8)
          .eat(t._9)
          .eat(t._10)
          .eat(t._11)
          .eat(t._12)
          .eat(t._13)
          .eat(t._14)
          .eat(t._15)
          .eat(t._16)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]#T, T17#T, XyyTupleType17[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14,
        T15,
        T16,
        T17
      ]#T] = item2Plus17[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T]
    }
  def item2Put17[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T17, XyyTupleType17[
    T17,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T17, XyyTupleType17[
      T17,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16
    ]] {
      override def plus(
        p: XyyItem16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H],
        item: T17#H
      ): Tuple17[T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]                               = p.pudaoToTuple(item)
      override def takeHead(t: Tuple17[T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]): T17#H = t._1
      override def takeTail(
        t: Tuple17[T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
      ): XyyItem16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H] =
        Item2XyyReverse0
          .pudao(t._17)
          .pudao(t._16)
          .pudao(t._15)
          .pudao(t._14)
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]#T, T17#T, XyyTupleType17[
        T17,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13,
        T14,
        T15,
        T16
      ]#T] = item2Put17[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T]
    }
  def hlistPlus18[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T18, XyyTupleType18[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T18, XyyTupleType18[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18
    ]] {
      override def plus(
        p: XyyItem17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H],
        item: T18#H
      ): Tuple18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H] = p.eatToTuple(item)
      override def takeHead(t: Tuple18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H]): T18#H =
        t._18
      override def takeTail(
        t: Tuple18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H]
      ): XyyItem17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H] =
        ArticleXyy0
          .eat(t._1)
          .eat(t._2)
          .eat(t._3)
          .eat(t._4)
          .eat(t._5)
          .eat(t._6)
          .eat(t._7)
          .eat(t._8)
          .eat(t._9)
          .eat(t._10)
          .eat(t._11)
          .eat(t._12)
          .eat(t._13)
          .eat(t._14)
          .eat(t._15)
          .eat(t._16)
          .eat(t._17)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]#T, T18#T, XyyTupleType18[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18
        ]#T] = hlistPlus18[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T]
    }
  def hlistPut18[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T18, XyyTupleType18[
    T18,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T18, XyyTupleType18[
      T18,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17
    ]] {
      override def plus(
        p: XyyItem17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H],
        item: T18#H
      ): Tuple18[T18#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]                               = p.pudaoToTuple(item)
      override def takeHead(t: Tuple18[T18#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]): T18#H = t._1
      override def takeTail(
        t: Tuple18[T18#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]
      ): XyyItem17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H] =
        ArticleXyyReverse0
          .pudao(t._18)
          .pudao(t._17)
          .pudao(t._16)
          .pudao(t._15)
          .pudao(t._14)
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]#T, T18#T, XyyTupleType18[
          T18,
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17
        ]#T] = hlistPut18[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T]
    }
  def item2Plus18[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T18, XyyTupleType18[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T18, XyyTupleType18[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18
    ]] {
      override def plus(
        p: XyyItem17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H],
        item: T18#H
      ): Tuple18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H] = p.eatToTuple(item)
      override def takeHead(t: Tuple18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H]): T18#H =
        t._18
      override def takeTail(
        t: Tuple18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H]
      ): XyyItem17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H] =
        Item2Xyy0
          .eat(t._1)
          .eat(t._2)
          .eat(t._3)
          .eat(t._4)
          .eat(t._5)
          .eat(t._6)
          .eat(t._7)
          .eat(t._8)
          .eat(t._9)
          .eat(t._10)
          .eat(t._11)
          .eat(t._12)
          .eat(t._13)
          .eat(t._14)
          .eat(t._15)
          .eat(t._16)
          .eat(t._17)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]#T, T18#T, XyyTupleType18[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18
        ]#T] = item2Plus18[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T]
    }
  def item2Put18[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T18, XyyTupleType18[
    T18,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T18, XyyTupleType18[
      T18,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17
    ]] {
      override def plus(
        p: XyyItem17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H],
        item: T18#H
      ): Tuple18[T18#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]                               = p.pudaoToTuple(item)
      override def takeHead(t: Tuple18[T18#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]): T18#H = t._1
      override def takeTail(
        t: Tuple18[T18#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]
      ): XyyItem17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H] =
        Item2XyyReverse0
          .pudao(t._18)
          .pudao(t._17)
          .pudao(t._16)
          .pudao(t._15)
          .pudao(t._14)
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]#T, T18#T, XyyTupleType18[
          T18,
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17
        ]#T] = item2Put18[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T]
    }
  def hlistPlus19[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T19, XyyTupleType19[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T19, XyyTupleType19[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19
    ]] {
      override def plus(
        p: XyyItem18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H],
        item: T19#H
      ): Tuple19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H] = p.eatToTuple(item)
      override def takeHead(
        t: Tuple19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H]
      ): T19#H = t._19
      override def takeTail(
        t: Tuple19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H]
      ): XyyItem18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H] =
        ArticleXyy0
          .eat(t._1)
          .eat(t._2)
          .eat(t._3)
          .eat(t._4)
          .eat(t._5)
          .eat(t._6)
          .eat(t._7)
          .eat(t._8)
          .eat(t._9)
          .eat(t._10)
          .eat(t._11)
          .eat(t._12)
          .eat(t._13)
          .eat(t._14)
          .eat(t._15)
          .eat(t._16)
          .eat(t._17)
          .eat(t._18)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]#T, T19#T, XyyTupleType19[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T19
        ]#T] = hlistPlus19[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T]
    }
  def hlistPut19[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T19, XyyTupleType19[
    T19,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T19, XyyTupleType19[
      T19,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18
    ]] {
      override def plus(
        p: XyyItem18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H],
        item: T19#H
      ): Tuple19[T19#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H] = p.pudaoToTuple(item)
      override def takeHead(
        t: Tuple19[T19#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H]
      ): T19#H = t._1
      override def takeTail(
        t: Tuple19[T19#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H]
      ): XyyItem18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H] =
        ArticleXyyReverse0
          .pudao(t._19)
          .pudao(t._18)
          .pudao(t._17)
          .pudao(t._16)
          .pudao(t._15)
          .pudao(t._14)
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]#T, T19#T, XyyTupleType19[
          T19,
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18
        ]#T] = hlistPut19[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T]
    }
  def item2Plus19[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T19, XyyTupleType19[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T19, XyyTupleType19[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19
    ]] {
      override def plus(
        p: XyyItem18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H],
        item: T19#H
      ): Tuple19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H] = p.eatToTuple(item)
      override def takeHead(
        t: Tuple19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H]
      ): T19#H = t._19
      override def takeTail(
        t: Tuple19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H]
      ): XyyItem18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H] =
        Item2Xyy0
          .eat(t._1)
          .eat(t._2)
          .eat(t._3)
          .eat(t._4)
          .eat(t._5)
          .eat(t._6)
          .eat(t._7)
          .eat(t._8)
          .eat(t._9)
          .eat(t._10)
          .eat(t._11)
          .eat(t._12)
          .eat(t._13)
          .eat(t._14)
          .eat(t._15)
          .eat(t._16)
          .eat(t._17)
          .eat(t._18)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]#T, T19#T, XyyTupleType19[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T19
        ]#T] = item2Plus19[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T]
    }
  def item2Put19[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T19, XyyTupleType19[
    T19,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T19, XyyTupleType19[
      T19,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18
    ]] {
      override def plus(
        p: XyyItem18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H],
        item: T19#H
      ): Tuple19[T19#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H] = p.pudaoToTuple(item)
      override def takeHead(
        t: Tuple19[T19#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H]
      ): T19#H = t._1
      override def takeTail(
        t: Tuple19[T19#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H]
      ): XyyItem18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H] =
        Item2XyyReverse0
          .pudao(t._19)
          .pudao(t._18)
          .pudao(t._17)
          .pudao(t._16)
          .pudao(t._15)
          .pudao(t._14)
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]#T, T19#T, XyyTupleType19[
          T19,
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18
        ]#T] = item2Put19[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T]
    }
  def hlistPlus20[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam,
    T20 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T20, XyyTupleType20[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T20, XyyTupleType20[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19,
      T20
    ]] {
      override def plus(
        p: XyyItem19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H],
        item: T20#H
      ): Tuple20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H] = p.eatToTuple(item)
      override def takeHead(
        t: Tuple20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H]
      ): T20#H = t._20
      override def takeTail(
        t: Tuple20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H]
      ): XyyItem19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H] =
        ArticleXyy0
          .eat(t._1)
          .eat(t._2)
          .eat(t._3)
          .eat(t._4)
          .eat(t._5)
          .eat(t._6)
          .eat(t._7)
          .eat(t._8)
          .eat(t._9)
          .eat(t._10)
          .eat(t._11)
          .eat(t._12)
          .eat(t._13)
          .eat(t._14)
          .eat(t._15)
          .eat(t._16)
          .eat(t._17)
          .eat(t._18)
          .eat(t._19)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]#T, T20#T, XyyTupleType20[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T19,
          T20
        ]#T] = hlistPlus20[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T]
    }
  def hlistPut20[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam,
    T20 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T20, XyyTupleType20[
    T20,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T20, XyyTupleType20[
      T20,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19
    ]] {
      override def plus(
        p: XyyItem19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H],
        item: T20#H
      ): Tuple20[T20#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H] = p.pudaoToTuple(item)
      override def takeHead(
        t: Tuple20[T20#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H]
      ): T20#H = t._1
      override def takeTail(
        t: Tuple20[T20#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H]
      ): XyyItem19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H] =
        ArticleXyyReverse0
          .pudao(t._20)
          .pudao(t._19)
          .pudao(t._18)
          .pudao(t._17)
          .pudao(t._16)
          .pudao(t._15)
          .pudao(t._14)
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]#T, T20#T, XyyTupleType20[
          T20,
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T19
        ]#T] = hlistPut20[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T]
    }
  def item2Plus20[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam,
    T20 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T20, XyyTupleType20[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T20, XyyTupleType20[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19,
      T20
    ]] {
      override def plus(
        p: XyyItem19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H],
        item: T20#H
      ): Tuple20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H] = p.eatToTuple(item)
      override def takeHead(
        t: Tuple20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H]
      ): T20#H = t._20
      override def takeTail(
        t: Tuple20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H]
      ): XyyItem19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H] =
        Item2Xyy0
          .eat(t._1)
          .eat(t._2)
          .eat(t._3)
          .eat(t._4)
          .eat(t._5)
          .eat(t._6)
          .eat(t._7)
          .eat(t._8)
          .eat(t._9)
          .eat(t._10)
          .eat(t._11)
          .eat(t._12)
          .eat(t._13)
          .eat(t._14)
          .eat(t._15)
          .eat(t._16)
          .eat(t._17)
          .eat(t._18)
          .eat(t._19)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]#T, T20#T, XyyTupleType20[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T19,
          T20
        ]#T] = item2Plus20[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T]
    }
  def item2Put20[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam,
    T20 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T20, XyyTupleType20[
    T20,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T20, XyyTupleType20[
      T20,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19
    ]] {
      override def plus(
        p: XyyItem19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H],
        item: T20#H
      ): Tuple20[T20#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H] = p.pudaoToTuple(item)
      override def takeHead(
        t: Tuple20[T20#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H]
      ): T20#H = t._1
      override def takeTail(
        t: Tuple20[T20#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H]
      ): XyyItem19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H] =
        Item2XyyReverse0
          .pudao(t._20)
          .pudao(t._19)
          .pudao(t._18)
          .pudao(t._17)
          .pudao(t._16)
          .pudao(t._15)
          .pudao(t._14)
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]#T, T20#T, XyyTupleType20[
          T20,
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T19
        ]#T] = item2Put20[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T]
    }
  def hlistPlus21[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam,
    T20 <: org.scalax.asuna.mapper.item.TypeParam,
    T21 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T21, XyyTupleType21[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20,
    T21
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T21, XyyTupleType21[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19,
      T20,
      T21
    ]] {
      override def plus(
        p: XyyItem20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H],
        item: T21#H
      ): Tuple21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H] =
        p.eatToTuple(item)
      override def takeHead(
        t: Tuple21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H]
      ): T21#H = t._21
      override def takeTail(
        t: Tuple21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H]
      ): XyyItem20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H] =
        ArticleXyy0
          .eat(t._1)
          .eat(t._2)
          .eat(t._3)
          .eat(t._4)
          .eat(t._5)
          .eat(t._6)
          .eat(t._7)
          .eat(t._8)
          .eat(t._9)
          .eat(t._10)
          .eat(t._11)
          .eat(t._12)
          .eat(t._13)
          .eat(t._14)
          .eat(t._15)
          .eat(t._16)
          .eat(t._17)
          .eat(t._18)
          .eat(t._19)
          .eat(t._20)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]#T, T21#T, XyyTupleType21[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T19,
          T20,
          T21
        ]#T] = hlistPlus21[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T]
    }
  def hlistPut21[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam,
    T20 <: org.scalax.asuna.mapper.item.TypeParam,
    T21 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T21, XyyTupleType21[
    T21,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T21, XyyTupleType21[
      T21,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19,
      T20
    ]] {
      override def plus(
        p: XyyItem20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H],
        item: T21#H
      ): Tuple21[T21#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H] =
        p.pudaoToTuple(item)
      override def takeHead(
        t: Tuple21[T21#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H]
      ): T21#H = t._1
      override def takeTail(
        t: Tuple21[T21#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H]
      ): XyyItem20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H] =
        ArticleXyyReverse0
          .pudao(t._21)
          .pudao(t._20)
          .pudao(t._19)
          .pudao(t._18)
          .pudao(t._17)
          .pudao(t._16)
          .pudao(t._15)
          .pudao(t._14)
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]#T, T21#T, XyyTupleType21[
          T21,
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T19,
          T20
        ]#T] = hlistPut21[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T]
    }
  def item2Plus21[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam,
    T20 <: org.scalax.asuna.mapper.item.TypeParam,
    T21 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T21, XyyTupleType21[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20,
    T21
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T21, XyyTupleType21[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19,
      T20,
      T21
    ]] {
      override def plus(
        p: XyyItem20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H],
        item: T21#H
      ): Tuple21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H] =
        p.eatToTuple(item)
      override def takeHead(
        t: Tuple21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H]
      ): T21#H = t._21
      override def takeTail(
        t: Tuple21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H]
      ): XyyItem20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H] =
        Item2Xyy0
          .eat(t._1)
          .eat(t._2)
          .eat(t._3)
          .eat(t._4)
          .eat(t._5)
          .eat(t._6)
          .eat(t._7)
          .eat(t._8)
          .eat(t._9)
          .eat(t._10)
          .eat(t._11)
          .eat(t._12)
          .eat(t._13)
          .eat(t._14)
          .eat(t._15)
          .eat(t._16)
          .eat(t._17)
          .eat(t._18)
          .eat(t._19)
          .eat(t._20)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]#T, T21#T, XyyTupleType21[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T19,
          T20,
          T21
        ]#T] = item2Plus21[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T]
    }
  def item2Put21[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam,
    T20 <: org.scalax.asuna.mapper.item.TypeParam,
    T21 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T21, XyyTupleType21[
    T21,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T21, XyyTupleType21[
      T21,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19,
      T20
    ]] {
      override def plus(
        p: XyyItem20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H],
        item: T21#H
      ): Tuple21[T21#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H] =
        p.pudaoToTuple(item)
      override def takeHead(
        t: Tuple21[T21#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H]
      ): T21#H = t._1
      override def takeTail(
        t: Tuple21[T21#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H]
      ): XyyItem20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H] =
        Item2XyyReverse0
          .pudao(t._21)
          .pudao(t._20)
          .pudao(t._19)
          .pudao(t._18)
          .pudao(t._17)
          .pudao(t._16)
          .pudao(t._15)
          .pudao(t._14)
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]#T, T21#T, XyyTupleType21[
          T21,
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T19,
          T20
        ]#T] = item2Put21[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T]
    }
  def hlistPlus22[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam,
    T20 <: org.scalax.asuna.mapper.item.TypeParam,
    T21 <: org.scalax.asuna.mapper.item.TypeParam,
    T22 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T22, XyyTupleType22[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20,
    T21,
    T22
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T22, XyyTupleType22[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19,
      T20,
      T21,
      T22
    ]] {
      override def plus(
        p: XyyItem21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H],
        item: T22#H
      ): Tuple22[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H, T22#H] =
        p.eatToTuple(item)
      override def takeHead(
        t: Tuple22[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H, T22#H]
      ): T22#H = t._22
      override def takeTail(
        t: Tuple22[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H, T22#H]
      ): XyyItem21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H] =
        ArticleXyy0
          .eat(t._1)
          .eat(t._2)
          .eat(t._3)
          .eat(t._4)
          .eat(t._5)
          .eat(t._6)
          .eat(t._7)
          .eat(t._8)
          .eat(t._9)
          .eat(t._10)
          .eat(t._11)
          .eat(t._12)
          .eat(t._13)
          .eat(t._14)
          .eat(t._15)
          .eat(t._16)
          .eat(t._17)
          .eat(t._18)
          .eat(t._19)
          .eat(t._20)
          .eat(t._21)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]#T, T22#T, XyyTupleType22[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T19,
          T20,
          T21,
          T22
        ]#T] =
        hlistPlus22[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T, T22#T]
    }
  def hlistPut22[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam,
    T20 <: org.scalax.asuna.mapper.item.TypeParam,
    T21 <: org.scalax.asuna.mapper.item.TypeParam,
    T22 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T22, XyyTupleType22[
    T22,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20,
    T21
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T22, XyyTupleType22[
      T22,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19,
      T20,
      T21
    ]] {
      override def plus(
        p: XyyItem21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H],
        item: T22#H
      ): Tuple22[T22#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H] =
        p.pudaoToTuple(item)
      override def takeHead(
        t: Tuple22[T22#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H]
      ): T22#H = t._1
      override def takeTail(
        t: Tuple22[T22#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H]
      ): XyyItem21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H] =
        ArticleXyyReverse0
          .pudao(t._22)
          .pudao(t._21)
          .pudao(t._20)
          .pudao(t._19)
          .pudao(t._18)
          .pudao(t._17)
          .pudao(t._16)
          .pudao(t._15)
          .pudao(t._14)
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]#T, T22#T, XyyTupleType22[
          T22,
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T19,
          T20,
          T21
        ]#T] = hlistPut22[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T, T22#T]
    }
  def item2Plus22[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam,
    T20 <: org.scalax.asuna.mapper.item.TypeParam,
    T21 <: org.scalax.asuna.mapper.item.TypeParam,
    T22 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T22, XyyTupleType22[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20,
    T21,
    T22
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T22, XyyTupleType22[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19,
      T20,
      T21,
      T22
    ]] {
      override def plus(
        p: XyyItem21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H],
        item: T22#H
      ): Tuple22[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H, T22#H] =
        p.eatToTuple(item)
      override def takeHead(
        t: Tuple22[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H, T22#H]
      ): T22#H = t._22
      override def takeTail(
        t: Tuple22[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H, T22#H]
      ): XyyItem21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H] =
        Item2Xyy0
          .eat(t._1)
          .eat(t._2)
          .eat(t._3)
          .eat(t._4)
          .eat(t._5)
          .eat(t._6)
          .eat(t._7)
          .eat(t._8)
          .eat(t._9)
          .eat(t._10)
          .eat(t._11)
          .eat(t._12)
          .eat(t._13)
          .eat(t._14)
          .eat(t._15)
          .eat(t._16)
          .eat(t._17)
          .eat(t._18)
          .eat(t._19)
          .eat(t._20)
          .eat(t._21)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]#T, T22#T, XyyTupleType22[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T19,
          T20,
          T21,
          T22
        ]#T] =
        item2Plus22[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T, T22#T]
    }
  def item2Put22[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam,
    T20 <: org.scalax.asuna.mapper.item.TypeParam,
    T21 <: org.scalax.asuna.mapper.item.TypeParam,
    T22 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T22, XyyTupleType22[
    T22,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20,
    T21
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T22, XyyTupleType22[
      T22,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19,
      T20,
      T21
    ]] {
      override def plus(
        p: XyyItem21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H],
        item: T22#H
      ): Tuple22[T22#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H] =
        p.pudaoToTuple(item)
      override def takeHead(
        t: Tuple22[T22#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H]
      ): T22#H = t._1
      override def takeTail(
        t: Tuple22[T22#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H]
      ): XyyItem21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H] =
        Item2XyyReverse0
          .pudao(t._22)
          .pudao(t._21)
          .pudao(t._20)
          .pudao(t._19)
          .pudao(t._18)
          .pudao(t._17)
          .pudao(t._16)
          .pudao(t._15)
          .pudao(t._14)
          .pudao(t._13)
          .pudao(t._12)
          .pudao(t._11)
          .pudao(t._10)
          .pudao(t._9)
          .pudao(t._8)
          .pudao(t._7)
          .pudao(t._6)
          .pudao(t._5)
          .pudao(t._4)
          .pudao(t._3)
          .pudao(t._2)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]#T, T22#T, XyyTupleType22[
          T22,
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T19,
          T20,
          T21
        ]#T] = item2Put22[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T, T22#T]
    }
}
