package asuna.scala_tuple.tuple_support
import asuna.Application3
import asuna.Context3
import scala.language.higherKinds
trait ScalaTupleImplicits_17_3 {
         implicit def  tupleTagApplicationImplicit_tagNum17_typeParamNum3[
            F[_ , _ , _],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17
        ]( implicit 
        t1: Application3[F, Plus1_X1 , Plus2_X1 , Plus3_X1] , t2: Application3[F, Plus1_X2 , Plus2_X2 , Plus3_X2] , t3: Application3[F, Plus1_X3 , Plus2_X3 , Plus3_X3] , t4: Application3[F, Plus1_X4 , Plus2_X4 , Plus3_X4] , t5: Application3[F, Plus1_X5 , Plus2_X5 , Plus3_X5] , t6: Application3[F, Plus1_X6 , Plus2_X6 , Plus3_X6] , t7: Application3[F, Plus1_X7 , Plus2_X7 , Plus3_X7] , t8: Application3[F, Plus1_X8 , Plus2_X8 , Plus3_X8] , t9: Application3[F, Plus1_X9 , Plus2_X9 , Plus3_X9] , t10: Application3[F, Plus1_X10 , Plus2_X10 , Plus3_X10] , t11: Application3[F, Plus1_X11 , Plus2_X11 , Plus3_X11] , t12: Application3[F, Plus1_X12 , Plus2_X12 , Plus3_X12] , t13: Application3[F, Plus1_X13 , Plus2_X13 , Plus3_X13] , t14: Application3[F, Plus1_X14 , Plus2_X14 , Plus3_X14] , t15: Application3[F, Plus1_X15 , Plus2_X15 , Plus3_X15] , t16: Application3[F, Plus1_X16 , Plus2_X16 , Plus3_X16] , t17: Application3[F, Plus1_X17 , Plus2_X17 , Plus3_X17])  :  Application3[
            F,
            Tuple17[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17],
            Tuple17[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17],
            Tuple17[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17]
        ] = new Application3[
            F,
            Tuple17[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17],
            Tuple17[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17],
            Tuple17[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17]
        ] {
            override def application(context: Context3[F]): F[
                Tuple17[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17],
                Tuple17[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17],
                Tuple17[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17]
            ] = {
                val implicitApplication = implicitly[Application3[F, asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X1 , Plus1_X2] , asuna.AsunaTuple2[Plus1_X3 , Plus1_X4]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X5 , Plus1_X6] , asuna.AsunaTuple2[Plus1_X7 , Plus1_X8]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X9 , Plus1_X10] , asuna.AsunaTuple2[Plus1_X11 , Plus1_X12]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X13 , Plus1_X14] , asuna.AsunaTuple2[Plus1_X15 , Plus1_X16]]]] , asuna.AsunaTuple1[asuna.AsunaTuple1[asuna.AsunaTuple1[asuna.AsunaTuple1[Plus1_X17]]]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus2_X1 , Plus2_X2] , asuna.AsunaTuple2[Plus2_X3 , Plus2_X4]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus2_X5 , Plus2_X6] , asuna.AsunaTuple2[Plus2_X7 , Plus2_X8]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus2_X9 , Plus2_X10] , asuna.AsunaTuple2[Plus2_X11 , Plus2_X12]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus2_X13 , Plus2_X14] , asuna.AsunaTuple2[Plus2_X15 , Plus2_X16]]]] , asuna.AsunaTuple1[asuna.AsunaTuple1[asuna.AsunaTuple1[asuna.AsunaTuple1[Plus2_X17]]]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus3_X1 , Plus3_X2] , asuna.AsunaTuple2[Plus3_X3 , Plus3_X4]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus3_X5 , Plus3_X6] , asuna.AsunaTuple2[Plus3_X7 , Plus3_X8]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus3_X9 , Plus3_X10] , asuna.AsunaTuple2[Plus3_X11 , Plus3_X12]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus3_X13 , Plus3_X14] , asuna.AsunaTuple2[Plus3_X15 , Plus3_X16]]]] , asuna.AsunaTuple1[asuna.AsunaTuple1[asuna.AsunaTuple1[asuna.AsunaTuple1[Plus3_X17]]]]]
                ]]
                context.append(implicitApplication.application(context), context.start)(PlusToTuple3.plus3WithTypeParameter17)
            }
        }
}
object ScalaTupleImplicits_17_3 extends ScalaTupleImplicits_17_3
