import org.specs2.Specification
import cook.book.collection._

import scala.collection.mutable

/**
 * @author Yura.Susuk yurasusuk@gmail.com.
 */
class IndexesSpec extends Specification {
  def is = s2"""

    indexes of m should be {0}            $e1
    indexes of m should be {0}            $e2

  """

  def e1 = {
    val map = indexes("Mississippi")
    map must contain('M' -> mutable.TreeSet(0))
    map must contain('i' -> mutable.TreeSet(1, 4, 7, 10))
  }

  def e2 = {
    val map = indexesFold("Mississippi")
    map must contain('M' -> mutable.TreeSet(0))
    map must contain('i' -> mutable.TreeSet(1, 4, 7, 10))
  }

}
