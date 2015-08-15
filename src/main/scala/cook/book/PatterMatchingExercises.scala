package cook.book

/**
 * @author Yura.Susuk yurasusuk@gmail.com.
 */
object PatterMatchingExercises extends App {

  Array(1, 2) match {
    // array with 0
    case Array(0) =>
    // array with two element
    case Array(x, y) =>
    // array starting with 0
    case Array(0, _*) =>
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
