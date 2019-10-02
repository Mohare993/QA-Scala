package Garage

import org.mongodb.scala.{MongoClient, MongoDatabase}

class DBConnection {

  def getClient(client: String) = {
    MongoClient(client)
  }

  def getDB(client: MongoClient, dbName: String) = {
     client.getDatabase(dbName)
  }

  def getCollection(db: MongoDatabase, collection: String) = {
    db.getCollection(collection)
  }

  def closeConnection(client: MongoClient): Unit ={
    client.close()
  }

}

