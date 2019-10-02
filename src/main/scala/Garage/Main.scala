package Garage

import Garage.{Car, Customer, Garage}
import org.mongodb.scala._
import org.mongodb.scala.model.Filters._
import org.mongodb.scala.model.Updates._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object Main extends App {


  val Halfords = new Garage
  val Bob = new Customer(fullName ="Bob", customerID = 23)
  val car1 = new Car(1001, "ABC123", "B", false,Bob)
  val car2 = new Car(1002, "ABC12f3", "Ford", true, Bob)
  val car3 = new Car(1004, "ABC12e3", "Ford", true, Bob)
  val employee1 = new Employee("Ben", 2333, true)

//  addDocument(customerCollection, Bob.toDoc)
//  addDocument(vehicleCollection, car1.toDoc)
//  deleteById(1001, vehicleCollection)
//  updateName(23, "Test2", customerCollection)
//  findById(23, customerCollection)
//  addDocument(employeeCollection, employee1.toDoc)
//    DB.deleteById(23, customerCollection)
//  findById(2333, employeeCollection)


//  Halfords.registerCustomer(Bob)
//  Halfords.registerEmployee(employee1)
//  Halfords.addVehicle(car1)
//  Halfords.addVehicle(car2)
//
//  Halfords.fixVehicle(1002, false)
//  Halfords.fixVehicle(1001, true)


  Halfords.garageContents()



  Thread.sleep(5000)
}
