package Garage

class Bike (vehicleID: Int, regNo: String,  model: String, isFixed: Boolean, owner: Customer) extends Vehicle (vehicleID, regNo, model, isFixed, owner){
  override def toString() = s"Bike $vehicleID : $regNo : $owner)"
}
