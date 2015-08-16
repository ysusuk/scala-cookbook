package cook.book

/**
 * @author Yura.Susuk yurasusuk@gmail.com.
 */

abstract class Dim[T](val value: Double, val name: String) { self: T =>
  protected def create(v: Double): T

  def +(other: Dim[T]) = create(value + other.value)

  override def toString() = value + " " + name
}

class Seconds(v: Double) extends Dim[Seconds](v, "s") {
  override def create(v: Double) = new Seconds(v)
}

class Meters(v: Double) extends Dim[Meters](v, "m") {
  override def create(v: Double) = new Meters(v)
}

object Dim extends App {

  println(new Meters(1) + new Meters(1))
  println(new Seconds(1) + new Seconds(1))
}