package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_15_1 {
         implicit def  tupleTagApplicationImplicit_tagNum15_typeParamNum1[
            F[_],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15
        ]( implicit 
        t1: Application1[F, Plus1_X1] , t2: Application1[F, Plus1_X2] , t3: Application1[F, Plus1_X3] , t4: Application1[F, Plus1_X4] , t5: Application1[F, Plus1_X5] , t6: Application1[F, Plus1_X6] , t7: Application1[F, Plus1_X7] , t8: Application1[F, Plus1_X8] , t9: Application1[F, Plus1_X9] , t10: Application1[F, Plus1_X10] , t11: Application1[F, Plus1_X11] , t12: Application1[F, Plus1_X12] , t13: Application1[F, Plus1_X13] , t14: Application1[F, Plus1_X14] , t15: Application1[F, Plus1_X15])  :  Application1[
            F,
            Tuple15[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15]
        ] = new Application1[
            F,
            Tuple15[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15]
        ] {
            override def application(context: Context1[F]): F[
                Tuple15[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15]
            ] = {
                val implicitApplication = implicitly[Application1[F, asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X1 , Plus1_X2] , asuna.AsunaTuple2[Plus1_X3 , Plus1_X4]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X5 , Plus1_X6] , asuna.AsunaTuple2[Plus1_X7 , Plus1_X8]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X9 , Plus1_X10] , asuna.AsunaTuple2[Plus1_X11 , Plus1_X12]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X13 , Plus1_X14] , asuna.AsunaTuple1[Plus1_X15]]]]
                ]]
                context.append(implicitApplication.application(context), context.start)(PlusToTuple1.plus1WithTypeParameter15)
            }
        }
}
object ScalaTupleImplicits_15_1 extends ScalaTupleImplicits_15_1