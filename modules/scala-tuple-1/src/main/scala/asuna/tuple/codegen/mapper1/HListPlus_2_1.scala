package asuna
import asuna.support.heterogeneous._
trait HListPlus_2_1 {
  final def plusWithTypeParameter2[X1_C1, X1_C2, Y1]: Plus1[
    X1_C1 :: X1_C2 :: HNil,
    Y1,
    Y1 :: X1_C1 :: X1_C2 :: HNil
  ] =
    new Plus1[
      X1_C1 :: X1_C2 :: HNil,
      Y1,
      Y1 :: X1_C1 :: X1_C2 :: HNil
    ] {
      final override def takeHead1(z: Y1 :: X1_C1 :: X1_C2 :: HNil): X1_C1 :: X1_C2 :: HNil    = z.tail
      final override def takeTail1(z: Y1 :: X1_C1 :: X1_C2 :: HNil): Y1                        = z.head
      final override def plus1(x: X1_C1 :: X1_C2 :: HNil, y: Y1): Y1 :: X1_C1 :: X1_C2 :: HNil = x.::(y)
    }
}
