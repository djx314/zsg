package asuna.scala_tuple.tuple_support
import asuna.Application2
import asuna.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_18_2 {
         given  tupleTagApplicationImplicit_tagNum18_typeParamNum2[
            F[_ , _],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18
        ]( using 
        t1: Application2[F, Plus1_X1 , Plus2_X1] , t2: Application2[F, Plus1_X2 , Plus2_X2] , t3: Application2[F, Plus1_X3 , Plus2_X3] , t4: Application2[F, Plus1_X4 , Plus2_X4] , t5: Application2[F, Plus1_X5 , Plus2_X5] , t6: Application2[F, Plus1_X6 , Plus2_X6] , t7: Application2[F, Plus1_X7 , Plus2_X7] , t8: Application2[F, Plus1_X8 , Plus2_X8] , t9: Application2[F, Plus1_X9 , Plus2_X9] , t10: Application2[F, Plus1_X10 , Plus2_X10] , t11: Application2[F, Plus1_X11 , Plus2_X11] , t12: Application2[F, Plus1_X12 , Plus2_X12] , t13: Application2[F, Plus1_X13 , Plus2_X13] , t14: Application2[F, Plus1_X14 , Plus2_X14] , t15: Application2[F, Plus1_X15 , Plus2_X15] , t16: Application2[F, Plus1_X16 , Plus2_X16] , t17: Application2[F, Plus1_X17 , Plus2_X17] , t18: Application2[F, Plus1_X18 , Plus2_X18])  as  Application2[
            F,
            Tuple18[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18],
            Tuple18[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18]
        ] = new Application2[
            F,
            Tuple18[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18],
            Tuple18[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18]
        ] {
            override def application(context: Context2[F]): F[
                Tuple18[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18],
                Tuple18[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18]
            ] = {
                val implicitApplication = implicitly[Application2[F, asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X1 , Plus1_X2] , asuna.AsunaTuple2[Plus1_X3 , Plus1_X4]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X5 , Plus1_X6] , asuna.AsunaTuple2[Plus1_X7 , Plus1_X8]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X9 , Plus1_X10] , asuna.AsunaTuple2[Plus1_X11 , Plus1_X12]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X13 , Plus1_X14] , asuna.AsunaTuple2[Plus1_X15 , Plus1_X16]]]] , asuna.AsunaTuple1[asuna.AsunaTuple1[asuna.AsunaTuple1[asuna.AsunaTuple2[Plus1_X17 , Plus1_X18]]]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus2_X1 , Plus2_X2] , asuna.AsunaTuple2[Plus2_X3 , Plus2_X4]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus2_X5 , Plus2_X6] , asuna.AsunaTuple2[Plus2_X7 , Plus2_X8]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus2_X9 , Plus2_X10] , asuna.AsunaTuple2[Plus2_X11 , Plus2_X12]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus2_X13 , Plus2_X14] , asuna.AsunaTuple2[Plus2_X15 , Plus2_X16]]]] , asuna.AsunaTuple1[asuna.AsunaTuple1[asuna.AsunaTuple1[asuna.AsunaTuple2[Plus2_X17 , Plus2_X18]]]]]
                ]]
                context.append(implicitApplication.application(context), context.start)(PlusToTuple2.plus2WithTypeParameter18)
            }
        }
}
object ScalaTupleImplicits_18_2 extends ScalaTupleImplicits_18_2
