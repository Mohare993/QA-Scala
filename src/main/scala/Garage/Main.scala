package Garage

import Garage.{Car, Customer, Garage}
import org.mongodb.scala._
import org.mongodb.scala.model.Filters._
import org.mongodb.scala.model.Updates._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object Main extends App {
  // Get connection
  val mongoClient: MongoClient = MongoClient("mongodb://localhost")
  // Get database
  val database: MongoDatabase = mongoClient.getDatabase("garage")
  // Get collection
  val employeeCollection = database.getCollection("employees")
  // Get collection
  val vehicleCollection = database.getCollection("vehicles")
  // Get collection
  val customerCollection = database.getCollection("customers")

  // Example document _id has to be unique
  val doc: Document = Document(
    "_id" -> 1,
    "name" -> "MongoDB",
    "type" -> "database",
    "count" -> 1,
    "info" -> Document(
      "x" -> 203,
      "y" -> 102)
  )

  // Example document _id has to be unique
  val doc1: Document = Document(
    "_id" -> 2,
    "name" -> "MongoDB",
    "type" -> "database",
    "count" -> 1,
    "info" -> Document(
      "x" -> 203,
      "y" -> 102)
  )

  val Bob = new Customer(fullName ="Bob", customerID = 23)
  val car1 = new Car(1001, "ABC123", "B", false,Bob)
  val car2 = new Car(1002, "ABC12f3", "Ford", true, Bob)
  val car3 = new Car(1004, "ABC12e3", "Ford", true, Bob)

  def addCustomer(cust: Customer) = {
    customerCollection.insertOne(cust)
      .subscribe(new Observer[Completed] {
        override def onNext(result: Completed): Unit = println("Inserted")
        override def onError(e: Throwable): Unit = println(s"Failed ${e.getStackTrace.toString}")
        override def onComplete(): Unit = println("Completed")
      })
  }



}
