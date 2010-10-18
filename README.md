## Using MongoDB from Scala - Simple Demo Code

Bootstrapping:

    git clone git@github.com:bfritz/mongodb-from-scala.git
    cd mongodb-from-scala
    sbt update
    sbt ~console

From the sbt console:

    new casbah.BeerDemo


Casbah Info and References:

 * formerly known as "mongo-scala-wrappers"
 * primary developers are Brendan McAdams and Max Afonov
 * [source](http://github.com/novus/casbah) is on (github)[http://github.com)
 * license is Apache 2.0
 * inspired by [pymongo](http://api.mongodb.org/python/) for Python
 * [Documentation](http://novus.github.com/docs/casbah/sphinx/html/)
 * [Mailing List](http://groups.google.com/group/mongodb-casbah-users)
 * [Issue Tracker](http://novus.lighthouseapp.com/projects/57054-casbah/overview)
 * [Video](http://vimeo.com/14090025)
   and [slides](http://slideshare.net/bwmcadams/scalany-mongodb-aug10)
   of Brendan McAdams's presentation to NY Scala Enthusiasts
 * [CASE meetup](http://www.meetup.com/chicagoscala/calendar/14793832/)
   about Casbah in Chicago on Thursday, October 21st, 2010
 * key features:
   * allows pass-through of "bare" MongoDB queries
   * has support for GridFS
   * map/reduce support (without much documentation)

Other Scala drivers for MongoDB:

 * [mongo-scala-driver](http://github.com/osinka/mongo-scala-driver)
   * uses operators like <<, <<?, +=, -= on MongoDB collections
   * has object mapping via
     [Shapes](http://github.com/osinka/mongo-scala-driver/wiki/Shapes)
     library
 * [lift-mongodb](http://www.assembla.com/wiki/show/liftweb/lift-mongodb)
   (formerly "scamongo")
    * object mapping via
     [lift-mongodb-record](http://www.assembla.com/wiki/show/liftweb/lift-mongodb-record)
    * used by Foursquare and they are working on query library
 * Akka has [some support](http://doc.akkasource.org/persistence#MongoDB)
   for STM backed by MongoDB
