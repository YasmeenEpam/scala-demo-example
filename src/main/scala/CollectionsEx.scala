class CollectionsEx {

  def concatString(strings: String*):String={
var conString=""
    for(s<-strings)
      conString= conString+""+s

    conString

  }

  def procEx={
    println("This is a procedure")
  }

  def compareString(s1:String,s2:String):Int={
    if(s1==s2) 0
    else if(s1>s2) -1
    else 1

  }


}

