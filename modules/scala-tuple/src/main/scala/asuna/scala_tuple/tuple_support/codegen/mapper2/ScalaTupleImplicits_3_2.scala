package asuna.scala_tuple.tuple_support
import asuna.Application2
import asuna.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_3_2 {
final implicit def tupleTagApplicationImplicit_tagNum3_typeParamNum2[
F[_  , _ ]
, H1  , H2  , H3
, X1_C1  , X1_C2
, X2_C1  , X2_C2
, X3_C1  , X3_C2
]
(implicit
t1: Application2[F, H1  , X1_C1  , X1_C2 ]
, t2: Application2[F, H2  , X2_C1  , X2_C2 ]  , t3: Application2[F, H3  , X3_C1  , X3_C2 ] )
: Application2[
F,
(H1  , H2  , H3 )  , (X1_C1  , X2_C1  , X3_C1 )  , (X1_C2  , X2_C2  , X3_C2 ) ] =
{ context: Context2[F] =>
context.append(
context.append(t3.application(context), t2.application(context))(HListPlus2.plusWithTypeParameter1)
, t1.application(context))(PlusToTuple2.plusWithTypeParameter2)
}
}
