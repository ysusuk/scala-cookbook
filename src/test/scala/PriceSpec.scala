import cook.book.{Multiple, Bundle, Article}
import cook.book.Item._

import org.specs2.Specification

/**
 * @author Yura.Susuk yurasusuk@gmail.com.
 */
class PriceSpec extends Specification {
  def is = s2"""
    This is spec to check 'price function'

    The 'price function' should
      price of bundle must be 122.85   $e1
      price of bundle with multiple 3 must be 3 times bigger $e2
  """

  val bundle = Bundle("Father's day special", 20.0,
    Article("Scala for the Impatient", 39.95),
    Bundle("Anchor Distillery Sampler", 10.0,
      Article("Old Potrero Straight Rye Whiskey", 79.95),
      Article("Junípero Gin", 32.95)))

  val bundleWithMultiple = Multiple(3, bundle)

  def e1 = price(bundle) must beCloseTo (122.85, 0.1)

  def e2 = price(bundleWithMultiple) must beCloseTo (368.55, 0.1)

}
