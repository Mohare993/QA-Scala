package Garage

import org.mongodb.scala.{Completed, Document, MongoCollection, Observer}
import org.mongodb.scala.model.Filters.equal
import org.mongodb.scala.model.Updates.set
import scala.concurrent._
import ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

class DBMethods   {

  def addDocument(collection: MongoCollection[Document], doc: Document) = {
    collection.insertOne(doc)
      .subscribe(new Observer[Completed] {
        override def onNext(result: Completed): Unit = println("Inserted")
        override def onError(e: Throwable): Unit = println(s"Failed ${e.getStackTrace.toString}")
        override def onComplete(): Unit = println("Completed")
      })
  }

  def addDocuments(collection: MongoCollection[Document], doc: IndexedSeq[Document]) = {
    collection.insertMany(doc)
      .subscribe(new Observer[Completed] {
        override def onNext(result: Completed): Unit = println("Inserted")
        override def onError(e: Throwable): Unit = println(s"Failed ${e.getStackTrace.toString}")
        override def onComplete(): Unit = println("Completed")
      })
  }

  def deleteById(id: Int, collection: MongoCollection[Document]) = {
    collection.deleteOne(equal("_id", id)).headOption().onComplete{
      case Success(value) => println("Deleted")
      case Failure(error) => error.printStackTrace()
    }

  }

  def updateName(id: Int, newName: String, collection: MongoCollection[Document]) = {
    collection.updateOne(equal("_id", id), set("fullName", newName)).headOption().onComplete{
      case Success(value) => println(s"The value has been updated")
      case Failure(error) => error.printStackTrace()
    }
  }

  def updateVehicleFix(id: Int, isFixed: Boolean, collection: MongoCollection[Document]) = {
    collection.updateOne(equal("_id", id), set("isFixed", isFixed)).headOption().onComplete{
      case Success(value) => println(s"The value has been updated")
      case Failure(error) => error.printStackTrace()
    }
  }

  def findById(id: Int, collection: MongoCollection[Document]) = {
    collection.find(equal("_id", id)).headOption().onComplete{
      case Success(value) => println(s"The value we've been waiting for is: ${value.getOrElse("")}")
      case Failure(error) => error.printStackTrace()
    }
  }


}
