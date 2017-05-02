resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"
resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

addSbtPlugin("com.artima.supersafe" % "sbtplugin" % "1.1.2")
addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")