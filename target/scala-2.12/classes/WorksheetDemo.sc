println("Welcome to the Scala worksheet")

object Demo{

  if(20 > 10) "left" else "right"


}

object calc extends App {


  def square(double: Double):Double=double*double

 println(assert(square(2.0)==6))
  assert(square(-2.0)==4)
}