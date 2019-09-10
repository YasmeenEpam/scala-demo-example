class YieldExample {

    val listofDaysofaweek =  List("Sun","Mon","Tue")
    val x= for(day <- listofDaysofaweek) yield{
      day match {
        case "Sun"=>"Sunday"
        case "Mon"=>"Monday"
        case otherday=>"Other Day"
      }
    }
 // x

  }

  object YieldExample{
    def main(args: Array[String]): Unit = {

      var x= new ForExample()
      var y=new ForExample1()
      val z=new CollectionsEx()
      println(z.concatString("asd","asdas","asdas"))
      z.procEx

      //z.printVa("24",12)
      println(z.compareString("asd","aasd"))
     // println(z.smartCompare("asd","aasd"))
      val a=new Polymorphic()
      a.applyDiscount("12")



    }
  }


