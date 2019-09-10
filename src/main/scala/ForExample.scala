class ForExample {

  val listofDaysofaweek =  List("Sun","Mon","Tue")
  val x=for(day <- listofDaysofaweek){

    day match {
      case "Sun"=>println("Sunday")
      case "Mon"=>println("Monday")
      case otherday=>println("Other Day")
    }
  }

}

object ForExample{
  def main(args: Array[String]): Unit = {

var x= new ForExample()
  x.x
  }
}