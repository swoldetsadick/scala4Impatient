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

}
