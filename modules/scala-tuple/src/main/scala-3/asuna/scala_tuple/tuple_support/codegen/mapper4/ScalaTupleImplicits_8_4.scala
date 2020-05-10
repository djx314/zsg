package asuna.scala_tuple.tuple_support
import asuna.Application4
import asuna.Context4
import scala.language.higherKinds
trait ScalaTupleImplicits_8_4 {
         given  tupleTagApplicationImplicit_tagNum8_typeParamNum4[
            F[_ , _ , _ , _],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8
        ]( using 
        t1: Application4[F, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1] , t2: Application4[F, Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2] , t3: Application4[F, Plus1_X3 , Plus2_X3 , Plus3_X3 , Plus4_X3] , t4: Application4[F, Plus1_X4 , Plus2_X4 , Plus3_X4 , Plus4_X4] , t5: Application4[F, Plus1_X5 , Plus2_X5 , Plus3_X5 , Plus4_X5] , t6: Application4[F, Plus1_X6 , Plus2_X6 , Plus3_X6 , Plus4_X6] , t7: Application4[F, Plus1_X7 , Plus2_X7 , Plus3_X7 , Plus4_X7] , t8: Application4[F, Plus1_X8 , Plus2_X8 , Plus3_X8 , Plus4_X8])  as  Application4[
            F,
            Tuple8[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8],
            Tuple8[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8],
            Tuple8[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8],
            Tuple8[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8]
        ] = new Application4[
            F,
            Tuple8[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8],
            Tuple8[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8],
            Tuple8[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8],
            Tuple8[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8]
        ] {
            override def application(context: Context4[F]): F[
                Tuple8[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8],
                Tuple8[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8],
                Tuple8[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8],
                Tuple8[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8]
            ] = {
                val implicitApplication = implicitly[Application4[F, asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X1 , Plus1_X2] , asuna.AsunaTuple2[Plus1_X3 , Plus1_X4]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X5 , Plus1_X6] , asuna.AsunaTuple2[Plus1_X7 , Plus1_X8]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus2_X1 , Plus2_X2] , asuna.AsunaTuple2[Plus2_X3 , Plus2_X4]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus2_X5 , Plus2_X6] , asuna.AsunaTuple2[Plus2_X7 , Plus2_X8]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus3_X1 , Plus3_X2] , asuna.AsunaTuple2[Plus3_X3 , Plus3_X4]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus3_X5 , Plus3_X6] , asuna.AsunaTuple2[Plus3_X7 , Plus3_X8]]] , asuna.AsunaTuple2[asuna.AsunaTuple2[asuna.AsunaTuple2[Plus4_X1 , Plus4_X2] , asuna.AsunaTuple2[Plus4_X3 , Plus4_X4]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus4_X5 , Plus4_X6] , asuna.AsunaTuple2[Plus4_X7 , Plus4_X8]]]
                ]]
                context.append(implicitApplication.application(context), context.start)(PlusToTuple4.plus4WithTypeParameter8)
            }
        }
}
object ScalaTupleImplicits_8_4 extends ScalaTupleImplicits_8_4