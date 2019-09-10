class MethodFunctionEx {

  def getArea(radius:Double):Double= {
    val Pi=3.14
    Pi*radius*radius

  }

  val x=(radius:Double)=>{
    val Pi=3.14
    Pi*radius*radius
  }:Double

  val covertedfunc= getArea _

  val conv:(Double)=>Double=getArea
}

object MethodFunctionEx{
  def main(args: Array[String]): Unit = {
    val x=new MethodFunctionEx()
    x.getArea(14)
    println(x.getArea(14))
    x.x(10)
    println( x.x(10))
    println(x.covertedfunc(4))
    println(x.conv(4))

  }
}