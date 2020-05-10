package asuna.scala_tuple.tuple_support
import asuna.Application3
import asuna.Context3
import scala.language.higherKinds
trait ScalaTupleImplicits_3_3 {
         given  tupleTagApplicationImplicit_tagNum3_typeParamNum3[
            F[_ , _ , _],
            Plus1_X1 , Plus1_X2 , Plus1_X3,
            Plus2_X1 , Plus2_X2 , Plus2_X3,
            Plus3_X1 , Plus3_X2 , Plus3_X3
        ]( using 
        t1: Application3[F, Plus1_X1 , Plus2_X1 , Plus3_X1] , t2: Application3[F, Plus1_X2 , Plus2_X2 , Plus3_X2] , t3: Application3[F, Plus1_X3 , Plus2_X3 , Plus3_X3])  as  Application3[
            F,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3]
        ] = new Application3[
            F,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3]
        ] {
            override def application(context: Context3[F]): F[
                Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
                Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
                Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3]
            ] = {
                val implicitApplication = implicitly[Application3[F, asuna.AsunaTuple2[asuna.AsunaTuple2[Plus1_X1 , Plus1_X2] , asuna.AsunaTuple1[Plus1_X3]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus2_X1 , Plus2_X2] , asuna.AsunaTuple1[Plus2_X3]] , asuna.AsunaTuple2[asuna.AsunaTuple2[Plus3_X1 , Plus3_X2] , asuna.AsunaTuple1[Plus3_X3]]
                ]]
                context.append(implicitApplication.application(context), context.start)(PlusToTuple3.plus3WithTypeParameter3)
            }
        }
}
object ScalaTupleImplicits_3_3 extends ScalaTupleImplicits_3_3
