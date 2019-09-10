case class Person(firstName: String, lastName: String) {
  //(val firstName: String, val lastName: String)
  def name: String = s"$firstName $lastName"

}


object Person{
def apply(name:String):Person={
  val parts = name.split(" ")
  new Person(parts(0), parts(1))
}
}


object PersonDemo{
  def main(args: Array[String]): Unit = {
    println( Person.apply("John Doe").firstName)
    println(Person("John Doe").firstName)

  }
}
