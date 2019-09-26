package Garage

class Bike (vehicleID: Int, regNo: String, owner: Customer) extends Vehicle(vehicleID, regNo, owner){
  override def toString() = s"Bike $vehicleID : $regNo : $owner)"
}
