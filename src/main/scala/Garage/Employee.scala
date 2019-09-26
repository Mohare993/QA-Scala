package Garage

class Employee(fullName: String, employeeID: Int, var canWork: Boolean) extends Person(fullName: String) {
  override def toString() = s"Employee Name : $fullName, ID : $employeeID)"
}
