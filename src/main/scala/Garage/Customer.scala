package Garage

import org.mongodb.scala.bson.collection.immutable.Document

class Customer (fullName: String, customerID: Int) extends  Person (fullName) {
  override def toString() = s"Customer Name : $fullName, ID : $customerID"

  def toDoc: Document = Document(
    "_id" -> customerID,
    "fullName" -> fullName
  )



}
