/**
  * Created by User on 25.12.2018.
  */

object Chapter01 {

  /**
    *   Exercice 1
    *
    *   scala> 3.<tab>
    *   %   +   >    >>>          isInstanceOf    toDouble    toLong      unary_+     |
    *   &   -   >=   ^^            toByte          toFloat     toShort     unary_-
    *   *   /   >>   asInstanceOf toChar          toInt       toString    unary_~
    */

  /**
    *   Exercice 2
    *
    *   scala> import scala.math._
    *   scala> sqrt(3)
    *   res0: Double = 1.7320508075688772
    *   scala> 3 - pow(res0, 2)
    *   res1: Double = 4.440892098500626E-16
    */

  /**
    *   Exercice 3
    *
    *   scala> 1 + 1
    *   res0: Int = 2
    *   scala> res0 = 3
    *   <console>:23: error: reassignment to val
    *          res0 = 3
    *
    *   So res variables are val.
    */

  /**
    *   Exercice 4
    *
    *   scala> "crazy" * 3
    *   res0: String = crazycrazycrazy
    *
    *   So this method returns the current string concatenated n (3) times.
    *   One can find the documentation for this method in scaladoc StringOps class documentation.
    */

  /**
    *   Exercice 5
    *
    *   scala> 10 max 2
    *   res0: Int = 10
    *
    *   max method, from 10 max 2, returns the maximum integer between 10 and 2. The max method is defined in class Int.
    */

  /**
    *   Exercice 6
    *
    *   scala> val bigint: BigInt = pow(2, 1024)
    *   <console>:22: error: type mismatch;
    *    found   : Double
    *    required: scala.math.BigInt
    *          val bigint: BigInt = pow(2, 1024)
    *
    *   BigInt is not the best fit for storing such a number.
    */

  /**
    *   Exercice 7
    *
    *   scala> import scala.BigInt._
    *   scala> import scala.util._
    *
    *   Just these two imports are needed to use probablePrime and Random without any qualifiers.
    */

  /**
    *   Exercice 8
    *
    *   scala> import scala.BigInt._
    *   scala> import scala.util._
    *   scala> val filename: BigInt = probablePrime(100, Random)
    *   scala> filename.toString(36)
    *   res0: String = 2m0iigyuhgq4f808w2hh
    */

  /**
    *   Exercice 9
    *
    *   scala> val filename: String = "2m0iigyuhgq4f808w2hh"
    *   scala> filename.take(1)
    *   res0: String = 2
    *   scala> filename.takeRight(1)
    *   res1: String = h
    *
    *   take(1) is the method that takes first character of a string in Scala, and takeRight(1) the method that returns
    *   the last character,
    */

    /**
      *  Exercice 10
      *
      *  val filename: String = "2m0iigyuhgq4f808w2hh"
      *  filename.take(2)
      *  res0: String = 2m
      *  filename.takeRight(4)
      *  res1: String = w2hh
      *  filename.drop(2)
      *  res2: String = 0iigyuhgq4f808w2hh
      *  filename.dropRight(4)
      *  res3: String = 2m0iigyuhgq4f808
      *
      *  take(n) returns the first n characters of a string, while takeRight(n) returns the last n characters of a
      *  string. drop(n) returns the original string minus its n first characters, while dropRight(n) returns the
      *  original string without its last n characters.
      */

}
