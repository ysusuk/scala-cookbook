package cook.book

/**
 * @author Yura.Susuk yurasusuk@gmail.com.
 */
class Bug {
  sealed abstract class Direction
  case object Left extends Direction
  case object Right extends Direction

  var position: Int = 0
  private[this] var direction: Direction = Right

  private def moveLeft(steps: Int): Int = {
    position -= steps
    position
  }

  private def moveRight(steps: Int): Int = {
    position += steps
    position
  }

  def move(steps: Int): this.type = {
    direction match {
      case Left => moveLeft(steps)
      case Right => moveRight(steps)
    }
    this
  }

  def show(): this.type = {
    this
  }

  def and: this.type = this

  def then(): this.type = this

  def turn(): this.type = {
    direction match {
      case Left => direction = Right
      case Right => direction = Left
    }
    this
  }
}
