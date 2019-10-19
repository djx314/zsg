package asuna

trait TupleTypeHListPlus1 {

  @inline def hlistPlus1[T1 <: TypeHList]: Plus[TupleTypeHList0, T1, TupleTypeHList1[T1]] =
    hlistPlusAny.asInstanceOf[Plus[TupleTypeHList0, T1, TupleTypeHList1[T1]]]
  @inline def hlistPut1[T1 <: TypeHList]: Plus[TupleTypeHList0, T1, TupleTypeHList1[T1]] =
    hlistPutAny.asInstanceOf[Plus[TupleTypeHList0, T1, TupleTypeHList1[T1]]]

  val hlistPlusAny: Plus[TupleTypeHList0, AnyTypeHList, TupleTypeHList1[AnyTypeHList]] =
    new Plus[TupleTypeHList0, AnyTypeHList, TupleTypeHList1[AnyTypeHList]] {
      override def plus(p: TupleTypeHList0#H, item: AnyTypeHList#H): AsunaTuple1[AnyTypeHList#H]      = HListTuple0.add(item)
      override def takeTail(t: AsunaTuple1[AnyTypeHList#H]): AnyTypeHList#H                           = t.i1
      override def takeHead(t: AsunaTuple1[AnyTypeHList#H]): TupleTypeHList0#H                        = HListTuple0
      override lazy val sub: Plus[TupleTypeHList0#T, AnyTypeHList#T, TupleTypeHList1[AnyTypeHList#T]] = hlistPlusAny
    }
  val hlistPutAny: Plus[TupleTypeHList0, AnyTypeHList, TupleTypeHList1[AnyTypeHList]] =
    new Plus[TupleTypeHList0, AnyTypeHList, TupleTypeHList1[AnyTypeHList]] {
      override def plus(p: TupleTypeHList0#H, item: AnyTypeHList#H): AsunaTuple1[AnyTypeHList#H]      = ReverseHListTuple0.pull(item)
      override def takeTail(t: AsunaTuple1[AnyTypeHList#H]): AnyTypeHList#H                           = t.i1
      override def takeHead(t: AsunaTuple1[AnyTypeHList#H]): TupleTypeHList0#H                        = ReverseHListTuple0
      override lazy val sub: Plus[TupleTypeHList0#T, AnyTypeHList#T, TupleTypeHList1[AnyTypeHList#T]] = hlistPutAny
    }

}

object TupleTypeHListPlus1 extends TupleTypeHListPlus1
