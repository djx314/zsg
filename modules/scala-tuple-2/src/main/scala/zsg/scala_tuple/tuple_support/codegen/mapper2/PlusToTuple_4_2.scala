package zsg.scala_tuple.tuple_support
import zsg.Plus2
import zsg.ZsgTuple0
import zsg.ZsgTuple1
import zsg.ZsgTuple2
import zsg.NodeTuple1
import zsg.NodeTuple2
import zsg.BuildContent
trait PlusToTuple_4_2 {
        final def plus2WithTypeParameter4[
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4
        ]: Plus2[
            NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple2[Plus1_X3 , Plus1_X4]],
            NodeTuple2[ZsgTuple2[Plus2_X1 , Plus2_X2] , ZsgTuple2[Plus2_X3 , Plus2_X4]],
            ZsgTuple0 , ZsgTuple0,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4]
        ] = new Plus2[
            NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple2[Plus1_X3 , Plus1_X4]],
            NodeTuple2[ZsgTuple2[Plus2_X1 , Plus2_X2] , ZsgTuple2[Plus2_X3 , Plus2_X4]],
            ZsgTuple0 , ZsgTuple0,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4]
        ] {
                final override def takeHead1(z: Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4]): NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple2[Plus1_X3 , Plus1_X4]] =
                    BuildContent.nodeTuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4))
                final override def takeTail1(z: Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4]): ZsgTuple0 = ZsgTuple0.value
                final override def plus1(x: NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple2[Plus1_X3 , Plus1_X4]], y: ZsgTuple0): Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4] =
                    Tuple4(x.i1.i1 , x.i1.i2 , x.i2.i1 , x.i2.i2)
                final override def takeHead2(z: Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4]): NodeTuple2[ZsgTuple2[Plus2_X1 , Plus2_X2] , ZsgTuple2[Plus2_X3 , Plus2_X4]] =
                    BuildContent.nodeTuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4))
                final override def takeTail2(z: Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4]): ZsgTuple0 = ZsgTuple0.value
                final override def plus2(x: NodeTuple2[ZsgTuple2[Plus2_X1 , Plus2_X2] , ZsgTuple2[Plus2_X3 , Plus2_X4]], y: ZsgTuple0): Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4] =
                    Tuple4(x.i1.i1 , x.i1.i2 , x.i2.i1 , x.i2.i2)
        }
}