package org.scalax.asuna.mapper.item
class TreeItem17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[T7]#AddRightItem[
    T8
  ]#AddRightItem[T9]#AddRightItem[T10]#AddRightItem[T11]#AddRightItem[T12]#AddRightItem[T13]#AddRightItem[T14]#AddRightItem[T15]#AddRightItem[T16]#AddRightItem[T17]
) extends AnyVal
    with Item17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] {
  override def eat[T](xyy: T): TreeItem18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T] =
    new TreeItem18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T](item.addRightItem(xyy))
  override def rightHead: T17                                                                               = item.dropRightItem
  override def rightTail: TreeItem16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = new TreeItem16(item.dropRight)
  def i1: T1                                                                                                = item.item.i1.i1.i1.i1.i1
  def i2: T2                                                                                                = item.item.i1.i1.i1.i1.i2
  def i3: T3                                                                                                = item.item.i1.i1.i1.i2.i1
  def i4: T4                                                                                                = item.item.i1.i1.i1.i2.i2
  def i5: T5                                                                                                = item.item.i1.i1.i2.i1.i1
  def i6: T6                                                                                                = item.item.i1.i1.i2.i1.i2
  def i7: T7                                                                                                = item.item.i1.i1.i2.i2.i1
  def i8: T8                                                                                                = item.item.i1.i1.i2.i2.i2
  def i9: T9                                                                                                = item.item.i1.i2.i1.i1.i1
  def i10: T10                                                                                              = item.item.i1.i2.i1.i1.i2
  def i11: T11                                                                                              = item.item.i1.i2.i1.i2.i1
  def i12: T12                                                                                              = item.item.i1.i2.i1.i2.i2
  def i13: T13                                                                                              = item.item.i1.i2.i2.i1.i1
  def i14: T14                                                                                              = item.item.i1.i2.i2.i1.i2
  def i15: T15                                                                                              = item.item.i1.i2.i2.i2.i1
  def i16: T16                                                                                              = item.item.i1.i2.i2.i2.i2
  def i17: T17                                                                                              = item.item.i2.i1.i1.i1.i1
}
class ReverseTreeItem17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T17]#AddRightItem[T16]#AddRightItem[T15]#AddRightItem[T14]#AddRightItem[T13]#AddRightItem[T12]#AddRightItem[
    T11
  ]#AddRightItem[T10]#AddRightItem[T9]#AddRightItem[T8]#AddRightItem[T7]#AddRightItem[T6]#AddRightItem[T5]#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[
    T1
  ]
) extends AnyVal
    with Item17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] {
  override def pudao[T](xyy: T): ReverseTreeItem18[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    new ReverseTreeItem18[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](item.addRightItem(xyy))
  override def leftHead: T1                                                                                        = item.dropRightItem
  override def leftTail: ReverseTreeItem16[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = new ReverseTreeItem16(item.dropRight)
  def i1: T1                                                                                                       = item.item.i2.i1.i1.i1.i1
  def i2: T2                                                                                                       = item.item.i1.i2.i2.i2.i2
  def i3: T3                                                                                                       = item.item.i1.i2.i2.i2.i1
  def i4: T4                                                                                                       = item.item.i1.i2.i2.i1.i2
  def i5: T5                                                                                                       = item.item.i1.i2.i2.i1.i1
  def i6: T6                                                                                                       = item.item.i1.i2.i1.i2.i2
  def i7: T7                                                                                                       = item.item.i1.i2.i1.i2.i1
  def i8: T8                                                                                                       = item.item.i1.i2.i1.i1.i2
  def i9: T9                                                                                                       = item.item.i1.i2.i1.i1.i1
  def i10: T10                                                                                                     = item.item.i1.i1.i2.i2.i2
  def i11: T11                                                                                                     = item.item.i1.i1.i2.i2.i1
  def i12: T12                                                                                                     = item.item.i1.i1.i2.i1.i2
  def i13: T13                                                                                                     = item.item.i1.i1.i2.i1.i1
  def i14: T14                                                                                                     = item.item.i1.i1.i1.i2.i2
  def i15: T15                                                                                                     = item.item.i1.i1.i1.i2.i1
  def i16: T16                                                                                                     = item.item.i1.i1.i1.i1.i2
  def i17: T17                                                                                                     = item.item.i1.i1.i1.i1.i1
}
