

//import play.api.libs.json.Json
//
//class JsonConverter {
//
//
//  def convert(jsonString:String):Person={
//
//  val jsonObject=Json.parse(jsonString)
//    jsonObject.asInstanceOf[Person]
//   // jsonObject.as[Person]
//  }
//
//}
//
//case class Person1(name:String,age:Int)
//
//object Person1{
//  //implicit val personFormat=Json.format[Person1]
//
//}
//
//object JsonConverterDemo{
//  def main(args: Array[String]): Unit = {
//    val jsonString="""{"name":"ABC","age":20}"""
//    val jcon=new JsonConverter()
//
//
//   // println(jcon.convert(jsonString))
//  }
//}