class ImplicitDemo {

  val demoString:String="This is Implicit Demo"

  println(demoString.take(4))



}


object ImplicitDemoObject{
  def main(args: Array[String]): Unit = {
    val implicitDemo1=new ImplicitDemo()



  }
}