resolvers ++= DefaultOptions.resolvers(snapshot = true)

addSbtPlugin("com.typesafe.play" % "play-docs-sbt-plugin" % sys.props.getOrElse("play.version", "2.4.0-RC3"))
addSbtPlugin("com.typesafe.play" % "interplay" % "1.0.1")
