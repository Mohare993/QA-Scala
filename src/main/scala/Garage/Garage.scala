package Garage

import scala.collection.mutable.ListBuffer

class Garage {

  var vehicles = new ListBuffer[Vehicle]()
  var employees = new ListBuffer[Employee]()
  var isOpen = true

  def addVehicle(vehicle: Vehicle): Unit ={
    vehicles += vehicle
  }

  def removeVehicle(searchID: Int): Unit = {
    vehicles = vehicles.filter(_.vehicleID != searchID).filter(_.model != searchID)
  }

  def registerEmployee(employee: Employee): Unit = {
    employees += employee
  }

  def fixVehicle(searchID: String): Unit = {
    vehicles.filter(_.vehicleID == searchID).foreach(_.isFixed = true)
  }

  def calculateBills(vehicle: Vehicle): Unit = {
  }


  def isGarageOpen(bool: Boolean): Unit = {
    isOpen = bool
  }

  def garageContents(): Unit ={
  println("Garage contents are:")
  vehicles.map(println(_))
  }

}