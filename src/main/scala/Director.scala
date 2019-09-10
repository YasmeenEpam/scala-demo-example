
case class Director( firstName:String, lastName:String, yearOfBirth:Int) {
//(val firstName:String,val lastName:String,val yearOfBirth:Int) {
def name:String =firstName+" "+lastName

  //def copy( firstName: String = this.firstName, lastName: String = this.lastName, yearOfBirth: Int = this.yearOfBirth) = new Director(firstName, lastName, yearOfBirth)

}

//object Director{
//
//  def apply(firstName:String,lastName:String,yearOfBirth:Int):Director={
//    new Director(firstName,lastName,yearOfBirth)
//  }
//def older(director1:Director,director2:Director):Director={
//    if(director1.yearOfBirth<director2.yearOfBirth) director1
//    else director2
//}
//}


case class Film(name:String,yearOfRelease:Int, imdbRating: Double , director: Director){
//(val name:String,val yearOfRelease:Int,val imdbRating: Double ,val director: Director)
def directorsAge:Int=yearOfRelease-director.yearOfBirth
  def isDirectedBy(director1: Director):Boolean=if(director1==director)true else false


}

object Film {
  //def apply( name:String,yearOfRelease:Int,imdbRating: Double,director: Director):Film={
  // new Film(name,yearOfRelease,imdbRating,director)


  def newer(film1: Film, film2: Film): Film ={
    if (film1.yearOfRelease < film2.yearOfRelease) film1 else film2
  }

  def highestRating(film1:Film,film2:Film):Film={
    if(film1.imdbRating>film2.imdbRating) film1
    else film2
  }

  def oldestDirectorAtTheTime(film1:Film,film2:Film):Director={

    if(film1.directorsAge>film2.directorsAge) film1.director else film2.director

  }

}


object Dad{
  def rate(film:Film):Double={
    film match{
      case Film(_,_,_,Director("Clint","Eastwood",_))=>10.0
      case Film(_,_,_,Director("John","McTiernan",_))=>7.0
      case _=>3.0
    }
  }
}



object  Demo{
  def main(args: Array[String]): Unit = {
    val eastwood = new Director("Clint", "Eastwood", 1930)
    val mcTiernan = new Director("John", "McTiernan", 1951)
    val nolan = new Director("Christopher", "Nolan", 1970)
    val someBody = new Director("Just", "Some Body", 1990)
    val memento = new Film("Memento", 2000, 8.5, nolan)
    val darkKnight = new Film("Dark Knight", 2008, 9.0, nolan)
    val inception = new Film("Inception", 2010, 8.8, nolan)
    val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7, eastwood)
    val outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9, eastwood)
    val unforgiven = new Film("Unforgiven", 1992, 8.3, eastwood)
    val granTorino = new Film("Gran Torino", 2008, 8.2, eastwood)
    val invictus = new Film("Invictus", 2009, 7.4, eastwood)
    val predator = new Film("Predator", 1987, 7.9, mcTiernan)
    val dieHard = new Film("Die Hard", 1988, 8.3, mcTiernan)
    val huntForRedOctober = new Film("The Hunt for Red October", 1990, 7.6, mcTiernan)
    val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8, mcTiernan)

    println(eastwood.yearOfBirth )

    println(Dad.rate(inception))
  }
}


/*
val prestige: Film = bestFilmByChristopherNolan()--Type

new Film("Last Action Hero", 1993, mcTiernan)--Type

Film("Last Action Hero", 1993, mcTiernan)--Value

Film.newer(highPlainsDrifter, thomasCrownAffair)--Value

Film.type--Value

 */

//Caseclasses provide our copy methods and our apply methods an remove the need to write val‘ before each constructor argument
