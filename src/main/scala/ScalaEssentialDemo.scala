class ScalaEssentialDemo {

}


object Test7 {
  def main(args: Array[String]): Unit = {

    val simpleField = { println("Evaluating simpleField")
      42 }
    def noParameterMethod = { println("Evaluating noParameterMethod")
      42 }
  }

   }

object calc extends App {


  def square(double: Double):Double=double*double
print( assert(square(2.0)==4))

 assert(square(-2.0)==4)
}
