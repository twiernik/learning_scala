name := "maxicmd"

version := "1.0"

scalaVersion := "2.10.3"

libraryDependencies += "com.typesafe" % "config" % "0.4.0"

libraryDependencies += "net.ceedubs" %% "ficus" % "1.0.0"

libraryDependencies += "org.apache.httpcomponents" % "httpclient" % "4.3.3"
            
libraryDependencies += "org.scala-lang" % "scala-xml" % "2.11.0-M4"

libraryDependencies += "com.h2database" % "h2" % "1.3.175"            

libraryDependencies += "org.jooq" % "jooq" % "3.3.0"

libraryDependencies += "org.jooq" % "jooq-meta" % "3.3.0"

libraryDependencies += "org.jooq" % "jooq-codegen" % "3.3.0"

libraryDependencies += "com.github.nscala-time" %% "nscala-time" % "0.8.0"

libraryDependencies += "postgresql" % "postgresql" % "9.1-901.jdbc4"

libraryDependencies += "org.specs2" %% "specs2" % "2.3.10" % "test"

scalacOptions in Test ++= Seq("-Yrangepos")

//seq(jooqSettings:_*)
//
//jooqVersion := "3.3.0"
//
//jooqOptions := Seq("jdbc.driver" -> "org.postgresql.Driver",
//  "jdbc.url" -> "jdbc:postgresql://localhost/maxi",
//  "jdbc.user" -> "postgres",
//  "jdbc.password" -> "root",
//  "generator.database.inputSchema" -> "public",
//  "generator.database.name" -> "org.jooq.util.postgres.PostgresDatabase",
//  "generator.target.packageName" -> "maxicmd.jooq")
//
//jooqOutputDirectory := new File("src\\main\\java\\")