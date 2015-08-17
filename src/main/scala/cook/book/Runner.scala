package cook.book

import StringUtils._

/**
 * @author Yura.Susuk yurasusuk@gmail.com.
 */
object Runner extends App {

  println("dog say: ".bark)
  println("duck say: ".quack)
  println("cat say: ".mew)

  val person = new Person("Adam", "Mayer")
  person.firstName
  person.lastName

  new Person("")

  println(3!)
}
