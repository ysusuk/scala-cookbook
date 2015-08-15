import org.specs2.Specification
import cook.book._

/**
 * @author Yura.Susuk yurasusuk@gmail.com.
 */
class MaxFuncSpec extends Specification {
  def is = s2"""
      This is a specification to check the 'max func'

      The 'max func' should
        from Array(1) must be 1                        $e1
        from Array(3, 2, 1) must be 3                  $e2

    """

  def e1 = {
    val maxValue: Option[Int] = max(Array(1))

    maxValue must beSome (1)
  }

  def e2 = {
    val maxValue: Option[Int] = max(Array(1, 2, 3))

    maxValue must beSome (3)
  }
}
