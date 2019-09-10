class ChipShopDemo {


}

case class Cat(colour: String, food: String)



object ChipShop {
  def willServe(cat: Cat):Boolean=
    // if(cat.food==chips) true else false
    cat match{
      case Cat(_,"Chips")=> true
      case Cat(_,_)=> false
  }
}