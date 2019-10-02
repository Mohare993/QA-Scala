package Garage

import Garage.{Car, Customer, Garage}
import org.mongodb.scala._
import org.mongodb.scala.model.Filters._
import org.mongodb.scala.model.Updates._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object Main extends App {

  val mongoClient = new DBConnection("mongodb://localhost")
  val database = mongoClient.getDB("garage")
  val employeeCollection = mongoClient.getCollection(database,"employees")
  val vehicleCollection = mongoClient.getCollection(database,"vehicles")
  val customerCollection = mongoClient.getCollection(database,"customers")


  def addCustomer(cust: Document) = {
    customerCollection.insertOne(cust)
      .subscribe(new Observer[Completed] {
        override def onNext(result: Completed): Unit = println("Inserted")
        override def onError(e: Throwable): Unit = println(s"Failed ${e.getStackTrace.toString}")
        override def onComplete(): Unit = println("Completed")
      })
  }


  val Bob = new Customer(fullName ="Bob", customerID = 23)
  val car1 = new Car(1001, "ABC123", "B", false,Bob)
  val car2 = new Car(1002, "ABC12f3", "Ford", true, Bob)
  val car3 = new Car(1004, "ABC12e3", "Ford", true, Bob)

  addCustomer(Bob.toDoc())
  Thread.sleep(3000)
  mongoClient.closeConnection()






}
