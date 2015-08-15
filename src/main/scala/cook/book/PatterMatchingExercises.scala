package cook.book

/**
 * @author Yura.Susuk yurasusuk@gmail.com.
 */
abstract class Item

case class Article(description: String, price: Double) extends Item

case class Bundle(description: String, discount: Double, items: Item*) extends Item

case class Multiple(quantity: Int, item: Item) extends Item

object Item {

  def price(it: Item): Double = it match {
    case Article(_, p) => p
    case Bundle(_, disc, its@_*) => its.map(price _).sum - disc
    case Multiple(quantity, item) => quantity * price(item)
  }
}

object PatterMatchingExercises extends App {

  Array(1, 2) match {
    // array with 0
    case Array(0) =>
    // array with two element
    case Array(x, y) =>
    // array starting with 0
    case Array(0, elems@_*) =>
  }

  List(1, 2) match {
    case 0 :: Nil => "0"
    case x :: y :: Nil => x + " " + y
    case 0 :: tail => "0 ..."
    case _ => "something else"
  }

  (1, 2) match {
    case (0, _) => "0 ..."
    case (y, 0) => y + " 0"
    case _ => "neither is 0"
  }


  // unapply
  // unapplySeq - for var length

}
