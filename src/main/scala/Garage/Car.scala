package Garage

class Car(vehicleID: Int, regNo: String, model: String, isFixed: Boolean, owner: Customer) extends Vehicle (vehicleID, regNo, model, isFixed, owner) {
  override def toString() = s"Car = Model: $model, Reg: $regNo, Owner: $owner"
}





