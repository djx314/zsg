package net.scalax.asuna.hepler

import net.scalax.asuna.core._
import net.scalax.asuna.core.common.DelayTag

trait DataShapeValueHelper[D] {
  def wrap[A, B, C](rep: A)(implicit shape: DataShape[A, B, C, D]): C = {
    shape.wrapRep(rep)
  }
  def shaped[A, B, C](rep: A)(implicit shape: DataShape[A, B, C, D]): DataShapeValue[B, D] = {
    val shape1 = shape
    val rep1 = rep
    new DataShapeValue[B, D] {
      override type RepType = C
      override val rep = shape1.wrapRep(rep1)
      override val shape = shape1.packed
    }
  }
}

trait DelayTagHelper[CommonCol] {
  def delay[Data]: DelayTag[Data, CommonCol] = {
    new DelayTag[Data, CommonCol] {}
  }
}

trait DateModelHelper[Abs] {

  def toOutput[A, B, C](rep: A)(implicit shape: DataShape[A, B, C, Abs]): DataShapeValue[OutputData[B], Abs] = {
    val rep1 = rep
    val shape1 = shape
    val sv = new DataShapeValue[B, Abs] {
      override type RepType = C
      override val rep = shape1.wrapRep(rep1)
      override val shape = shape1.packed
    }
    sv.map(s => OutputData.lift(s))
  }

  def toSubOnly[A, B, C](rep: A)(implicit shape: DataShape[A, B, C, Abs]): DataShapeValue[SubOnly[B], Abs] = {
    val rep1 = rep
    val shape1 = shape
    val sv = new DataShapeValue[B, Abs] {
      override type RepType = C
      override val rep = shape1.wrapRep(rep1)
      override val shape = shape1.packed
    }
    sv.map(s => SubOnly.lift(s))
  }

  def toSub[A, B, C](rep: A)(implicit shape: DataShape[A, B, C, Abs]): DataShapeValue[OutputSubData[B, B], Abs] = {
    val rep1 = rep
    val shape1 = shape
    val sv = new DataShapeValue[B, Abs] {
      override type RepType = C
      override val rep = shape1.wrapRep(rep1)
      override val shape = shape1.packed
    }
    sv.map(s => OutputSubData.simpleLift(s))
  }

}