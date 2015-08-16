package cook.book

/**
 * @author Yura.Susuk yurasusuk@gmail.com.
 */

// T <: UpperBound, T >: LowerBound, T <% ViewBound, T : ContextBound
// T <: Upper >: Lower
// T <% Comparable[T] <% String
// T : Ordering : Manifest

// The <% relation means that T can be converted to a Comparable[T] through an implicit conversion.

// (implicit ev: T <:< UpperBound)

// Use +T (covariance) to indicate that a generic type’s subtype relationship is in the same direction as the parameter T,
// or -T (contravariance) to indicate the reverse direction.

// T invariance

// Covariance (+T) is appropriate for parameters that denote outputs, such as elements in an immutable collection.

// Contravariance (-T) is appropriate for parameters that denote inputs, such as function arguments.

// type constraints
// T =:= U
// T <:< U
// T <%< U

object TypeParams extends App {

  //class Pair[+T](var first: T, var second: T)
  //class Pair[+T](val first: T, val second: T) {
  //def replaceFirst[R >: T](newFirst: R) = new Pair(newFirst, second)
  //}

  class Pair[T, S](val `1`: T, val `2`: S) {
    def swap() = Pair(`2`, `1`)

    override def toString = "first: " + `1` + "; second: " + `2`
  }

  object Pair {
    def apply[T, S](`1`: T, `2`: S) = new Pair(`1`, `2`)
  }

  val pair = Pair(1, 5)
  println(pair)
  println(pair.swap())
  println(pair.`1`)
  println(pair.`2`)

  class PairM[T](var first: T, var second: T) {
    def swap() {
      val temp = first
      first = second
      second = temp
    }

    override def toString = "first: " + first + "; second: " + second
  }

  val pairM = new PairM(first = 1, second = 5)
  println(pairM)
  pairM.swap()
  println(pairM)

}