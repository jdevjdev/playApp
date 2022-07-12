import mill._
import $ivy.`com.lihaoyi::mill-contrib-playlib:`,  mill.playlib._

object playapp extends PlayModule with SingleModule {

  def scalaVersion = "2.12.10"
  def playVersion = "2.8.16"
  def twirlVersion = "1.5.1"

  object test extends PlayTests
}
