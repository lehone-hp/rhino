// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.21")

// Ebean
addSbtPlugin("com.typesafe.sbt" % "sbt-play-ebean" % "4.1.0")

// Defines scaffolding (found under .g8 folder)
// http://www.foundweekends.org/giter8/scaffolding.html
// sbt "g8Scaffold form"
addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" % "0.11.0")

// Play enhancer: generated getters and setters
addSbtPlugin("com.typesafe.sbt" % "sbt-play-enhancer" % "1.2.2")
