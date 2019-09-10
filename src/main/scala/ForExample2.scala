class ForExample2 {

  val listofDaysofaweek = List("Sun", "Mon", "Tue")
 val x=for(i<-0 to listofDaysofaweek.size-1){
    println(listofDaysofaweek(i))
  }

  val y=for(j<-0 until listofDaysofaweek.size ){
    println(listofDaysofaweek(j))
  }

  val z=for(day<-listofDaysofaweek if(day=="Mon") ){
    print("Monday")
  }

  var a= for{i<-0 until 7
             j <- 0 to 10}{
    println(i,j)
  }


}

object ForExample2{
  def main(args: Array[String]): Unit = {
   var x= new ForExample2()
    var y=new WhileExample()
  }
}
