class EvenOdd {

  def findIfEvenOrOdd(n:Int):Unit={

    if(n%2==0) println(n +"  is even")

  }

}

object EvenOddObj{

  def main(args: Array[String]): Unit = {
    val evenOdd=new EvenOdd()
    evenOdd.findIfEvenOrOdd(10)
  }
}
