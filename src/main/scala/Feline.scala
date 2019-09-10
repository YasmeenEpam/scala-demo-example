trait Feline {

  def colour:String
  def sound:String
}


//case class Cat(colour:String,food:String ) extends Feline{
//val sound:String="meow"
//}

//case class Lion(colour:String, maneSize:Int) extends Feline{
//  val sound:String="roar"
//}
//
//case class Tiger(colour:String) extends Feline{
//  val sound:String="roar"
//}
//
//case class Panthers(colour:String) extends Feline{
//  val sound:String="roar"
//}

trait BigCat extends Feline{
  override val sound="roar"
}

case class Lion(colour:String, maneSize:Int) extends BigCat{
 // val sound:String="roar"
}

case class Tiger(colour:String) extends BigCat{
 // val sound:String="roar"
}

case class Panthers(colour:String) extends BigCat{
 // val sound:String="roar"
}