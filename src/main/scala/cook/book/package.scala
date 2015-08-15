package cook

import scala.util.Try

/**
 * @author Yura.Susuk yurasusuk@gmail.com.
 */
package object book {
  // import java.util.{HashMap => JavaHashMap, HashMap => _}
  // def valueAtOneQuarter(f: (Double) => Double) = f(0.25)

  // println(valueAtOneQuarter(ceil _))

  def values(fun: (Int) => Int, low: Int, high: Int): Seq[(Int, Int)] = (low to high).map(x => (x, fun(x)))

  // def values(fun: (Int) => Int, low: Int, high: Int, step: Int): Seq[(Int, Int)] = {
    // val inOut = values(fun, low, high)
    // Seq.fill(inOut.size)(step).zip(inOut).flatten
  // }

  def max[T](arr: Array[T])(implicit ord: Ordering[T]): Option[T] = {
    Try(arr.reduceLeft((a, b) => if (ord.compare(a, b) >= 0) a else b)).toOption

//    arr match {
//      case Array() => None
//      case Array(x) => Some(x)
//      case a@Array(_*) => Some(a(0))
//      case _ => None
//    }
  }

  def swap[T1, T2](pair: (T1, T2)): (T2, T1) = (pair._2, pair._1)

  def swap[T](arr: Array[T]) = arr match {
    case Array(x::y::ys) => y :: x :: ys
    // case Array(x, y, _*) => Array(y, x, _)
  }

  implicit class StringExt1(val s: String) {
    def mew = "mew - mew!"
  }

}
