import java.util.Date

sealed trait Visitor
{ def id: String
  def createdAt: Date
  def age: Long = new Date().getTime() - createdAt.getTime()
}


