import org.specs2.specification.core.SpecStructure
import org.specs2.Specification
import cook.book._

class FactorialSpec extends Specification {
  override def is: SpecStructure = s2"""

      This is spec to check factorial function

      The factorial function shoudl
      for 1 return 1                  $e1
      for 0 return 0                  $e2
      for 5 return 120                $e3
    """


  def e1 = factorial(1) must_== (1)

  def e2 = factorial(0) must_== (0)

  def e3 = factorial(5) must_== (120)

}
