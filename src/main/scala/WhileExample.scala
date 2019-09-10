class WhileExample {
  val listofDaysofaweek =  List("Sun","Mon","Tue")
  var x=0;
  while(x<listofDaysofaweek.size-1){
    x+=1
    val day=listofDaysofaweek(x)
    println(day)
  }

}
