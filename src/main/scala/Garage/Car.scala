package Garage

import org.mongodb.scala.bson.collection.immutable.Document

class Car(vehicleID: Int, regNo: String, model: String, isFixed: Boolean, owner: Customer) extends Vehicle (vehicleID, regNo, model, isFixed, owner) {
  override def toString() = s"Car = Model: $model, Reg: $regNo, Owner: $owner"

   def todoc: Document = Document(
     "_id" -> vehicleID,
     "regNo" -> regNo,
     "model" -> model,
     "isFixed" -> isFixed,
     "owner"-> owner.toDoc
   )


}





