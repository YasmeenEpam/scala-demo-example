//A simple way to enforce the Singleton pattern in Scala is to make the primary constructor private, then put a getInstance method in the companion object of the class

class PrivateConstructorDemo private{

  override def toString="This is Singleton example"
}

object PrivateConstructorDemo{
  val obj=new PrivateConstructorDemo
  def getInstance=PrivateConstructorDemo
}


 object SingletonTest extends App {

  // this won't compile
 // val obj=new PrivateConstructorDemo

  // this works
  val obj = PrivateConstructorDemo.getInstance
  println(obj.toString)
}

