package net.scalax.asuna.shape

import net.scalax.asuna.core._
import net.scalax.asuna.core.common.{ DataGroup, DataRepGroup }
import shapeless.{ ::, HList, HNil }

trait HListShapeHelper {

  implicit def hnilDateShape[J]: DataShape[HNil, HNil, HNil, J] = {
    new DataShape[HNil, HNil, HNil, J] {
      self =>
      override def wrapRep(base: HNil): HNil = base
      override def toLawRep(base: HNil): DataRepGroup[J] = DataRepGroup(reps = List.empty)
      override def takeData(oldData: DataGroup, rep: HNil): SplitData[HNil] = SplitData(current = HNil, left = oldData)
    }
  }

  implicit def hlistDateShape[A, B <: HList, H, I <: HList, M, N <: HList, J](implicit head: DataShape[A, H, M, J], tail: DataShape[B, I, N, J]): DataShape[A :: B, H :: I, M :: N, J] = {

    new DataShape[A :: B, H :: I, M :: N, J] {
      self =>

      override def wrapRep(base: A :: B): M :: N = {
        val headRep :: tailRep = base
        head.wrapRep(headRep) :: tail.wrapRep(tailRep)
      }

      override def toLawRep(base: M :: N): DataRepGroup[J] = {
        val headRep :: tailRep = base
        val headGroup = head.toLawRep(headRep)
        val tailGroup = tail.toLawRep(tailRep)
        DataRepGroup(reps = headGroup.reps ::: tailGroup.reps)
      }

      override def takeData(oldData: DataGroup, rep: M :: N): SplitData[H :: I] = {
        val headRep :: tailRep = rep
        val newData1 = head.takeData(oldData, headRep)
        val newData2 = tail.takeData(newData1.left, tailRep)
        SplitData(newData1.current :: newData2.current, newData2.left)
      }

    }

  }

}