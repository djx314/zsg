package zsg.scala_tuple.tuple_support
import zsg.Application2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_17_2 {
         implicit def tupleTagApplicationImplicit_tagNum17_typeParamNum2  [
            F[_ , _],
            T <: Context2[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17
        ]( implicit 
              t1: F[  Plus1_X1   ,  Plus2_X1 ],   t2: F[  Plus1_X2   ,  Plus2_X2 ],   t3: F[  Plus1_X3   ,  Plus2_X3 ],   t4: F[  Plus1_X4   ,  Plus2_X4 ],   t5: F[  Plus1_X5   ,  Plus2_X5 ],   t6: F[  Plus1_X6   ,  Plus2_X6 ],   t7: F[  Plus1_X7   ,  Plus2_X7 ],   t8: F[  Plus1_X8   ,  Plus2_X8 ],   t9: F[  Plus1_X9   ,  Plus2_X9 ],   t10: F[  Plus1_X10   ,  Plus2_X10 ],   t11: F[  Plus1_X11   ,  Plus2_X11 ],   t12: F[  Plus1_X12   ,  Plus2_X12 ],   t13: F[  Plus1_X13   ,  Plus2_X13 ],   t14: F[  Plus1_X14   ,  Plus2_X14 ],   t15: F[  Plus1_X15   ,  Plus2_X15 ],   t16: F[  Plus1_X16   ,  Plus2_X16 ],   t17: F[  Plus1_X17   ,  Plus2_X17 ], 
             context: T
        )  :  Application2[
            F,
            T,
            Tuple17[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17],
            Tuple17[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17]
        ] = new Application2[
            F,
            T,
            Tuple17[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17],
            Tuple17[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17]
        ](
            context.append(ApplicationFetchContent.app2[F, T, zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X5 , Plus1_X6] , zsg.ZsgTuple2[Plus1_X7 , Plus1_X8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X9 , Plus1_X10] , zsg.ZsgTuple2[Plus1_X11 , Plus1_X12]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X13 , Plus1_X14] , zsg.ZsgTuple2[Plus1_X15 , Plus1_X16]]]] , zsg.NodeTuple1[zsg.NodeTuple1[zsg.NodeTuple1[zsg.ZsgTuple1[Plus1_X17]]]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X1 , Plus2_X2] , zsg.ZsgTuple2[Plus2_X3 , Plus2_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X5 , Plus2_X6] , zsg.ZsgTuple2[Plus2_X7 , Plus2_X8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X9 , Plus2_X10] , zsg.ZsgTuple2[Plus2_X11 , Plus2_X12]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X13 , Plus2_X14] , zsg.ZsgTuple2[Plus2_X15 , Plus2_X16]]]] , zsg.NodeTuple1[zsg.NodeTuple1[zsg.NodeTuple1[zsg.ZsgTuple1[Plus2_X17]]]]]], context.start)(PlusToTuple2.plus2WithTypeParameter17)
        )
}
object ScalaTupleImplicits_17_2 extends ScalaTupleImplicits_17_2
