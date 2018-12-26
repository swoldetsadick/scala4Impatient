/**
  * Created by User on 25.12.2018.
  */
class Chapter02 {

  /**
    *  Exercice 1
    *
    *  scala> def signum(number: Double): Int = {
    *       | if (number == 0) 0
    *       | else if (number < 0) -1
    *       | else 1
    *       | }
    *  signum: (number: Double)Int
    *  scala> signum(-19)
    *  res0: Int = -1
    *  scala> signum(0)
    *  res1: Int = 0
    *  scala> signum(19)
    *  res2: Int = 1
    */

  /**
    *  Exercice 2
    *
    *  scala> val x = {}
    *  x: Unit = ()
    *
    *  The value of an empty block expression {} is () and it's type is scala.Unit.
    */

  /**
    *  Exercice 3
    *
    *  scala> var x: Unit = ()
    *  x: Unit = ()
    *  scala> var y: Int = 0
    *  y: Int = 0
    *  scala> x = y = 1
    *  x: Unit = ()
    *  scala> x
    *  x: Unit = ()
    *  scala> y
    *  y: Int = 1
    *
    *  x = y = 1 is generally a suitable assignment for a void x where assignment is to be applied only to y.
    */

  /**
    *  Exerice 4
    *
    *  scala> for (i <- 0 to 10; j = 10 - i) println(j)
    *  10
    *  9
    *  8
    *  7
    *  6
    *  5
    *  4
    *  3
    *  2
    *  1
    *  0
    */

  /**
    *  Exercice 5
    *
    *  scala> def countdown(n: Int) { for (i <- 0 to n; j = n - i) println(j) }
    *  countdown: (n: Int)Unit
    *  scala> countdown(5)
    *  5
    *  4
    *  3
    *  2
    *  1
    *  0
    */

  /**
    *  Exercice 6
    *
    *  scala> var prod1: Int = 1
    *  prod1: Int = 1
    *  scala> var prod2: BigInt = 1
    *  prod2: scala.math.BigInt = 1
    *  scala> for( c <- "Hello"; l = c.toLong) prod1 *= l.toInt;
    *  scala> for( c <- "Hello"; l = c.toLong) prod2 *= l;
    *  scala> print(prod1)
    *  825152896
    *  scala> print(prod2)
    *  9415087488
    *
    *  Int is not well suited here. A better suited type would be BigInt or Long. Integer overflow.
    */

  /**
    * Exercice 7
    *
    * scala> "Hello".map(_.toLong).foldLeft(1: BigInt)(_*_)
    * res0: scala.math.BigInt = 9415087488
    * scala> "Hello".map(_.toLong).foldLeft(1: Long)(_*_)
    * res1: Long = 9415087488
    * scala> "Hello".map(_.toLong.toInt).foldLeft(1: Int)(_*_)
    * res2: Int = 825152896
    */

  /**
    *  Exercice 8
    *  scala> def product(arg: String): Long = {
    *       | var result: Long = 1
    *       | for( c <- arg; l = c.toLong) result *= l
    *       | result
    *       | }
    *  product: (arg: String)Long
    *  scala> product("Hello")
    *  res0: Long = 9415087488
    */

  /**
    *  Exercice 9
    *  scala> def product(arg: String): Long = {
    *       | if (arg.length == 0) 0
    *       | else if (arg.length == 1) arg(0).toLong
    *       | else arg(0).toLong * prod(arg.drop(1))
    *       | }
    *  product: (arg: String)Long
    *  scala> product("Hello")
    *  res0: Long = 9415087488
    */

  /**
    *  Exercice 10
    *
    *  scala> def powered(x: Double, n: Int): Double = {
    *       | if (n == 0) 1
    *       | else if (n < 0) (1.0 / powered(x, n * -1))
    *       | else if (n % 2 == 1) (x * powered(x, n - 1))
    *       | else (powered(x, n / 2) * powered(x, n / 2))
    *       | }
    *  powered: (x: Double, n: Int)Double
    *  scala> powered(2, 3)
    *  res0: Double = 8
    */

}
