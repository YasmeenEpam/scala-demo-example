import scala.collection._
class MarksTuples {


  def hasPassedList(studentList:List[(String,Int)]):List[(String,Int)]={
    var passedList:List[(String,Int)]=List.empty
  //  var passedList1:List[(String,Int)]=List.empty
    studentList.foreach{
      case(studentName,marks)=>{
        if(marks>40){
          passedList= passedList:+(studentName,marks)

        }

      }

    }

   // println(passedList)
    passedList
  }
}

object MarksTuplesMain{
  def main(args: Array[String]): Unit = {
   val marksTuples=new MarksTuples();

    val studentList:List[(String,Int)]=List()

    val studentList1= studentList:+(("student1",50)):+(("student2",30)):+(("student3",40)):+(("student4",10)):+(("student5",60)):+(("student6",70))


    println( marksTuples.hasPassedList(studentList1))
  }
}