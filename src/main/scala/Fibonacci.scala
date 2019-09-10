import scala.annotation._

class Fibonacci {

  def calculateFibonacci(num:Int):List[Int]={


   @tailrec
    def calculateFibTail(n:Int,prev:Int=0,next:Int=1,listsofar:List[Int]=Nil):List[Int]={


   if(n==0) (prev::listsofar).reverse

   else calculateFibTail(n-1,next,(prev+next),prev::listsofar)

    }
    calculateFibTail(num)
  }

}


object Fib{
  def main(args: Array[String]): Unit = {
    val fib1=new Fibonacci()
    println(fib1.calculateFibonacci(2))
  }
}
