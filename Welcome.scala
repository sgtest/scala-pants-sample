package org.srclib.scala.welcome;

object WelcomeEverybody {
  def apply(everybody: Seq[String]) {
    everybody.map(x => println(x))
  }
}
