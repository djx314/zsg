package asuna.scala_tuple.tuple_support
import asuna.Plus8
import asuna.support.heterogeneous._
trait HListPlus_1_8 {
final def plusWithTypeParameter1[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1
, Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  ]:
Plus8[
X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1
, Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8
, Y1 :: X1_C1 :: HNil  , Y2 :: X2_C1 :: HNil  , Y3 :: X3_C1 :: HNil  , Y4 :: X4_C1 :: HNil  , Y5 :: X5_C1 :: HNil  , Y6 :: X6_C1 :: HNil  , Y7 :: X7_C1 :: HNil  , Y8 :: X8_C1 :: HNil
] = new Plus8[
X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1
, Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8
, Y1 :: X1_C1 :: HNil  , Y2 :: X2_C1 :: HNil  , Y3 :: X3_C1 :: HNil  , Y4 :: X4_C1 :: HNil  , Y5 :: X5_C1 :: HNil  , Y6 :: X6_C1 :: HNil  , Y7 :: X7_C1 :: HNil  , Y8 :: X8_C1 :: HNil
] {
final override def takeHead1(z: Y1 :: X1_C1 :: HNil): X1_C1 = z.tail.head
final override def takeTail1(z: Y1 :: X1_C1 :: HNil): Y1 = z.head
final override def plus1(x: X1_C1, y: Y1): Y1 :: X1_C1 :: HNil = y :: x :: HNil.value
final override def takeHead2(z: Y2 :: X2_C1 :: HNil): X2_C1 = z.tail.head
final override def takeTail2(z: Y2 :: X2_C1 :: HNil): Y2 = z.head
final override def plus2(x: X2_C1, y: Y2): Y2 :: X2_C1 :: HNil = y :: x :: HNil.value
final override def takeHead3(z: Y3 :: X3_C1 :: HNil): X3_C1 = z.tail.head
final override def takeTail3(z: Y3 :: X3_C1 :: HNil): Y3 = z.head
final override def plus3(x: X3_C1, y: Y3): Y3 :: X3_C1 :: HNil = y :: x :: HNil.value
final override def takeHead4(z: Y4 :: X4_C1 :: HNil): X4_C1 = z.tail.head
final override def takeTail4(z: Y4 :: X4_C1 :: HNil): Y4 = z.head
final override def plus4(x: X4_C1, y: Y4): Y4 :: X4_C1 :: HNil = y :: x :: HNil.value
final override def takeHead5(z: Y5 :: X5_C1 :: HNil): X5_C1 = z.tail.head
final override def takeTail5(z: Y5 :: X5_C1 :: HNil): Y5 = z.head
final override def plus5(x: X5_C1, y: Y5): Y5 :: X5_C1 :: HNil = y :: x :: HNil.value
final override def takeHead6(z: Y6 :: X6_C1 :: HNil): X6_C1 = z.tail.head
final override def takeTail6(z: Y6 :: X6_C1 :: HNil): Y6 = z.head
final override def plus6(x: X6_C1, y: Y6): Y6 :: X6_C1 :: HNil = y :: x :: HNil.value
final override def takeHead7(z: Y7 :: X7_C1 :: HNil): X7_C1 = z.tail.head
final override def takeTail7(z: Y7 :: X7_C1 :: HNil): Y7 = z.head
final override def plus7(x: X7_C1, y: Y7): Y7 :: X7_C1 :: HNil = y :: x :: HNil.value
final override def takeHead8(z: Y8 :: X8_C1 :: HNil): X8_C1 = z.tail.head
final override def takeTail8(z: Y8 :: X8_C1 :: HNil): Y8 = z.head
final override def plus8(x: X8_C1, y: Y8): Y8 :: X8_C1 :: HNil = y :: x :: HNil.value
}
}
