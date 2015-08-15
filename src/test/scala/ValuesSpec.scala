import org.specs2.Specification
import cook.book.{values => valuesInRange}

/**
 * @author Yura.Susuk yurasusuk@gmail.com.
 */
class ValuesSpec extends Specification {
  def is = s2"""

      This is a specification to check the 'values func'

      The 'values func' should
        start with (-5, 25)                            $e1
        contain (0, 0) pair                            $e2
        contain 10 pairs                               $e3
        end with (5, 25)                               $e4
  """

  val pairs = valuesInRange(x => x * x, -5, 5)

  def e1 = pairs.head must_==(-5, 25)

  def e2 = pairs must contain((0, 0))

  def e3 = pairs must have size 11

  def e4 = pairs.last must_==(5, 25)

}
