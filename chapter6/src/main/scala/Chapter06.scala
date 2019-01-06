/**
  * Created by User on 28.12.2018.
  */
object Chapter06 {

  def main(args: Array[String]): Unit = {

    // Exercise I
    val gallons, inches, miles: Double = 150
    printf("%f gallons are equivalent to %f Liters.\n", gallons, Conversions.gallonsToLiters(gallons))
    printf("%f inches are equivalent to %f centimeters.\n", inches, Conversions.inchesToCentimeters(inches))
    printf("%f miles are equivalent to %f Kilometers.\n", miles, Conversions.milesToKilometers(miles))

    // Exercise II
    printf("%f gallons are equivalent to %f Liters.\n", gallons, GallonsToLiters.convert(gallons))
    printf("%f inches are equivalent to %f centimeters.\n", inches, InchesToCentimeters.convert(inches))
    printf("%f miles are equivalent to %f Kilometers.\n", miles, MilesToKilometers.convert(miles))

    // Exercise III
    // Its not a good idea since java.awt.Point class is mutable.

    // Exercise IV
    val p = Point(2, 3)
    printf("Defining a point at position (%f, %f).\n", p.x, p.y)

    // Exercise V


    // Exercise VI
    println(Cards.carreau.toString)
    println(Cards.coeur.toString)
    println(Cards.pique.toString)
    println(Cards.trefle.toString)

    // Exercise VII
    println(Cards.isRed(Cards.carreau))
    println(Cards.isRed(Cards.coeur))
    println(Cards.isRed(Cards.pique))
    println(Cards.isRed(Cards.trefle))

    // Exercise VIII
    println(RGB.Black)
    println(RGB.Blue)
    println(RGB.Cyan)
    println(RGB.Lime)

  }

  /* Exercise I */

  object Conversions {

    def gallonsToLiters(gallons: Double): Double = {
      gallons * 3.78541
    }

    def inchesToCentimeters(inches: Double): Double = {
      inches * 2.54
    }

    def milesToKilometers(miles: Double): Double = {
      miles * 1.60934
    }

  }

  /* Exercise II */

  class UnitConversion {
    def convert(someUnit: Double): Double = {
      someUnit
    }

  }

  object GallonsToLiters extends UnitConversion {
    override def convert(gallons: Double): Double = {
      gallons * 3.78541
    }
  }

  object InchesToCentimeters extends UnitConversion {
    override def convert(inches: Double): Double = {
      inches * 2.54
    }
  }

  object MilesToKilometers extends UnitConversion {
    override def convert(miles: Double): Double = {
      miles * 1.60934
    }
  }

  /* Exercise III */

  object Origin extends java.awt.Point {
    // Its not a good idea since java.awt.Point class is mutable.
  }

  /* Exercise IV */

  class Point(val x: Double, val y:Double) {}

  object Point {
    def apply(x: Double, y: Double) = new Point(x, y)
  }

  /* Exercise V */
  object Reverse extends App {
    println(args.reverse.mkString(" "))
  }

  /* Exercise VI */
  object Cards extends Enumeration {
    val trefle = Value("♣")
    val carreau = Value("♦")
    val coeur = Value("♥")
    val pique = Value("♠")

    /* Exercise VII */
    def isRed(card: Any): Boolean = {
      card == coeur | card == carreau
    }
  }

  /* Exercise VIII */
  object RGB extends Enumeration {
    val Black = Value(0x000000)
    val White = Value(0xffffff)
    val Red = Value(0xff0000)
    val Lime = Value(0x00ff00)
    val Blue = Value(0x0000ff)
    val Yellow = Value(0xffff00)
    val Cyan = Value(0x00ffff)
    val Magenta = Value(0xff00ff)
  }


}
