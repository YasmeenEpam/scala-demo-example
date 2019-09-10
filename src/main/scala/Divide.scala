

sealed trait DivisionResult

final case class Finite(value:Int) extends DivisionResult
case object Infinite extends DivisionResult


object Divide {

  def apply(num:Int,den:Int):DivisionResult={
    if(den == 0) Infinite else Finite(num / den)

  }

}

////Divide(1, 0) this match {
//  case Finite(value) => s"It's finite: $value"
//  case Infinite => s"It's infinite"
//}
