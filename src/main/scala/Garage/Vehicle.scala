package Garage

class Vehicle (vehicleID: Int, regNo: String, isFixed: Boolean, owner: Customer) {

}

object Vehicle {
  def apply(vehicleID: Int, regNo: String, isFixed: Boolean, owner: Customer): Vehicle = new Vehicle(vehicleID, regNo, isFixed, owner)
}


