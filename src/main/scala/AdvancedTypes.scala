import scala.collection.generic.CanBuildFrom

/**
 * @author Yura.Susuk yurasusuk@gmail.com.
 */

// Singleton type
// this.type to chain methods
// object.type - to pass object as param

// Type Projections class#nested-class
// nested class of any class

// Path
// cook.cook.Document

// Type Aliases
// type Index = HashMap[String, (Int, Int)]


// Structural type (type safe duck typing)
// A “structural type” is a specification of abstract methods, fields, and types that a conforming type should possess.
// Structural types are similar to “duck typing” in dynamically typed programming languages.

// Compound Types
// T1 with T2 with T3 {}

// Infix Types
// An infix type is a type with two type parameters, written in “infix” syntax, with the type name between the type parameters.
// val map: String Map Int = Map("1" -> 1)

// Existential Types
// Existential types were added to Scala for compatibility with Java wildcards.
// Map[_,_]
// Map[T, U] forSome {
//  type T; type U <: T
// }

// Self type
// component that uses trait should extend type defined by self

class Document {
  def setTitle(title: String): this.type = {
    this
  }

  def setAuthor(author: String): this.type = {
    this
  }

}

class Book extends Document {
  def addChapter(chapter: String) = {
    this
  }
}

trait Logged {
  def log(msg: String) {}
}

trait LoggedException extends Logged {
  // self type
  // this: T1 with T2 =>
  self: Exception =>
  def log() {
    log(getMessage())
  }
}

object AdvancedTypes extends App {

  new Book()
    .setAuthor("author")
    .setTitle("Scala for the Impatient")
    .addChapter("chapter")

  type ×[A, B] = (A, B)

  val map: String Map Int = Map("1" -> 1, "2" -> 2)

  val m: Map[_, _] = Map("1" -> 1)

}
