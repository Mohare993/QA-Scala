package Garage

import org.mongodb.scala.bson.collection.mutable.Document

class Employee(fullName: String, employeeID: Int, var canWork: Boolean) extends Person(fullName: String) {
  override def toString() = s"Employee Name : $fullName, ID : $employeeID)"

  def toDoc: Document = Document(
    "_id" -> employeeID,
    "fullName" -> fullName,
    "canWork" -> canWork
  )

}

