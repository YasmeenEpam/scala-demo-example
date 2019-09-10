object HigherOrderDemo {

//  def concatSr=(a:String,b:String)=>{
//
//a+""+b
//  }:String

  def dodemo(x:String,y:String,concatSr:(String,String)=>String):String =concatSr(x,y)

  def main(args: Array[String]): Unit = {

    val result=dodemo("asd","asdsd",(x,y)=>x+" "+y)
    println(result)
  }
   // concatSr(x,y)
  //

}
