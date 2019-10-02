package Garage

import org.mongodb.scala.{MongoClient, MongoDatabase}

class DBConnection(location : String) {

  val mongoClient: MongoClient = MongoClient(location)

  def getDB(dbName: String) = {
       mongoClient.getDatabase(dbName)
  }

  def getCollection(db: MongoDatabase, collection: String) = {
    db.getCollection(collection)
  }

  def closeConnection(): Unit ={
    mongoClient.close()
  }

}

