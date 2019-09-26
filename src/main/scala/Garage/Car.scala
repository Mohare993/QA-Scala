package Garage

class Car(vehicleID: Int, regNo: String, owner: Customer) extends Vehicle(vehicleID, regNo, owner){
  override def toString() = s"Car $vehicleID : $regNo : $owner)"
}


