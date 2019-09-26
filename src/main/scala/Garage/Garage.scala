package Garage

import scala.collection.mutable.ListBuffer

class Garage {

  var vehicles = new ListBuffer[Vehicle]()
  var employees = new ListBuffer[Employee]()
  var isOpen = true


  def addVehicle(vehicle: Vehicle): Unit ={
    vehicles += vehicle
  }

  def removeVehicle(vehicleID: Int): {
  }

  def registerEmployee(employee: Employee): Unit = {
    employees += employee
  }

  def fixVehicle(): Unit ={

  }

  def calcBill(): Unit = {

  }

  def isGarageOpen(bool: Boolean) = {
    isOpen = bool
  }


}
