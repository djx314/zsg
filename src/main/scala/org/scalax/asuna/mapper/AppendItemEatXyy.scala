trait Xyy[I] extends Any {
def item: I
}
trait ItemEatXyy0 extends Any with Item0 {
override def eatToTuple[T](xyy: T): Tuple1[T] = Tuple1(xyy)
}
class ItemEatXyy1[I1](override val item: EatValue0#AddRightItem[I1]) extends AnyVal with Xyy[EatValue0#AddRightItem[I1]] with Item1[I1] {
override def i1: I1 = item.item.i1
def addRightItem[T](xyy: T): ItemEatXyy2[I1, T] = new ItemEatXyy2(new E(new PItem2[EatValue1[I1], EatValue1[T]] {
override val i1 = item.item
override val i2 = new EatValue1(xyy)
}))
}
class ItemEatXyy2[ I1  ,   I2  ](override val item: EatValue0#Add2Item[I1, I2]) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2]]
with Item2[ I1  ,   I2  ] {
override def i1: I1 = item.item.i1.i1
override def i2: I2 = item.item.i2.i1
def addRightItem[T](xyy: T): ItemEatXyy3[ I1  ,   I2  , T] = new ItemEatXyy3(item.addRightItem(xyy))
}
class ItemEatXyy3[ I1  ,   I2  ,   I3  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3] ]
with Item3[ I1  ,   I2  ,   I3  ] {
override def i1: I1 = item.item.i1.i1
override def i2: I2 = item.item.i2.i1
override def i3: I3 = item.item.i2.i2
def addRightItem[T](xyy: T): ItemEatXyy4[ I1  ,   I2  ,   I3  , T] = new ItemEatXyy4(item.addRightItem(xyy))
}
class ItemEatXyy4[ I1  ,   I2  ,   I3  ,   I4  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4] ]
with Item4[ I1  ,   I2  ,   I3  ,   I4  ] {
override def i1: I1 = item.item.i1.i1.i1
override def i2: I2 = item.item.i1.i2.i1
override def i3: I3 = item.item.i1.i2.i2
override def i4: I4 = item.item.i2.i1.i1
def addRightItem[T](xyy: T): ItemEatXyy5[ I1  ,   I2  ,   I3  ,   I4  , T] = new ItemEatXyy5(item.addRightItem(xyy))
}
class ItemEatXyy5[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5] ]
with Item5[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ] {
override def i1: I1 = item.item.i1.i1.i1
override def i2: I2 = item.item.i1.i2.i1
override def i3: I3 = item.item.i1.i2.i2
override def i4: I4 = item.item.i2.i1.i1
override def i5: I5 = item.item.i2.i1.i2
def addRightItem[T](xyy: T): ItemEatXyy6[ I1  ,   I2  ,   I3  ,   I4  ,   I5  , T] = new ItemEatXyy6(item.addRightItem(xyy))
}
class ItemEatXyy6[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6] ]
with Item6[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ] {
override def i1: I1 = item.item.i1.i1.i1
override def i2: I2 = item.item.i1.i2.i1
override def i3: I3 = item.item.i1.i2.i2
override def i4: I4 = item.item.i2.i1.i1
override def i5: I5 = item.item.i2.i1.i2
override def i6: I6 = item.item.i2.i2.i1
def addRightItem[T](xyy: T): ItemEatXyy7[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  , T] = new ItemEatXyy7(item.addRightItem(xyy))
}
class ItemEatXyy7[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7] ]
with Item7[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ] {
override def i1: I1 = item.item.i1.i1.i1
override def i2: I2 = item.item.i1.i2.i1
override def i3: I3 = item.item.i1.i2.i2
override def i4: I4 = item.item.i2.i1.i1
override def i5: I5 = item.item.i2.i1.i2
override def i6: I6 = item.item.i2.i2.i1
override def i7: I7 = item.item.i2.i2.i2
def addRightItem[T](xyy: T): ItemEatXyy8[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  , T] = new ItemEatXyy8(item.addRightItem(xyy))
}
class ItemEatXyy8[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8] ]
with Item8[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ] {
override def i1: I1 = item.item.i1.i1.i1.i1
override def i2: I2 = item.item.i1.i1.i2.i1
override def i3: I3 = item.item.i1.i1.i2.i2
override def i4: I4 = item.item.i1.i2.i1.i1
override def i5: I5 = item.item.i1.i2.i1.i2
override def i6: I6 = item.item.i1.i2.i2.i1
override def i7: I7 = item.item.i1.i2.i2.i2
override def i8: I8 = item.item.i2.i1.i1.i1
def addRightItem[T](xyy: T): ItemEatXyy9[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  , T] = new ItemEatXyy9(item.addRightItem(xyy))
}
class ItemEatXyy9[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9] ]
with Item9[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ] {
override def i1: I1 = item.item.i1.i1.i1.i1
override def i2: I2 = item.item.i1.i1.i2.i1
override def i3: I3 = item.item.i1.i1.i2.i2
override def i4: I4 = item.item.i1.i2.i1.i1
override def i5: I5 = item.item.i1.i2.i1.i2
override def i6: I6 = item.item.i1.i2.i2.i1
override def i7: I7 = item.item.i1.i2.i2.i2
override def i8: I8 = item.item.i2.i1.i1.i1
override def i9: I9 = item.item.i2.i1.i1.i2
def addRightItem[T](xyy: T): ItemEatXyy10[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  , T] = new ItemEatXyy10(item.addRightItem(xyy))
}
class ItemEatXyy10[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10] ]
with Item10[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ] {
override def i1: I1 = item.item.i1.i1.i1.i1
override def i2: I2 = item.item.i1.i1.i2.i1
override def i3: I3 = item.item.i1.i1.i2.i2
override def i4: I4 = item.item.i1.i2.i1.i1
override def i5: I5 = item.item.i1.i2.i1.i2
override def i6: I6 = item.item.i1.i2.i2.i1
override def i7: I7 = item.item.i1.i2.i2.i2
override def i8: I8 = item.item.i2.i1.i1.i1
override def i9: I9 = item.item.i2.i1.i1.i2
override def i10: I10 = item.item.i2.i1.i2.i1
def addRightItem[T](xyy: T): ItemEatXyy11[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  , T] = new ItemEatXyy11(item.addRightItem(xyy))
}
class ItemEatXyy11[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11] ]
with Item11[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ] {
override def i1: I1 = item.item.i1.i1.i1.i1
override def i2: I2 = item.item.i1.i1.i2.i1
override def i3: I3 = item.item.i1.i1.i2.i2
override def i4: I4 = item.item.i1.i2.i1.i1
override def i5: I5 = item.item.i1.i2.i1.i2
override def i6: I6 = item.item.i1.i2.i2.i1
override def i7: I7 = item.item.i1.i2.i2.i2
override def i8: I8 = item.item.i2.i1.i1.i1
override def i9: I9 = item.item.i2.i1.i1.i2
override def i10: I10 = item.item.i2.i1.i2.i1
override def i11: I11 = item.item.i2.i1.i2.i2
def addRightItem[T](xyy: T): ItemEatXyy12[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  , T] = new ItemEatXyy12(item.addRightItem(xyy))
}
class ItemEatXyy12[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12] ]
with Item12[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ] {
override def i1: I1 = item.item.i1.i1.i1.i1
override def i2: I2 = item.item.i1.i1.i2.i1
override def i3: I3 = item.item.i1.i1.i2.i2
override def i4: I4 = item.item.i1.i2.i1.i1
override def i5: I5 = item.item.i1.i2.i1.i2
override def i6: I6 = item.item.i1.i2.i2.i1
override def i7: I7 = item.item.i1.i2.i2.i2
override def i8: I8 = item.item.i2.i1.i1.i1
override def i9: I9 = item.item.i2.i1.i1.i2
override def i10: I10 = item.item.i2.i1.i2.i1
override def i11: I11 = item.item.i2.i1.i2.i2
override def i12: I12 = item.item.i2.i2.i1.i1
def addRightItem[T](xyy: T): ItemEatXyy13[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  , T] = new ItemEatXyy13(item.addRightItem(xyy))
}
class ItemEatXyy13[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13] ]
with Item13[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ] {
override def i1: I1 = item.item.i1.i1.i1.i1
override def i2: I2 = item.item.i1.i1.i2.i1
override def i3: I3 = item.item.i1.i1.i2.i2
override def i4: I4 = item.item.i1.i2.i1.i1
override def i5: I5 = item.item.i1.i2.i1.i2
override def i6: I6 = item.item.i1.i2.i2.i1
override def i7: I7 = item.item.i1.i2.i2.i2
override def i8: I8 = item.item.i2.i1.i1.i1
override def i9: I9 = item.item.i2.i1.i1.i2
override def i10: I10 = item.item.i2.i1.i2.i1
override def i11: I11 = item.item.i2.i1.i2.i2
override def i12: I12 = item.item.i2.i2.i1.i1
override def i13: I13 = item.item.i2.i2.i1.i2
def addRightItem[T](xyy: T): ItemEatXyy14[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  , T] = new ItemEatXyy14(item.addRightItem(xyy))
}
class ItemEatXyy14[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13]  #AddRightItem[I14] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13]  #AddRightItem[I14] ]
with Item14[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ] {
override def i1: I1 = item.item.i1.i1.i1.i1
override def i2: I2 = item.item.i1.i1.i2.i1
override def i3: I3 = item.item.i1.i1.i2.i2
override def i4: I4 = item.item.i1.i2.i1.i1
override def i5: I5 = item.item.i1.i2.i1.i2
override def i6: I6 = item.item.i1.i2.i2.i1
override def i7: I7 = item.item.i1.i2.i2.i2
override def i8: I8 = item.item.i2.i1.i1.i1
override def i9: I9 = item.item.i2.i1.i1.i2
override def i10: I10 = item.item.i2.i1.i2.i1
override def i11: I11 = item.item.i2.i1.i2.i2
override def i12: I12 = item.item.i2.i2.i1.i1
override def i13: I13 = item.item.i2.i2.i1.i2
override def i14: I14 = item.item.i2.i2.i2.i1
def addRightItem[T](xyy: T): ItemEatXyy15[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  , T] = new ItemEatXyy15(item.addRightItem(xyy))
}
class ItemEatXyy15[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13]  #AddRightItem[I14]  #AddRightItem[I15] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13]  #AddRightItem[I14]  #AddRightItem[I15] ]
with Item15[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ] {
override def i1: I1 = item.item.i1.i1.i1.i1
override def i2: I2 = item.item.i1.i1.i2.i1
override def i3: I3 = item.item.i1.i1.i2.i2
override def i4: I4 = item.item.i1.i2.i1.i1
override def i5: I5 = item.item.i1.i2.i1.i2
override def i6: I6 = item.item.i1.i2.i2.i1
override def i7: I7 = item.item.i1.i2.i2.i2
override def i8: I8 = item.item.i2.i1.i1.i1
override def i9: I9 = item.item.i2.i1.i1.i2
override def i10: I10 = item.item.i2.i1.i2.i1
override def i11: I11 = item.item.i2.i1.i2.i2
override def i12: I12 = item.item.i2.i2.i1.i1
override def i13: I13 = item.item.i2.i2.i1.i2
override def i14: I14 = item.item.i2.i2.i2.i1
override def i15: I15 = item.item.i2.i2.i2.i2
def addRightItem[T](xyy: T): ItemEatXyy16[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  , T] = new ItemEatXyy16(item.addRightItem(xyy))
}
class ItemEatXyy16[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13]  #AddRightItem[I14]  #AddRightItem[I15]  #AddRightItem[I16] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13]  #AddRightItem[I14]  #AddRightItem[I15]  #AddRightItem[I16] ]
with Item16[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ] {
override def i1: I1 = item.item.i1.i1.i1.i1.i1
override def i2: I2 = item.item.i1.i1.i1.i2.i1
override def i3: I3 = item.item.i1.i1.i1.i2.i2
override def i4: I4 = item.item.i1.i1.i2.i1.i1
override def i5: I5 = item.item.i1.i1.i2.i1.i2
override def i6: I6 = item.item.i1.i1.i2.i2.i1
override def i7: I7 = item.item.i1.i1.i2.i2.i2
override def i8: I8 = item.item.i1.i2.i1.i1.i1
override def i9: I9 = item.item.i1.i2.i1.i1.i2
override def i10: I10 = item.item.i1.i2.i1.i2.i1
override def i11: I11 = item.item.i1.i2.i1.i2.i2
override def i12: I12 = item.item.i1.i2.i2.i1.i1
override def i13: I13 = item.item.i1.i2.i2.i1.i2
override def i14: I14 = item.item.i1.i2.i2.i2.i1
override def i15: I15 = item.item.i1.i2.i2.i2.i2
override def i16: I16 = item.item.i2.i1.i1.i1.i1
def addRightItem[T](xyy: T): ItemEatXyy17[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  , T] = new ItemEatXyy17(item.addRightItem(xyy))
}
class ItemEatXyy17[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13]  #AddRightItem[I14]  #AddRightItem[I15]  #AddRightItem[I16]  #AddRightItem[I17] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13]  #AddRightItem[I14]  #AddRightItem[I15]  #AddRightItem[I16]  #AddRightItem[I17] ]
with Item17[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ] {
override def i1: I1 = item.item.i1.i1.i1.i1.i1
override def i2: I2 = item.item.i1.i1.i1.i2.i1
override def i3: I3 = item.item.i1.i1.i1.i2.i2
override def i4: I4 = item.item.i1.i1.i2.i1.i1
override def i5: I5 = item.item.i1.i1.i2.i1.i2
override def i6: I6 = item.item.i1.i1.i2.i2.i1
override def i7: I7 = item.item.i1.i1.i2.i2.i2
override def i8: I8 = item.item.i1.i2.i1.i1.i1
override def i9: I9 = item.item.i1.i2.i1.i1.i2
override def i10: I10 = item.item.i1.i2.i1.i2.i1
override def i11: I11 = item.item.i1.i2.i1.i2.i2
override def i12: I12 = item.item.i1.i2.i2.i1.i1
override def i13: I13 = item.item.i1.i2.i2.i1.i2
override def i14: I14 = item.item.i1.i2.i2.i2.i1
override def i15: I15 = item.item.i1.i2.i2.i2.i2
override def i16: I16 = item.item.i2.i1.i1.i1.i1
override def i17: I17 = item.item.i2.i1.i1.i1.i2
def addRightItem[T](xyy: T): ItemEatXyy18[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  , T] = new ItemEatXyy18(item.addRightItem(xyy))
}
class ItemEatXyy18[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13]  #AddRightItem[I14]  #AddRightItem[I15]  #AddRightItem[I16]  #AddRightItem[I17]  #AddRightItem[I18] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13]  #AddRightItem[I14]  #AddRightItem[I15]  #AddRightItem[I16]  #AddRightItem[I17]  #AddRightItem[I18] ]
with Item18[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ] {
override def i1: I1 = item.item.i1.i1.i1.i1.i1
override def i2: I2 = item.item.i1.i1.i1.i2.i1
override def i3: I3 = item.item.i1.i1.i1.i2.i2
override def i4: I4 = item.item.i1.i1.i2.i1.i1
override def i5: I5 = item.item.i1.i1.i2.i1.i2
override def i6: I6 = item.item.i1.i1.i2.i2.i1
override def i7: I7 = item.item.i1.i1.i2.i2.i2
override def i8: I8 = item.item.i1.i2.i1.i1.i1
override def i9: I9 = item.item.i1.i2.i1.i1.i2
override def i10: I10 = item.item.i1.i2.i1.i2.i1
override def i11: I11 = item.item.i1.i2.i1.i2.i2
override def i12: I12 = item.item.i1.i2.i2.i1.i1
override def i13: I13 = item.item.i1.i2.i2.i1.i2
override def i14: I14 = item.item.i1.i2.i2.i2.i1
override def i15: I15 = item.item.i1.i2.i2.i2.i2
override def i16: I16 = item.item.i2.i1.i1.i1.i1
override def i17: I17 = item.item.i2.i1.i1.i1.i2
override def i18: I18 = item.item.i2.i1.i1.i2.i1
def addRightItem[T](xyy: T): ItemEatXyy19[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  , T] = new ItemEatXyy19(item.addRightItem(xyy))
}
class ItemEatXyy19[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13]  #AddRightItem[I14]  #AddRightItem[I15]  #AddRightItem[I16]  #AddRightItem[I17]  #AddRightItem[I18]  #AddRightItem[I19] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13]  #AddRightItem[I14]  #AddRightItem[I15]  #AddRightItem[I16]  #AddRightItem[I17]  #AddRightItem[I18]  #AddRightItem[I19] ]
with Item19[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ] {
override def i1: I1 = item.item.i1.i1.i1.i1.i1
override def i2: I2 = item.item.i1.i1.i1.i2.i1
override def i3: I3 = item.item.i1.i1.i1.i2.i2
override def i4: I4 = item.item.i1.i1.i2.i1.i1
override def i5: I5 = item.item.i1.i1.i2.i1.i2
override def i6: I6 = item.item.i1.i1.i2.i2.i1
override def i7: I7 = item.item.i1.i1.i2.i2.i2
override def i8: I8 = item.item.i1.i2.i1.i1.i1
override def i9: I9 = item.item.i1.i2.i1.i1.i2
override def i10: I10 = item.item.i1.i2.i1.i2.i1
override def i11: I11 = item.item.i1.i2.i1.i2.i2
override def i12: I12 = item.item.i1.i2.i2.i1.i1
override def i13: I13 = item.item.i1.i2.i2.i1.i2
override def i14: I14 = item.item.i1.i2.i2.i2.i1
override def i15: I15 = item.item.i1.i2.i2.i2.i2
override def i16: I16 = item.item.i2.i1.i1.i1.i1
override def i17: I17 = item.item.i2.i1.i1.i1.i2
override def i18: I18 = item.item.i2.i1.i1.i2.i1
override def i19: I19 = item.item.i2.i1.i1.i2.i2
def addRightItem[T](xyy: T): ItemEatXyy20[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  , T] = new ItemEatXyy20(item.addRightItem(xyy))
}
class ItemEatXyy20[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13]  #AddRightItem[I14]  #AddRightItem[I15]  #AddRightItem[I16]  #AddRightItem[I17]  #AddRightItem[I18]  #AddRightItem[I19]  #AddRightItem[I20] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13]  #AddRightItem[I14]  #AddRightItem[I15]  #AddRightItem[I16]  #AddRightItem[I17]  #AddRightItem[I18]  #AddRightItem[I19]  #AddRightItem[I20] ]
with Item20[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ] {
override def i1: I1 = item.item.i1.i1.i1.i1.i1
override def i2: I2 = item.item.i1.i1.i1.i2.i1
override def i3: I3 = item.item.i1.i1.i1.i2.i2
override def i4: I4 = item.item.i1.i1.i2.i1.i1
override def i5: I5 = item.item.i1.i1.i2.i1.i2
override def i6: I6 = item.item.i1.i1.i2.i2.i1
override def i7: I7 = item.item.i1.i1.i2.i2.i2
override def i8: I8 = item.item.i1.i2.i1.i1.i1
override def i9: I9 = item.item.i1.i2.i1.i1.i2
override def i10: I10 = item.item.i1.i2.i1.i2.i1
override def i11: I11 = item.item.i1.i2.i1.i2.i2
override def i12: I12 = item.item.i1.i2.i2.i1.i1
override def i13: I13 = item.item.i1.i2.i2.i1.i2
override def i14: I14 = item.item.i1.i2.i2.i2.i1
override def i15: I15 = item.item.i1.i2.i2.i2.i2
override def i16: I16 = item.item.i2.i1.i1.i1.i1
override def i17: I17 = item.item.i2.i1.i1.i1.i2
override def i18: I18 = item.item.i2.i1.i1.i2.i1
override def i19: I19 = item.item.i2.i1.i1.i2.i2
override def i20: I20 = item.item.i2.i1.i2.i1.i1
def addRightItem[T](xyy: T): ItemEatXyy21[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  , T] = new ItemEatXyy21(item.addRightItem(xyy))
}
class ItemEatXyy21[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ,   I21  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13]  #AddRightItem[I14]  #AddRightItem[I15]  #AddRightItem[I16]  #AddRightItem[I17]  #AddRightItem[I18]  #AddRightItem[I19]  #AddRightItem[I20]  #AddRightItem[I21] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13]  #AddRightItem[I14]  #AddRightItem[I15]  #AddRightItem[I16]  #AddRightItem[I17]  #AddRightItem[I18]  #AddRightItem[I19]  #AddRightItem[I20]  #AddRightItem[I21] ]
with Item21[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ,   I21  ] {
override def i1: I1 = item.item.i1.i1.i1.i1.i1
override def i2: I2 = item.item.i1.i1.i1.i2.i1
override def i3: I3 = item.item.i1.i1.i1.i2.i2
override def i4: I4 = item.item.i1.i1.i2.i1.i1
override def i5: I5 = item.item.i1.i1.i2.i1.i2
override def i6: I6 = item.item.i1.i1.i2.i2.i1
override def i7: I7 = item.item.i1.i1.i2.i2.i2
override def i8: I8 = item.item.i1.i2.i1.i1.i1
override def i9: I9 = item.item.i1.i2.i1.i1.i2
override def i10: I10 = item.item.i1.i2.i1.i2.i1
override def i11: I11 = item.item.i1.i2.i1.i2.i2
override def i12: I12 = item.item.i1.i2.i2.i1.i1
override def i13: I13 = item.item.i1.i2.i2.i1.i2
override def i14: I14 = item.item.i1.i2.i2.i2.i1
override def i15: I15 = item.item.i1.i2.i2.i2.i2
override def i16: I16 = item.item.i2.i1.i1.i1.i1
override def i17: I17 = item.item.i2.i1.i1.i1.i2
override def i18: I18 = item.item.i2.i1.i1.i2.i1
override def i19: I19 = item.item.i2.i1.i1.i2.i2
override def i20: I20 = item.item.i2.i1.i2.i1.i1
override def i21: I21 = item.item.i2.i1.i2.i1.i2
def addRightItem[T](xyy: T): ItemEatXyy22[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ,   I21  , T] = new ItemEatXyy22(item.addRightItem(xyy))
}
class ItemEatXyy22[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ,   I21  ,   I22  ](override val item: EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13]  #AddRightItem[I14]  #AddRightItem[I15]  #AddRightItem[I16]  #AddRightItem[I17]  #AddRightItem[I18]  #AddRightItem[I19]  #AddRightItem[I20]  #AddRightItem[I21]  #AddRightItem[I22] ) extends AnyVal with Xyy[EatValue0#Add2Item[I1, I2] #AddRightItem[I3]  #AddRightItem[I4]  #AddRightItem[I5]  #AddRightItem[I6]  #AddRightItem[I7]  #AddRightItem[I8]  #AddRightItem[I9]  #AddRightItem[I10]  #AddRightItem[I11]  #AddRightItem[I12]  #AddRightItem[I13]  #AddRightItem[I14]  #AddRightItem[I15]  #AddRightItem[I16]  #AddRightItem[I17]  #AddRightItem[I18]  #AddRightItem[I19]  #AddRightItem[I20]  #AddRightItem[I21]  #AddRightItem[I22] ]
with Item22[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ,   I21  ,   I22  ] {
override def i1: I1 = item.item.i1.i1.i1.i1.i1
override def i2: I2 = item.item.i1.i1.i1.i2.i1
override def i3: I3 = item.item.i1.i1.i1.i2.i2
override def i4: I4 = item.item.i1.i1.i2.i1.i1
override def i5: I5 = item.item.i1.i1.i2.i1.i2
override def i6: I6 = item.item.i1.i1.i2.i2.i1
override def i7: I7 = item.item.i1.i1.i2.i2.i2
override def i8: I8 = item.item.i1.i2.i1.i1.i1
override def i9: I9 = item.item.i1.i2.i1.i1.i2
override def i10: I10 = item.item.i1.i2.i1.i2.i1
override def i11: I11 = item.item.i1.i2.i1.i2.i2
override def i12: I12 = item.item.i1.i2.i2.i1.i1
override def i13: I13 = item.item.i1.i2.i2.i1.i2
override def i14: I14 = item.item.i1.i2.i2.i2.i1
override def i15: I15 = item.item.i1.i2.i2.i2.i2
override def i16: I16 = item.item.i2.i1.i1.i1.i1
override def i17: I17 = item.item.i2.i1.i1.i1.i2
override def i18: I18 = item.item.i2.i1.i1.i2.i1
override def i19: I19 = item.item.i2.i1.i1.i2.i2
override def i20: I20 = item.item.i2.i1.i2.i1.i1
override def i21: I21 = item.item.i2.i1.i2.i1.i2
override def i22: I22 = item.item.i2.i1.i2.i2.i1
}
