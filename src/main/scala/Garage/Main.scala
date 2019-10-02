package Garage

import Garage.{Car, Customer, Garage}
import org.mongodb.scala._
import org.mongodb.scala.model.Filters._
import org.mongodb.scala.model.Updates._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object Main extends App {

  val connection = new DBConnection
  val mongoClient = connection.getClient("mongodb://localhost")
  val database = connection.getDB(mongoClient, "garage")
  val employeeCollection = connection.getCollection(database,"employees")
  val vehicleCollection = connection.getCollection(database,"vehicles")
  val customerCollection = connection.getCollection(database,"customers")


  def addDocument(collection: MongoCollection[Document], doc: Document) = {
    collection.insertOne(doc)
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

  addDocument(customerCollection, Bob.toDoc)
  addDocument(vehicleCollection, car1.todoc)
  Thread.sleep(3000)
  connection.closeConnection(mongoClient)






}
