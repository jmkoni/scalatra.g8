val ScalatraVersion = "$scalatra_version$"

organization := "$organization$"

name := "$name$"

version := "$version$"

scalaVersion := "$scala_version$"

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  // base webapp
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "ch.qos.logback" % "logback-classic" % "1.1.5" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.2.15.v20160210" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "org.scalatra" %% "scalatra-scalate" % ScalatraVersion,
  // database
  "postgresql" % "postgresql" % "9.1-901.jdbc4",
  "com.typesafe.slick" %% "slick" % "2.1.0",
  "com.zaxxer" % "HikariCP-java6" % "2.3.8",
  // tests
  "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
  // yaml/password hashing
  "net.jcazevedo" % "moultingyaml" % "0.4.0",
  "org.mindrot" % "jbcrypt" % "0.4"
)

enablePlugins(ScalatraPlugin)
