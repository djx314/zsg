package zsg.scala_tuple.tuple_support
import zsg.Application1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_19_1 {
         given  tupleTagApplicationImplicit_tagNum19_typeParamNum1[
            F[_],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19
        ]( using 
        t1: F[Plus1_X1] , t2: F[Plus1_X2] , t3: F[Plus1_X3] , t4: F[Plus1_X4] , t5: F[Plus1_X5] , t6: F[Plus1_X6] , t7: F[Plus1_X7] , t8: F[Plus1_X8] , t9: F[Plus1_X9] , t10: F[Plus1_X10] , t11: F[Plus1_X11] , t12: F[Plus1_X12] , t13: F[Plus1_X13] , t14: F[Plus1_X14] , t15: F[Plus1_X15] , t16: F[Plus1_X16] , t17: F[Plus1_X17] , t18: F[Plus1_X18] , t19: F[Plus1_X19])  as  Application1[
            F,
            Tuple19[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19]
        ] = new Application1[
            F,
            Tuple19[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19]
        ] {
            override def application(context: Context1[F]): F[
                Tuple19[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19]
            ] = {
                val implicitApplication = implicitly[Application1[F, zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X5 , Plus1_X6] , zsg.ZsgTuple2[Plus1_X7 , Plus1_X8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X9 , Plus1_X10] , zsg.ZsgTuple2[Plus1_X11 , Plus1_X12]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X13 , Plus1_X14] , zsg.ZsgTuple2[Plus1_X15 , Plus1_X16]]]] , zsg.NodeTuple1[zsg.NodeTuple1[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X17 , Plus1_X18] , zsg.ZsgTuple1[Plus1_X19]]]]]
                ]]
                context.append(implicitApplication.application(context), context.start)(PlusToTuple1.plus1WithTypeParameter19)
            }
        }
}
object ScalaTupleImplicits_19_1 extends ScalaTupleImplicits_19_1