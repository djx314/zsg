asuna
============================================
[![codecov](https://codecov.io/gh/scalax/asuna/branch/master/graph/badge.svg)](https://codecov.io/gh/scalax/asuna)
[![Build Status](https://travis-ci.org/scalax/asuna.svg?branch=master)](https://travis-ci.org/scalax/asuna)

An abstraction of data transformation  
一个数据转换的抽象

-----------------

This document will be written in English for a period of Chinese
 since my poor English. Welcome to create any typo pull request
 to asuna.  
因为我的英语水平比较不堪，这份文档会以一段英文一段中文的形式撰写。欢迎大家提交任何文档更改到
asuna。

## What's asuna?

Asuna is an abstraction of data transformation. Now it's a subset
of [shapeless](https://github.com/milessabin/shapeless "shapeless"). Which
only handle case class generic and sealed trait generic problems.  
Asuna 是一个数据转换的抽象。目前而言它是
[shapeless](https://github.com/milessabin/shapeless "shapeless")
的一个子集，只针对 case class 和 sealed trait 的 generic 问题作出一个解决方案。

### Why Type Projection?

Asuna is a project that deeply dependent on Type Projection.
Type Projection will be removed in Scala3, but why we still used Type Projection?  
Ausna 是一个深度依赖于 Type Projection 的项目. Type Projection
将会在 Scala3 被移除，但我们为什么仍然使用了 Type Projectoin？

- Compile very fast. A natural number structure based on iterations is
discarded, and a limited tuple structure is used instead. Then the
compilation speed is improved qualitatively. In my test case,
compiling two mutually dependent 100-field case classes into a
circe encoder takes only 2 seconds. Which circe's auto generic use 20s.  
编译速度十分快。抛弃了基于逐个迭代的自然数结构，转而使用基于有限的元组结构，
编译速度得到了质的提升。在一个测试用例中，把两个互相有依赖的 100 字段 case class
编译成 circe encoder 仅需 2 秒，而 circe 的 semiauto generic 则需要 20 秒。

- Code writing is simpler. Most of the code can be generated by
IntelliJ IDEA and then populated based on type hints.  
代码编写更简单。大部分代码可以通过 IntelliJ IDEA 生成，然后根据类型提示进行填充。

- No dependent type(Just a bit in when generic booting).  
没有 Dependent Type（只有一点 Dependent Type 存在于 Generic 引导的时候）。

- No similar type style is found in [dotty](https://github.com/lampepfl/dotty "dotty").  
在 dotty 中找不到类似的类型风格。

### Why based on limited tuple?

- Compile very fast. It is also one of the reasons why the
compilation speed is fast, and it is the main reason. It not means
`scala.Tuple22`. In asuna we use a series of diverse tuples.
The use of limited tuples has reduced our type of
recursive layer to less than 3. In the above example, it only
took 2 seconds to compile successfully or compile failed. 
It's the same as writing macro directly.
编译速度十分快。它也是编译速度快的原因之一。它并不意味着我们使用了 `scala.Tuple22`。
在 asuna 中我们使用了多样化的元组。有限元组的使用使得我们的类型运算递归层数降到了 3 以内。
在上述例子中，无论是编译成功还是编译失败都只使用了 2 秒。跟直接写宏一样快。

- Multiple types of intermediate data structures can be used. Now asuna only
use HList to store data.In later releases, asuna will use the variable data
structure to store data with a very high degree of freedom.  
可以使用多种类型的中间数据结构。目前 asuna 仅使用 HList 存放数据。在后续版本中，asuna
将会使用对外屏蔽的可变数据结构存放数据，自由度十分高。

## Tutorial

### 1.Type Projection Model

Look at such a Trait.  
观察这样一个 Trait。

```scala
trait TypeHList {
  type H
  type T <: TypeHList
}
```

We give it an end type.  
我们给它一个结束类型。

```scala
class NoData

class EndParameter extends TypeHList {
  override type H = NoData
  override type T = EndParameter
}
```

In theory it can store unlimited types of parameters.  
理论上它可以存储无限个类型参数。

```scala
class TypeInstance1 extends TypeHList {
  override type H = String
  override type T = EndParameter
}

class TypeInstance2 extends TypeHList {
  override type H = Int
  override type T = TypeInstance1
}

val a1: Int = (throw new Exception()): TypeInstance2#H
val a2: String = (throw new Exception()): TypeInstance2#T#H
val a3: NoData = (throw new Exception()): TypeInstance2#T#T#H
val a4: NoData = (throw new Exception()): TypeInstance2#T#T#T#H
```

Of course we can use code generation to simplify some operations,
since this project is based on code generation.  
当然我们可以用代码生成来简化一些操作，毕竟这个仓库本身就是基于代码生成的。

```scala
//code generation start
class TypeHList1[T1] extends TypeHList {
  override type H = T1
  override type T = EndParameter
}
class TypeHList2[T1, T2] extends TypeHList {
  override type H = T1
  override type T = TypeHList1[T2]
}
//code generation ended

type TypeInstance3 = TypeHList2[Int, String]

val a1: Int = (throw new Exception()): TypeInstance3#H
val a2: String = (throw new Exception()): TypeInstance3#T#H
val a3: NoData = (throw new Exception()): TypeInstance3#T#T#H
val a4: NoData = (throw new Exception()): TypeInstance3#T#T#T#H
```

Although the upper limit of code generation is TypeHList8,
simply because the amount of other code generation's number
is 8 in asuna, you can still write a TypeHList greater than 8 type
parameters according to your own preferences.  
虽然代码生成的上限是 TypeHList8，但这仅仅是因为其他代码生成数量是
8，你依然可以根据自己的喜好自己构造类型参数超过 8 的 TypeHList。

So we can introduce the first knowledge point of asuna.
Abstracting high order types of any number of arguments.  
于是我们可以介绍 asuna 的第一个知识点，对任意参数个数的高阶函数进行抽象：

```scala
trait KindContext {
  type M[P <: TypeHList]
}
```

Let's try to explain the entire generic process with circe's
Json Object Encoder.  
我们尝试以 circe 的 Json Object Encoder 来说明一下整个 Generic 的过程。

First create a trait to make the type simpler.  
我们构造一个类来简化类型表达：

```scala
trait JsonObjectAppender[T, II] {
  def appendField(obj: T, name: II, m: JsonObject): JsonObject
}
```

Then we can implement the KindContext.  
然后我们可以实例化 KindContext。

```scala
class KContext extends KindContext {
  override type M[P <: TypeHList] = JsonObjectAppender[P#H, P#T#H]
}
```

Then we can get:  
于是有：

```scala
val a1: JsonObjectAppender[Int, String] = (throw new Exception()): KContext#M[TypeHList2[Int, String]]
val a2: JsonObjectAppender[Long, String] = (throw new Exception()): KContext#M[TypeHList2[Long, String]]
val a3: JsonObjectAppender[AsunaTuple2[Int, Long], AsunaTuple2[String, String]] = (throw new Exception()): KContext#M[TypeHList2[AsunaTuple2[Int, Long], AsunaTuple2[String, String]]]
```

### 2.Transpose use Type Projection and AsunaTupleX

Now we introduce a scene. We have a 4-field case class to be encode.  
现在我们引入一个场景，我们有一个 4 个字段的 case class 需要 encode。

```scala
case class Test04(i1: String, i2: Int, i3: Long, i4: Long)
```

To implement this Circe Encoder, we need a instance of:  
要制作这样一个 Circe Encoder，我们需要一个

```scala
trait JsonObjectAppender[AsunaTuple4[String, Int, Long, Long], AsunaTuple4[String, String, String, String]] {
  def appendField(obj: AsunaTuple4[String, Int, Long, Long], name: AsunaTuple4[String, String, String, String], m: JsonObject): JsonObject
}
```

Suppose it is named `en1`. We can easily derive `Encoder.AsObject[Test04]`
based on the existing information.  
的实例，假设它被命名为为 `en1`。我们可以轻易根据现有信息得出`Encoder.AsObject[Test04]`。

```scala
val getter = { test04: Test04 => new AsunaTuple4(test04.i1, test04.i2, test04.i3, test04.i4) }
val names = new AsunaTuple4("i1", "i2", "i3", "i4")
implicit val encoderTest04: Encoder.AsObject[Test04] = Encoder.AsObject.instance { o: Test04 =>
  en1.appendField(getter(o), names, JsonObject.empty)
}
```

The way to get `getter` and `names` will be explained later. Now only
the way to get the `en1` will be discussed here. Assuming that each field
can provide a Json Encoder based on the implicit of circe, we can get:  
getter 和 names 的获取方式我们会在后面解释，这里只讨论 en1 的获取方法。
假定每个字段都能根据 circe 的 implicit 提供一个 Json Encoder，则我们能获得

```scala
val a1: JsonObjectAppender[String, String] = new JsonObjectAppender[String, String] {
  override def appendField(obj: String, name: String, m: JsonObject): JsonObject = {
    (name, Json.fromString(obj)) +: m
  }
}
val a2: JsonObjectAppender[Int, String] = new JsonObjectAppender[Int, String] {
  override def appendField(obj: Int, name: String, m: JsonObject): JsonObject = {
    (name, Json.fromInt(obj)) +: m
  }
}
val a3: JsonObjectAppender[Long, String] = new JsonObjectAppender[Long, String] {
  override def appendField(obj: Long, name: String, m: JsonObject): JsonObject = {
    (name, Json.fromLong(obj)) +: m
  }
}
val a4: JsonObjectAppender[Long, String] = new JsonObjectAppender[Long, String] {
  override def appendField(obj: Long, name: String, m: JsonObject): JsonObject = {
    (name, Json.fromLong(obj)) +: m
  }
}
```

So we need to do a conversion, also the most important conversion of asuna:  
于是我们需要做一个转换，也是 asuna 最重要的转换：

```scala
AsunaTuple4[
  JsonObjectAppender[String, String],
  JsonObjectAppender[Int, String],
  JsonObjectAppender[Long, String],
  JsonObjectAppender[Long, String]
] =>
JsonObjectAppender[
  AsunaTuple4[String, Int, Long, Long],
  AsunaTuple4[String, String, String, String]
]
```

This is a very symmetrical transformation.  
这是一个很对称的转换，也是 asuna 的美丽所在。

Now we turn this transformation into an abstraction so
that this abstraction can handle any similar situation.  
现在我们把这个转换转化成抽象，使得这个抽象能应对任何类似的情况。

```scala
class TupleTypeHList3[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList] extends TypeHList {
  override type H = AsunaTuple3[E1#H, E2#H, E3#H]
  override type T = TupleTypeHList3[E1#T, E2#T, E3#T]
}
```

Inside asuna, there are some methods that help you with the transpose.
Then there is the following superposition process.  
在 asuna 内部，提供了这样一些帮助你完成转置操作的函数。于是便有了以下叠加过程

Property to be superposition  
被叠加元素

|Input Type|Final Result Type|
:-:|:-:
|KContext#M[TypeHList2[String, String]]|JsonObjectAppender[String, String]|
|KContext#M[TypeHList2[Int, String]]|JsonObjectAppender[Int, String]|
|KContext#M[TypeHList2[Long, String]]|JsonObjectAppender[Long, String]|
|KContext#M[TypeHList2[Long, String]]|JsonObjectAppender[Long, String]|

Line by line merger  
逐行合并

|Output Type|Final Result Type|
:-:|:-:
|KContext#M[TupleTypeHList1[TypeHList2[String, String]]]|JsonObjectAppender[AsunaTuple1[String], AsunaTuple1[String]]|
|KContext#M[TupleTypeHList2[TypeHList2[String, String], TypeHList2[Int, String]]]|JsonObjectAppender[AsunaTuple2[Int, String], AsunaTuple2[String, String]]|
|KContext#M[TupleTypeHList3[TypeHList2[String, String], TypeHList2[Int, String], TypeHList2[Long, String]]]|JsonObjectAppender[AsunaTuple3[String, Int, Long], AsunaTuple3[String, String, String]]|
|KContext#M[TupleTypeHList4[TypeHList2[String, String], TypeHList2[Int, String], TypeHList2[Long, String], TypeHList2[Long, String]]]|JsonObjectAppender[AsunaTuple4[String, Int, Long, Long], AsunaTuple4[String, String, String, String]]|

So as long as we provide a  
所以只要我们提供一个

```scala
def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: KContext#M[X], y: KContext#M[Y]): KContext#M[Z]
```

we can do all the above.  
即可完成上面所有操作。

But this method can't be implemented, we also need a Plus to assist
with this implemented process. The abstraction of Plus is as follows:  
但这个函数式是无法实现的，我们还需要一个 Plus 来协助这个填充的过程。Plus 的抽象如下：

```scala
trait Plus[X <: TypeHList, Y <: TypeHList, Z <: TypeHList] {
  def plus(p: X#H, item: Y#H): Z#H
  def takeHead(t: Z#H): X#H
  def takeTail(t: Z#H): Y#H
  def sub: Plus[X#T, Y#T, Z#T]
}
```

So the full version of `append` is  
所以完整版本的 append 是

```scala
def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: KContext#M[X], y: KContext#M[Y], p: Plus[X, Y, Z]): KContext#M[Z]
```

The `AsunaTuple0 - AsunaTuple7` Plus has been prepared inside asuna, so the process
is completed smoothly. The complete Context implementation is as follows:  
而 AsunaTuple0 - AsunaTuple7 的 Plus 已经在 asuna 的内部准备好了，所以叠加过程得以顺利完成。完整的 Context 实现如下：

```scala
object ii extends Context[KContext] {
  override def isReverse: Boolean = false

  override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
    x: JsonObjectAppender[X#T#H, X#H],
    y: JsonObjectAppender[Y#T#H, Y#H],
    plus: Plus[X, Y, Z]
  ): JsonObjectAppender[Z#T#H, Z#H] = new JsonObjectAppender[Z#T#H, Z#H] {
    override def appendField(obj: Z#T#H, name: Z#H, m: JsonObject): JsonObject =
      x.appendField(plus.sub.takeHead(obj), plus.takeHead(name), y.appendField(plus.sub.takeTail(obj), plus.takeTail(name), m))
  }

  override def start: JsonObjectAppender[AsunaTuple0, AsunaTuple0] = new JsonObjectAppender[AsunaTuple0, AsunaTuple0] {
    override def appendField(name: AsunaTuple0, obj: AsunaTuple0, m: JsonObject): JsonObject = m
  }
}
```

It can be noticed that there is not much skill in the implementation of Context.
Once type modeling is determined, it is just a simple filling work.  
可以留意到 Context 的实现并没有太多的技巧，类型建模一旦被确定，就只是简单的填充工作。

Complete sample is [here](https://github.com/scalax/asuna/tree/master/sample/src/main/scala/asuna/sample01_append "Sample01").  
完整地例子在 [这里](https://github.com/scalax/asuna/tree/master/sample/src/main/scala/asuna/sample01_append "Sample01")。

### 3.Implicit system

Now let's use asuna's `Application` to do an example
that is closer to the real scene.  
现在我们使用 asuna 的 `Application` 来做一个更接近真实场景的例子。

The acquisition of Application starts with a pure Tag Type. From here on,
we will use the BuildContent function more to simplify the code.  
Application 的获取是由纯 Tag Type 开始的。由这里开始我们将更多地使用 BuildContent 的函数以简化代码。

We generate the first code based on Test04 case class:  
我们根据 Test04 生成第一段代码：

```scala
val ap = PropertyApply[Test04]

val test04PropertyTag
  : AppendTag[TupleTag4[PropertyTag[String], `Number： 1`, PropertyTag[Int], `Number： 2`, PropertyTag[Long], `Number： 3`, PropertyTag[Long], `Number： 4`]] =
  BuildContent.lift(BuildContent.tag(ap.to(_.i1), ap.to(_.i2), ap.to(_.i3), ap.to(_.i4)))
```

Since this is just a Tag, don't forget to use `BuildContent.lift`
to eliminate all boxing costs. `Number： X` will be used for debugging,
which will be introduced later.  
由于这只是一个 Tag，别忘记使用 BuildContent.lift 来消除所有装箱消耗。其中，`Number： 1` 等类型会被用于 debug，将在后面介绍。

Here we got 4 boot types:  
在这里，我们得到了 4 个引导类型：

```scala
PropertyTag[String]
PropertyTag[Int]
PropertyTag[Long]
PropertyTag[Long]
```

Asuna will find 4 `Application[KContext, PropertyTag[T], I]` according
to KContext and these 4 boot types, and then merge them into a `Application[KContext, AsunaTupleX[PropertyTag[...]], TupleTypeHListX[...]]` with AsunaTupleX.  
asuna 将根据 KContext 和这 4 个引导类型分别找出 4 个 `Application[KContext, PropertyTag[T], I]`，然后合并成一个带有 AsunaTupleX 的 `Application[KContext, AsunaTupleX[PropertyTag[...]], TupleTypeHListX[...]]`

Here you can get this code by circe:  
这里可以依赖于 circe 作如下编码：

```scala
implicit def circePropertyEncoder[T](implicit encoder: LazyImplicit[Encoder[T]]): Application[KContext, PropertyTag[T], TypeHList2[T, String]] =
  new Application[KContext, PropertyTag[T], TypeHList2[T, String]] {
    override def application(context: Context[KContext]): JsonObjectAppender[T, String] = {
      new JsonObjectAppender[T, String] {
        override def appendField(obj: T, name: String, m: JsonObject): JsonObject = {
          ((name, encoder.value(obj))) +: m
        }
      }
    }
  }
```

In the merged `Application[KContext, SumTag, SumI]`, `SumI#H` is `AsunaTuple4[String, Int, Long, Long]`,
`SumI#T#H` is `AsunaTuple4[String, String, String, String]`.  
合并后的`Application[KContext, SumTag, SumI]` 中，`SumI#H` 为 `AsunaTuple4[String, Int, Long, Long]`,
`SumI#T#H` 为 `AsunaTuple4[String, String, String, String]`.

Complete Circe Json Object Encoder's sample is [here](https://github.com/scalax/asuna/tree/master/sample/src/main/scala/asuna/sample02_generic "Sample02").  
完整的 Circe Json Object Encoder 的代码在 [这里](https://github.com/scalax/asuna/tree/master/sample/src/main/scala/asuna/sample02_generic "Sample02")。

### 4.Implicit macro system

The macro system allows you to save all your code generation time.
And the design of the macro system is quite discrete, following the
principle of on-demand acquisition. The rules of the code generated
by the macro system will be hard coded in [here](https://github.com/scalax/asuna/tree/master/sample/src/main/scala/asuna/sample03_macros_code_generation "code generation")
to save search time.  
For more information, please find the [sample](https://github.com/scalax/asuna/tree/master/sample "sample") we provide.  
Complete asuna sample is WIP. Or you can find the test case in [circe test](https://github.com/scalax/asuna/tree/master/core/src/test/scala/asuna/test/circe "circe test").  
宏系统可以让你节省所有的代码生成时间。宏系统的设计相当离散，遵循按需获取的原则。
宏系统生成代码的规则将会硬编码在
[sample](https://github.com/scalax/asuna/tree/master/sample/src/main/scala/asuna/sample03_macros_code_generation "code generation")
中以节省你查看的时间。  
更多信息请查找我们提供的 [例子](https://github.com/scalax/asuna/tree/master/sample "sample")。  
敬请期待更多完整样例的推出，或者你可以先查看测试用例里面的 [circe 测试](https://github.com/scalax/asuna/tree/master/core/src/test/scala/asuna/test/circe "circe test")。