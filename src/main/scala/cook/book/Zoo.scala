package cook.book

/**
 * @author yurasusuk@gmail.com
 */

abstract class Animal {
  var color: String

  val greeting = {
    println("Animal");
    "Hello"
  }

  def say
}

class Dog(val age: Int) extends Animal {
  override var color = "blah"
  override val greeting = {
    println("Dog");
    "Woof"
  }

  def say = println("bark")
}

object Dog {
  def apply(age: Int): Animal = new Dog(age)
  def apply(age: Int, comment: String) = {
    new Dog(age)
    println(comment)
  }
}

object Zoo extends App {

  Dog(2)
  Dog(1, "blah")

}
