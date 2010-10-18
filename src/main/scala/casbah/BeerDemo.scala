package casbah

import com.novus.casbah.mongodb.Imports._

class BeerDemo() {

  val conn = MongoConnection("localhost", 27017) // default host and port

  val fridge = conn("indyscala")("beer")

  // we need some beer; let's start with Casbah's MongoDBObject...
  val guinness: DBObject = MongoDBObject(
    "name" -> "Guinness Draught",
    "variety" -> "stout",
    "origin" -> "Dublin, Ireland",
    "attributes" -> List("creamy", "widget can"))

  // ...more beer via Scala 2.8 builder
  val builder =MongoDBObject.newBuilder
  builder += "name" -> "Bully Porter"
  builder += "variety" -> "porter"
  builder += "origin" -> "Kansas City, Missouri, US"
  builder += "abv" -> .052
  builder += "attributes" -> List("craft beer")

  val bullyPorter = builder.result.asDBObject

  // save our beer for consumption later
  fridge += guinness
  fridge += bullyPorter

  // let's add a beer to pick on...
  val keystoneLight: DBObject = MongoDBObject(
    "name" -> "Keystone Light",
    "variety" -> "lager",
    "origin" -> "Golden, Colorado, US",
    "abv" -> .042,
    "attributes" -> List("tastes like water"))

  fridge += keystoneLight

  println("Beer stored safely.")

  // now where did I put that beer!?
  fridge.find().foreach { b =>
    println("Let's drink a %s!".format(b("name")))
  }

  // let's find a good US beer
  val query = (
    "attributes" $ne "tastes like water",
    "origin" -> ", US$".r)

  val goodBeer = fridge.findOne(query).foreach { b =>
    println("\n%s is a good beer.".format(b("name")))
  }
}
