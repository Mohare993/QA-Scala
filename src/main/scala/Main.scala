import Garage.{Car, Customer, Garage}

object Main extends App {

  val testGarage = new Garage
  val Bob = new Customer("Bob", 23)
  val car1 = new Car(1001, "ABC123", Bob)

  testGarage.addVehicle(car1)



 }