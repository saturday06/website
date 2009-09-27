
import sbt._

class TestUseIvy(info: ProjectInfo) extends DefaultProject(info)
{
	override def managedStyle = ManagedStyle.Ivy
	val publishTo = Resolver.file("test-repo", path("repo").asFile)
	val published = "test" % "test-ivy" % "1.0"
	val publishedT = "test" % "test-ivy" % "1.0" % "test"
	val publishedR = "test" % "test-ivy" % "1.0" % "runtime"

	val mavenC = "test" % "test" % "1.0"
	val mavenT = "test" % "test" % "1.0" % "test"
	val mavenR = "test" % "test" % "1.0" % "runtime"
}