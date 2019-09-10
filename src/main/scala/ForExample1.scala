class ForExample1 {
  val listofDaysofaweek = List("Sun", "Mon", "Tue")
  val x = for (day <- listofDaysofaweek){
    day match {
      case "Sun" => println("Sunday")
      case otherday => println("Other Day")
    }
  }
}




object ForExample1{
  def main(args: Array[String]): Unit = {
   var y= new ForExample1()
  }
}
