package cook

import scala.math._

/**
 * @author Yura.Susuk yurasusuk@gmail.com.
 */
package object book {
  // import java.util.{HashMap => JavaHashMap, HashMap => _}
  // def valueAtOneQuarter(f: (Double) => Double) = f(0.25)

  // println(valueAtOneQuarter(ceil _))

  def values(fun: (Int) => Int, low: Int, high: Int): Seq[(Int, Int)] = {
    val in = (low to high)
    val out = in.map(fun)
    in.zip(out)
  }

  implicit class StringExt1(val s: String) {
    def mew = "mew - mew!"
  }

}
