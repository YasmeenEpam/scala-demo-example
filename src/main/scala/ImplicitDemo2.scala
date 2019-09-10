abstract class ImplicitDemo2[A] {

  def add(implicitDemoInput1 : A,implicitDemoInput2:A):A
  def unit: A
  }


object ImplicitObjDemo{


  implicit val stringImplicitObj:ImplicitDemo2[String]= new ImplicitDemo2[String]{
    def add(implicitDemoInput1 : String,implicitDemoInput2:String):String=implicitDemoInput1 concat implicitDemoInput2
    def unit: String = ""
  }

  implicit val intImplicitObj:ImplicitDemo2[Int]= new ImplicitDemo2[Int]{
    def add(implicitDemoInput1 : Int,implicitDemoInput2:Int):Int=implicitDemoInput1 + implicitDemoInput2
    def unit: Int = 0
  }

def sum[A](x : List[A])(implicit m: ImplicitDemo2[A]): A=
  if (x.isEmpty) m.unit
  else m.add(x.head,sum(x.tail))

  def main(args: Array[String]): Unit = {
    println(sum(List(1, 2, 3))) // uses intImplicitObj implicitly
    println(sum(List("a", "b", "c"))) // uses stringImplicitObj implicitly
  }


}

