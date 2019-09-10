import scala.annotation.tailrec

class Factorial {

  def factorial(number:Int):Int={
    if(number==0 ) 1
    else number*factorial(number-1)
  }

  def tailRecFactorial(number: Int):Int={
    @tailrec
    def factorialusingTailRec(base:Int,num:Int):Int={
      if(num<=1) base
      else factorialusingTailRec(base*num,num-1)

    }

    factorialusingTailRec(1,num = number)
  }
}

object FactorialDemo{
  def main(args: Array[String]): Unit = {
    val a=new Factorial()
    println(a.factorial(5))
    println(a.tailRecFactorial(5))
  }
}