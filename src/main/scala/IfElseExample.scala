class IfElseExample(dayOfWeek: String) {


  val typeOfDay= dayOfWeek match{

    case "Monday" => "Monday"
    case "Tuesday" => "Tuesday"
    case "Wed" => "Wed"
    case "Thur"|"Friday"=> "Thursday"
    case someotherday if someotherday=="Thu" =>"Thu"
    case _ => "Any Day"
  }

}

object MatchUse{
  def main(args: Array[String]): Unit = {
    new IfElseExample("Monday")
    new IfElseExample("Sat")
    new IfElseExample("Thu")
    println( new IfElseExample("Sat").typeOfDay)
    println( new IfElseExample("Thu").typeOfDay)
  }
}