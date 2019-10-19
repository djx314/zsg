package asuna
trait AsunaTuple4[E1, E2, E3, E4] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def leftHead: E1                                    = throw new Exception("Can not use this method.")
  def leftTail: AsunaTuple3[E2, E3, E4]               = throw new Exception("Can not use this method.")
  def rightHead: E4                                   = throw new Exception("Can not use this method.")
  def rightTail: AsunaTuple3[E1, E2, E3]              = throw new Exception("Can not use this method.")
  def add[T](xyy: T): AsunaTuple5[E1, E2, E3, E4, T]  = throw new Exception("Can not use this method.")
  def pull[T](xyy: T): AsunaTuple5[T, E1, E2, E3, E4] = throw new Exception("Can not use this method.")
  def addToTuple[T](xyy: T): (E1, E2, E3, E4, T)      = (self.i1, self.i2, self.i3, self.i4, xyy)
  def pullToTuple[T](xyy: T): (T, E1, E2, E3, E4)     = (xyy, self.i1, self.i2, self.i3, self.i4)
  def leftTuple: (E2, E3, E4)                         = (self.i2, self.i3, self.i4)
  def rightTuple: (E1, E2, E3)                        = (self.i1, self.i2, self.i3)
}
