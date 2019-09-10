class Polymorphic {

  def applyDiscount[T](discount: T) {
    discount match {
      case d: String =>
        println(s"The percentage discount for String input is $d")

      case d: Double =>
        println(s"$d discount will be applied for Double input ")

      case _ =>
        println("Unsupported discount type")
    }
  }
}


object PolymorphicDemo{
  def main(args: Array[String]): Unit = {
    val demoObject= new Polymorphic()
    demoObject.applyDiscount("15")
    demoObject.applyDiscount(20)
    demoObject.applyDiscount(25.5)

  }


}