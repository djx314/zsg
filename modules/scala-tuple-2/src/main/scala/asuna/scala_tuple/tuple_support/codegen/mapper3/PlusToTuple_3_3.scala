package asuna.scala_tuple.tuple_support
import asuna.Plus3
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_3_3 {
        final def plus3WithTypeParameter3[
            Plus1_X1 , Plus1_X2 , Plus1_X3,
            Plus2_X1 , Plus2_X2 , Plus2_X3,
            Plus3_X1 , Plus3_X2 , Plus3_X3
        ]: Plus3[
            AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple1[Plus1_X3]],
            AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple1[Plus2_X3]],
            AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple1[Plus3_X3]],
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3]
        ] = new Plus3[
            AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple1[Plus1_X3]],
            AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple1[Plus2_X3]],
            AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple1[Plus3_X3]],
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3]
        ] {
                final override def takeHead1(z: Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]): AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple1[Plus1_X3]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple1(z._3))
                final override def takeTail1(z: Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]): AsunaTuple0 = AsunaTuple0.value
                final override def plus1(x: AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple1[Plus1_X3]], y: AsunaTuple0): Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3] =
                    Tuple3(x.i1.i1 , x.i1.i2 , x.i2.i1)
                final override def takeHead2(z: Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3]): AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple1[Plus2_X3]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple1(z._3))
                final override def takeTail2(z: Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3]): AsunaTuple0 = AsunaTuple0.value
                final override def plus2(x: AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple1[Plus2_X3]], y: AsunaTuple0): Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3] =
                    Tuple3(x.i1.i1 , x.i1.i2 , x.i2.i1)
                final override def takeHead3(z: Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3]): AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple1[Plus3_X3]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple1(z._3))
                final override def takeTail3(z: Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3]): AsunaTuple0 = AsunaTuple0.value
                final override def plus3(x: AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple1[Plus3_X3]], y: AsunaTuple0): Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3] =
                    Tuple3(x.i1.i1 , x.i1.i2 , x.i2.i1)
        }
        final def plusWithTypeParameter3[X1_C1  , X1_C2  , X1_C3 
          , X2_C1  , X2_C2  , X2_C3    , X3_C1  , X3_C2  , X3_C3  
         , Y1  , Y2  , Y3  ]:
        Plus3[
            (X1_C1  , X1_C2  , X1_C3 )
             , (X2_C1  , X2_C2  , X2_C3 )  , (X3_C1  , X3_C2  , X3_C3 ) 
             , Y1  , Y2  , Y3 
             , ( Y1  , X1_C1  , X1_C2  , X1_C3  )  , ( Y2  , X2_C1  , X2_C2  , X2_C3  )  , ( Y3  , X3_C1  , X3_C2  , X3_C3  ) 
        ] = new Plus3[
            (X1_C1  , X1_C2  , X1_C3 )
             , (X2_C1  , X2_C2  , X2_C3 )  , (X3_C1  , X3_C2  , X3_C3 ) 
             , Y1  , Y2  , Y3 
             , ( Y1  , X1_C1  , X1_C2  , X1_C3  )  , ( Y2  , X2_C1  , X2_C2  , X2_C3  )  , ( Y3  , X3_C1  , X3_C2  , X3_C3  ) 
        ] {
                final override def takeHead1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  )): (X1_C1  , X1_C2  , X1_C3 ) =
                    (z._2  , z._3  , z._4 )
                final override def takeTail1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  )): Y1 = z._1
                final override def plus1(x: (X1_C1  , X1_C2  , X1_C3 ), y: Y1): ( Y1  , X1_C1  , X1_C2  , X1_C3  ) =
                    (y  , x._1  , x._2  , x._3 )
                final override def takeHead2(z: ( Y2  , X2_C1  , X2_C2  , X2_C3  )): (X2_C1  , X2_C2  , X2_C3 ) =
                    (z._2  , z._3  , z._4 )
                final override def takeTail2(z: ( Y2  , X2_C1  , X2_C2  , X2_C3  )): Y2 = z._1
                final override def plus2(x: (X2_C1  , X2_C2  , X2_C3 ), y: Y2): ( Y2  , X2_C1  , X2_C2  , X2_C3  ) =
                    (y  , x._1  , x._2  , x._3 )
                final override def takeHead3(z: ( Y3  , X3_C1  , X3_C2  , X3_C3  )): (X3_C1  , X3_C2  , X3_C3 ) =
                    (z._2  , z._3  , z._4 )
                final override def takeTail3(z: ( Y3  , X3_C1  , X3_C2  , X3_C3  )): Y3 = z._1
                final override def plus3(x: (X3_C1  , X3_C2  , X3_C3 ), y: Y3): ( Y3  , X3_C1  , X3_C2  , X3_C3  ) =
                    (y  , x._1  , x._2  , x._3 )
        }
}