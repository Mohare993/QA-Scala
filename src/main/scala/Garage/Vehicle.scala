package Garage

import org.mongodb.scala.bson.collection.immutable.Document

abstract case class Vehicle (vehicleID: Int, regNo: String,  model: String, var isFixed: Boolean, owner: Customer) {

  def toDoc: Document = Document(
    "_id" -> vehicleID,
    "regNo" -> regNo,
    "model" -> model,
    "isFixed" -> isFixed,
    "owner"-> owner.toDoc
  )

}



