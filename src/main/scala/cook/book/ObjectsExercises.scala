package cook.book

object Conversions {
  def inchesToCentimeters(inches: Double): Double = inches * 2.54

  def gallonsToLiters = {}

  def milesToKilometers = {}

  type Inches = Double
  type Centimeters = Double
  type Gallons = Double
  type Liters = Double
  type UnitConversion = Double => Double
}

import Conversions._

object inches2Centimeters extends UnitConversion {

  def apply(inches: Inches): Centimeters = inches * 2.54
}

//object GallonsToLiters extends UnitConversion

//object MilesToKilometers extends UnitConversion

object CardSuit extends Enumeration {
  type CardSuit = Value
  val Hearts = Value(100, "Hearts")
  val Diamonds = Value("Diamonds")
  val Clubs = Value("Clubs")
  val Spades = Value("Spades")
}

object ObjectsExercises extends App {

  val inches: Inches = 1
  var centimeters: Centimeters = inchesToCentimeters(inches)
  centimeters = inches2Centimeters(inches)

  println(CardSuit.Hearts)
  println(CardSuit.apply(103))
  println(CardSuit.withName("Diamonds"))

}
