import sbt._

object Dependencies {
  object Versions {
    val scala212 = "2.12.15"
    val scala213 = "2.13.8"
    val scala3 = "3.1.0"

    val trace4cats = "0.12.0"
    val trace4catsExporterHttp = "0.12.0"

    val circe = "0.14.1"
    val http4s = "0.23.7"

    val kindProjector = "0.13.2"
    val betterMonadicFor = "0.3.1"
  }

  lazy val trace4catsExporterCommon = "io.janstenpickle" %% "trace4cats-exporter-common" % Versions.trace4cats
  lazy val trace4catsKernel = "io.janstenpickle"         %% "trace4cats-kernel"          % Versions.trace4cats
  lazy val trace4catsModel = "io.janstenpickle"          %% "trace4cats-model"           % Versions.trace4cats
  lazy val trace4catsExporterHttp = "io.janstenpickle" %% "trace4cats-exporter-http" % Versions.trace4catsExporterHttp

  lazy val circeCore = "io.circe"           %% "circe-core"          % Versions.circe
  lazy val http4sCirce = "org.http4s"       %% "http4s-circe"        % Versions.http4s
  lazy val http4sBlazeClient = "org.http4s" %% "http4s-blaze-client" % Versions.http4s

  lazy val kindProjector = ("org.typelevel" % "kind-projector"     % Versions.kindProjector).cross(CrossVersion.full)
  lazy val betterMonadicFor = "com.olegpy" %% "better-monadic-for" % Versions.betterMonadicFor
}
