package asuna.scala_tuple.tuple_support
import asuna.Plus4
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_2_4 {
        final def plus4WithTypeParameter2[
            Plus1_X1 , Plus1_X2,
            Plus2_X1 , Plus2_X2,
            Plus3_X1 , Plus3_X2,
            Plus4_X1 , Plus4_X2
        ]: Plus4[
            AsunaTuple2[Plus1_X1 , Plus1_X2],
            AsunaTuple2[Plus2_X1 , Plus2_X2],
            AsunaTuple2[Plus3_X1 , Plus3_X2],
            AsunaTuple2[Plus4_X1 , Plus4_X2],
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2],
            Tuple2[Plus3_X1 , Plus3_X2],
            Tuple2[Plus4_X1 , Plus4_X2]
        ] = new Plus4[
            AsunaTuple2[Plus1_X1 , Plus1_X2],
            AsunaTuple2[Plus2_X1 , Plus2_X2],
            AsunaTuple2[Plus3_X1 , Plus3_X2],
            AsunaTuple2[Plus4_X1 , Plus4_X2],
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2],
            Tuple2[Plus3_X1 , Plus3_X2],
            Tuple2[Plus4_X1 , Plus4_X2]
        ] {
                final override def takeHead1(z: Tuple2[Plus1_X1 , Plus1_X2]): AsunaTuple2[Plus1_X1 , Plus1_X2] =
                    BuildContent.tuple2(z._1 , z._2)
                final override def takeTail1(z: Tuple2[Plus1_X1 , Plus1_X2]): AsunaTuple0 = AsunaTuple0.value
                final override def plus1(x: AsunaTuple2[Plus1_X1 , Plus1_X2], y: AsunaTuple0): Tuple2[Plus1_X1 , Plus1_X2] =
                    Tuple2(x.i1 , x.i2)
                final override def takeHead2(z: Tuple2[Plus2_X1 , Plus2_X2]): AsunaTuple2[Plus2_X1 , Plus2_X2] =
                    BuildContent.tuple2(z._1 , z._2)
                final override def takeTail2(z: Tuple2[Plus2_X1 , Plus2_X2]): AsunaTuple0 = AsunaTuple0.value
                final override def plus2(x: AsunaTuple2[Plus2_X1 , Plus2_X2], y: AsunaTuple0): Tuple2[Plus2_X1 , Plus2_X2] =
                    Tuple2(x.i1 , x.i2)
                final override def takeHead3(z: Tuple2[Plus3_X1 , Plus3_X2]): AsunaTuple2[Plus3_X1 , Plus3_X2] =
                    BuildContent.tuple2(z._1 , z._2)
                final override def takeTail3(z: Tuple2[Plus3_X1 , Plus3_X2]): AsunaTuple0 = AsunaTuple0.value
                final override def plus3(x: AsunaTuple2[Plus3_X1 , Plus3_X2], y: AsunaTuple0): Tuple2[Plus3_X1 , Plus3_X2] =
                    Tuple2(x.i1 , x.i2)
                final override def takeHead4(z: Tuple2[Plus4_X1 , Plus4_X2]): AsunaTuple2[Plus4_X1 , Plus4_X2] =
                    BuildContent.tuple2(z._1 , z._2)
                final override def takeTail4(z: Tuple2[Plus4_X1 , Plus4_X2]): AsunaTuple0 = AsunaTuple0.value
                final override def plus4(x: AsunaTuple2[Plus4_X1 , Plus4_X2], y: AsunaTuple0): Tuple2[Plus4_X1 , Plus4_X2] =
                    Tuple2(x.i1 , x.i2)
        }
}
