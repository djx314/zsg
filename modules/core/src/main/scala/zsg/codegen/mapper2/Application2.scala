package zsg
abstract class Application2[F[_ , _], X1 , X2] {
    def application(context: Context2[F]): F[X1 , X2]
}