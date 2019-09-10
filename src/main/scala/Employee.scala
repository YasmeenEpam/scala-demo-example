class Employee (empId: Int,name: String,salary :Double) {

  def this(empId: Int, name: String) {
    this(0, "", 0.0) // it invokes primary constructor.
    println("Two-argument auxiliary constructor")
  }

  def this(empId: Int) {
    this(0, "", 0.0) // it invokes primary constructor.
    println("One-argument auxiliary constructor")
  }

  def this() {
    this(0) // it invokes one-argument auxiliary constructor.
    println("Zero-argument auxiliary constructor")
  }

  def apply(empId: Int, name: String, salary: Double): Unit = {
    println("Apply method being called")
  }

  println("Primary construtor")
}

object AuxilaryConstructorDemo {
  def main(args: Array[String]): Unit = {

    val emp = new Employee()
    val emp2 = new Employee(101, "Employee2")

  }
}




