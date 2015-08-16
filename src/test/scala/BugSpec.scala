import cook.book.Bug
import org.specs2.Specification

/**
 * @author Yura.Susuk yurasusuk@gmail.com.
 */
class BugSpec extends Specification {
  def is = s2"""

    This is a specification to check the moving bug

    The bug should
      move on for 4th position                                   $e1
      turn to 0 after move forward and backward on 4th steps     $e2
  """



  def e1 = {
    val bug = new Bug
    bug.move(4)

    bug.position must_== 4
  }

  def e2 = {
    val bug = new Bug
    // bug.move(4) and turn and then move(4)

    bug.position must_== 0
  }

}
