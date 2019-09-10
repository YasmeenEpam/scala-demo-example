class Hey {

  def saysomething(message:String):String=message

}



object DemoObj{
  def main(args: Array[String]): Unit = {
    var hi=new Hey()
    hi.saysomething("Hello World!")
  }
}