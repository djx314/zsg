package asuna.scala_tuple.tuple_support
import asuna.Application4
import asuna.Context4
import scala.language.higherKinds
trait ScalaTupleImplicits_3_4 {
         implicit def  tupleTagApplicationImplicit_tagNum3_typeParamNum4[
            F[_ , _ , _ , _],
            Plus1_X1 , Plus1_X2 , Plus1_X3,
            Plus2_X1 , Plus2_X2 , Plus2_X3,
            Plus3_X1 , Plus3_X2 , Plus3_X3,
            Plus4_X1 , Plus4_X2 , Plus4_X3
        ]( implicit 
        t1: Application4[F, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1] , t2: Application4[F, Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2] , t3: Application4[F, Plus1_X3 , Plus2_X3 , Plus3_X3 , Plus4_X3])  :  Application4[
            F,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3]
        ] = new Application4[
            F,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3]
        ] {
            override def application(context: Context4[F]): F[
                Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
                Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
                Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
                Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3]
            ] = {
                val implicitApplication = implicitly[Application4[F, asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X1 , Plus1_X2] , asuna.AsunaTuple1[Plus1_X3]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus2_X1 , Plus2_X2] , asuna.AsunaTuple1[Plus2_X3]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus3_X1 , Plus3_X2] , asuna.AsunaTuple1[Plus3_X3]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus4_X1 , Plus4_X2] , asuna.AsunaTuple1[Plus4_X3]]
                ]]
                context.append(implicitApplication.application(context), context.start)(PlusToTuple4.plus4WithTypeParameter3)
            }
        }
}
object ScalaTupleImplicits_3_4 extends ScalaTupleImplicits_3_4
