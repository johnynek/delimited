resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"

addSbtPlugin("com.jsuereth"       % "sbt-pgp"       % "1.1.1")
addSbtPlugin("com.github.gseitz"  % "sbt-release"   % "1.0.8")
addSbtPlugin("org.xerial.sbt"     % "sbt-sonatype"  % "2.3")
addSbtPlugin("pl.project13.scala" % "sbt-jmh"       % "0.3.4")
addSbtPlugin("com.typesafe.sbt"   % "sbt-site"      % "1.3.2")
addSbtPlugin("com.typesafe.sbt"   % "sbt-ghpages"   % "0.6.2")
addSbtPlugin("org.scoverage"      % "sbt-scoverage" % "1.5.1")
addSbtPlugin("com.eed3si9n"       % "sbt-unidoc"    % "0.4.1")
