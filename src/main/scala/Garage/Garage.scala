package Garage

import scala.collection.mutable.ListBuffer

class Garage {

  val DB = new DBMethods
  val connection = new DBConnection
  val mongoClient = connection.getClient("mongodb://localhost")
  val database = connection.getDB(mongoClient, "garage")
  val employeeCollection = connection.getCollection(database,"employees")
  val vehicleCollection = connection.getCollection(database,"vehicles")
  val customerCollection = connection.getCollection(database,"customers")

  var isOpen = true

  def addVehicle(vehicle: Vehicle): Unit ={
      DB.addDocument(vehicleCollection, vehicle.toDoc)
  }

  def removeVehicle(searchID: Int): Unit = {
    DB.deleteById(searchID, vehicleCollection)
  }

  def registerEmployee(employee: Employee): Unit = {
    DB.addDocument(employeeCollection, employee.toDoc)
  }

  def registerCustomer(customer: Customer): Unit = {
    DB.addDocument(customerCollection, customer.toDoc)
  }

  def fixVehicle(searchID: Int, isFixed: Boolean): Unit = {
    DB.updateVehicleFix(searchID, isFixed, vehicleCollection)
  }

//  def calculateBills(): Double = vehicles.size * 50


  def isGarageOpen(bool: Boolean): Unit = {
    isOpen = bool
  }

  def garageContents(): Unit ={
    println("Garage contents are:")
    val vehicles = vehicleCollection.find()
    vehicles.foreach(println)
  }



}