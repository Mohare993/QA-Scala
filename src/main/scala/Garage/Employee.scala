package Garage

class Employee(fullName: String, employeeID: Int) extends Person(fullName: String) {
  override def toString() = s"Employee Name : $fullName, ID : $employeeID)"
}
