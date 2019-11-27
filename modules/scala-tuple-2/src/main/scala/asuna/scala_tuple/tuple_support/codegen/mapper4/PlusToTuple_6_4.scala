package asuna.scala_tuple.tuple_support
import asuna.Plus4
import asuna.support.heterogeneous._
trait PlusToTuple_6_4 {
final def plusWithTypeParameter6[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6    , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6
, Y1  , Y2  , Y3  , Y4  ]:
Plus4[
X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  HNil
,  X2_C1 ::  X2_C2 ::  X2_C3 ::  X2_C4 ::  X2_C5 ::  X2_C6 ::  HNil  ,  X3_C1 ::  X3_C2 ::  X3_C3 ::  X3_C4 ::  X3_C5 ::  X3_C6 ::  HNil  ,  X4_C1 ::  X4_C2 ::  X4_C3 ::  X4_C4 ::  X4_C5 ::  X4_C6 ::  HNil
, Y1  , Y2  , Y3  , Y4
, ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  )  , ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  )  , ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  )  , ( Y4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  )
] = new Plus4[
X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  HNil
,  X2_C1 ::  X2_C2 ::  X2_C3 ::  X2_C4 ::  X2_C5 ::  X2_C6 ::  HNil  ,  X3_C1 ::  X3_C2 ::  X3_C3 ::  X3_C4 ::  X3_C5 ::  X3_C6 ::  HNil  ,  X4_C1 ::  X4_C2 ::  X4_C3 ::  X4_C4 ::  X4_C5 ::  X4_C6 ::  HNil
, Y1  , Y2  , Y3  , Y4
, ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  )  , ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  )  , ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  )  , ( Y4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  )
] {
final override def takeHead1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  )):  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  HNil =
z._2 ::  z._3 ::  z._4 ::  z._5 ::  z._6 ::  z._7 ::  HNil.value
final override def takeTail1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  )): Y1 = z._1
final override def plus1(x:  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  HNil, y: Y1): ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ) =
(y  , x  .head  , x  .tail  .head  , x  .tail  .tail  .head  , x  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .head )
final override def takeHead2(z: ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  )):  X2_C1 ::  X2_C2 ::  X2_C3 ::  X2_C4 ::  X2_C5 ::  X2_C6 ::  HNil =
z._2 ::  z._3 ::  z._4 ::  z._5 ::  z._6 ::  z._7 ::  HNil.value
final override def takeTail2(z: ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  )): Y2 = z._1
final override def plus2(x:  X2_C1 ::  X2_C2 ::  X2_C3 ::  X2_C4 ::  X2_C5 ::  X2_C6 ::  HNil, y: Y2): ( Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  ) =
(y  , x  .head  , x  .tail  .head  , x  .tail  .tail  .head  , x  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .head )
final override def takeHead3(z: ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  )):  X3_C1 ::  X3_C2 ::  X3_C3 ::  X3_C4 ::  X3_C5 ::  X3_C6 ::  HNil =
z._2 ::  z._3 ::  z._4 ::  z._5 ::  z._6 ::  z._7 ::  HNil.value
final override def takeTail3(z: ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  )): Y3 = z._1
final override def plus3(x:  X3_C1 ::  X3_C2 ::  X3_C3 ::  X3_C4 ::  X3_C5 ::  X3_C6 ::  HNil, y: Y3): ( Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  ) =
(y  , x  .head  , x  .tail  .head  , x  .tail  .tail  .head  , x  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .head )
final override def takeHead4(z: ( Y4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  )):  X4_C1 ::  X4_C2 ::  X4_C3 ::  X4_C4 ::  X4_C5 ::  X4_C6 ::  HNil =
z._2 ::  z._3 ::  z._4 ::  z._5 ::  z._6 ::  z._7 ::  HNil.value
final override def takeTail4(z: ( Y4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  )): Y4 = z._1
final override def plus4(x:  X4_C1 ::  X4_C2 ::  X4_C3 ::  X4_C4 ::  X4_C5 ::  X4_C6 ::  HNil, y: Y4): ( Y4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  ) =
(y  , x  .head  , x  .tail  .head  , x  .tail  .tail  .head  , x  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .head )
}
}