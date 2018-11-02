package net.scalax.asuna.core.decoder

import net.scalax.asuna.core.common.CommonProvenShape

trait DecoderProvenShape[U, RepCol, DataCol] extends CommonProvenShape[U, RepCol] {
  override val dataShapeValue: DecoderShapeValue[U, RepCol, DataCol]
}

object DecoderProvenShape {

  /*implicit def dataProvenShapeShape[U, RepCol, DataCol, R <: DecoderProvenShape[U, RepCol, DataCol]]: DecoderShape.Aux[R, U, R, RepCol, DataCol] = {

    new DecoderShape[R, RepCol, DataCol] {
      self =>
      override type Target = R
      override type Data   = U
      override def wrapRep(base: R): R = base
      override def buildRep(base: R, baseRep: RepCol): RepCol =
        base.dataShapeValue.shape.buildRep(base.dataShapeValue.shape.wrapRep(base.dataShapeValue.rep), baseRep)
      override def takeData(rep: R, oldData: DataCol): SplitData[U, DataCol] =
        rep.dataShapeValue.shape.takeData(rep.dataShapeValue.rep, oldData)

    }

  }*/

}
