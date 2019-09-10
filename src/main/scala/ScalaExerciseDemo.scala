class ScalaExerciseDemo {

  println(1 + 2)
  val x=1+2
  println(x)

  val y="Hello, " ++ "Scala!"
  println(y)
  println("Hello,Scala!".size)

  println(1.to(10))

  val a="Hello, Scala!"
  println(a.toUpperCase)

  val a1= -42.abs
  println(a1)

  val a2=1.to(10)
  val a3=1 to 10
  println(a2==a3)

val a4=16.toHexString
  println(a4)

  println((0 to 10).contains(10))

  println((0 until 10).contains(10))

  println("foo".drop(1))

  println("bar".take(2))

  def square(x: Double) = x * x
  def area(radius: Double): Double = 3.14159 * square(radius)
  def sumOfSquares(x: Double, y: Double)= square(x) + square(y)

 // def loop: Int = loop

  def triangleArea(base: Double, height: Double): Double = base * height
  def abs(x: Double) = if (x >= 0) x else -x

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) < 0.001

  def factorial(n: Int): Int =
    if (n ==0) 1
    else factorial(n -1) * n

  val x1 = 0
  def f(y: Int) = y + 1
  val result = {
    val x1 = f(3)
    x1 * x1
  } + x1

//  def insertionSort(xs: List[Int]): List[Int] = xs match {
//    case List() => List()
//    case y :: ys => insert(y, insertionSort(ys))
//  }
//
//  def sqrt(x: Double): Either[String, Double] =
//    if (x < 0) Left("x must be positive")
//    else Right(…)

  var rec = 0
  def streamRange(lo: Int, hi: Int): Stream[Int] = {
    rec = rec + 1
    if (lo >= hi) Stream.empty
    else Stream.cons(lo, streamRange(lo + 1, hi))
  }
  streamRange(1, 10).take(3).toList
}

case class Note(name: String, duration: String, octave: Int)


object Foo {
  val x = 1
}
object Bar {
  val x = 2
}
object Baz {
  import Bar.x
  val y = x + Foo.x
}






object ScalaExerciseDemoObject{
  def main(args: Array[String]): Unit = {
    val x= new ScalaExerciseDemo()
  println(x.square(3.0))
    println(x.area(10))
    println(x.triangleArea(3, 4))
    println(x.triangleArea(5, 6))
    println(x.factorial(3))
    println(x.factorial(4))
    println(x.x1)
    println(x.result)
println(Baz.y)
    val c3 = Note("C", "Quarter", 3)
    val otherC3 = Note("C", "Quarter", 3)
    val f3 = Note("F", "Quarter", 3)
    println(c3 == otherC3)
    println(c3 == f3)
    println(x.rec)
  }
}

