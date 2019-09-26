package Garage

class Customer (fullName: String, customerID: Int) extends  Person (fullName) {
  override def toString() = s"Customer Name : $fullName, ID : $customerID)"
}
