//Commented code part of the exercise in Essential Scala


sealed trait Shape {

  def sides
  def perimeter
  def area
}


case class Circle(radius:Double) extends Shape{
  val sides=1
  val perimeter = 2 * math.Pi * radius
  val area = math.Pi * radius * radius

}

/*
case class Rectangle( length: Double, breadth: Double ) extends Shape {
  val sides = 4
  val perimeter = 2 * length + 2 * breadth
  val area = length * breadth
}
*/
/*
case class Square(size: Double) extends Shape {
  val sides = 4
  val perimeter = 4 * size
  val area = size * size
}
*/

sealed trait Rectangular extends Shape{
  override val sides=4
  def length: Double
  def breadth: Double
  override val perimeter = 2*length + 2*breadth
  override val area = length*breadth

}

case class Square(size: Double) extends Rectangular {
  val  length = size
  val breadth = size
}

case class Rectangle( length: Double, breadth: Double ) extends Rectangular{

}


object Draw{
  def apply(shape:Shape):String={

 shape match{

   case Rectangle(length,breadth)=>  s"A rectangle of length :$length amd breadth $breadth"
   case Square(size) => s"A square of size ${size}cm"
   case Circle(radius) => s"A circle with radius $radius"
 }
  }
}

//sealed trait Colour{
//def red
//  def green
//  def blue
//}


object DemoShape{

  def main(args: Array[String]): Unit = {
    val x=new Rectangle(4,5).perimeter
    println(x)
   println(Draw(Circle(10)))

//    val y=new Rectangular {
//      override def length: Double = ???
//
//      override def breadth: Double = ???
//    }
  }
}


