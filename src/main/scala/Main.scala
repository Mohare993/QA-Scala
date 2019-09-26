import Garage.{Car, Customer, Garage}

object Main extends App {

  val testGarage = new Garage
  val Bob = new Customer("Bob", 23)
  val car1 = new Car(1001, "ABC123", "B", false,Bob)
  val car2 = new Car(1002, "ABC12f3", "Ford", true, Bob)
  val car3 = new Car(1004, "ABC12e3", "Ford", true, Bob)

  testGarage.addVehicle(car1)
  testGarage.addVehicle(car2)
  testGarage.addVehicle(car3)
  println(testGarage.vehicles)
  testGarage.removeVehicle(1004)
  testGarage.garageContents()

 }