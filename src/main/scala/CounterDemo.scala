case class CounterDemo(count:Int=0) {
  //(val count:Int)
//def dec:Int= count-1
 // def inc=count+1

//def inc=new CounterDemo(count+1)
//  def dec=new CounterDemo(count-1)
//  def inc:CounterDemo=inc()
//    def dec:CounterDemo=dec()
  def dec = copy(count = count - 1)
  def inc = copy(count = count + 1)

  def inc(amount:Int=1)=new CounterDemo(count+amount)
  def dec(amount:Int=1)=new CounterDemo(count-amount)

def adjust(adder:Adder):CounterDemo=new CounterDemo(adder.add(count))

}

class Adder(amount: Int) {
  def add(in: Int) = in + amount
}



object CountDemo{
  def main(args: Array[String]): Unit = {
   println(new CounterDemo(10).inc.dec.inc.inc.count)
    println(new CounterDemo(10).inc.inc(10).count )
println(CounterDemo(0))
    println(CounterDemo().inc)
    println(CounterDemo().dec)
    println(CounterDemo().inc.dec == CounterDemo().dec.inc)
    println(CounterDemo().inc.toString)
  }
}