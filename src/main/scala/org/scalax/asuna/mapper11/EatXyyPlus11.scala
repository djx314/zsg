package org.scalax.asuna.mapper.item
object ArticleXyyPlus11 {
  def plus11[
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
    T11 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] {
      override def plus(
        p: Item10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H],
        item: T11#H
      ): Item11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]                               = p.eat(item)
      override def takeHead(t: Item11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]): T11#H = t.rightHead
      override def takeTail(
        t: Item11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]
      ): Item10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H] = t.rightTail
      override def sub
        : org.scalax.asuna.mapper.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]#T, T11#T, EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]#T] =
        plus11[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T]
    }
  def put11[
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
    T11 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, EatXyyType11[T11, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, EatXyyType11[T11, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {
      override def plus(
        p: Item10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H],
        item: T11#H
      ): Item11[T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]                               = p.pudao(item)
      override def takeHead(t: Item11[T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]): T11#H = t.leftHead
      override def takeTail(
        t: Item11[T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]
      ): Item10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H] = t.leftTail
      override def sub
        : org.scalax.asuna.mapper.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]#T, T11#T, EatXyyType11[T11, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]#T] =
        put11[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T]
    }
}
class TypeParam11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] extends org.scalax.asuna.mapper.TypeParam {
  override type H = T1
  override type T = TypeParam10[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
}
