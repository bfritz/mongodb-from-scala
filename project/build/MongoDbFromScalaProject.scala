import sbt._

class MongoDbFromScalaProject(info: ProjectInfo) extends DefaultProject(info) {
  override def repositories = super.repositories ++ Set(
    "Casbah Releases" at "http://repo.bumnetworks.com/releases/",
    "Casbah Snapshots" at "http://repo.bumnetworks.com/snapshots/"
  )

  val casbah = "com.novus" % "casbah_2.8.0" % "1.0.8.5"
}
