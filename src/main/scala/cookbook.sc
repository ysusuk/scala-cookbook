
def ~=(x: Double, y: Double, precision: Double) =
  if ((x - y).abs < precision) true else false

val a = 0.3
val b = 0.1 + 0.2
a == b
~=(a, b, 0.0001)

object Eq {
  implicit val precision = 0.0001

  implicit class IntExt(x: Double) {
    def ~=(y: Double)(implicit precision: Double) =
      if ((x - y).abs < precision) true else false
  }
}

import Eq._

a ~= (b)

def blah(say: String = "quack") = println(say)

blah()
val (q, r) = BigInt(10) /% 3

sealed trait Blah

