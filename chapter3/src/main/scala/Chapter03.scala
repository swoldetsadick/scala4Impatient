/**
  * Created by User on 26.12.2018.
  */
object Chapter03 {

  /**
    *  Exercice 1
    *
    *  scala> n: Int = 10
    *  n: Int = 10
    *  scala> val rang = 0 until n
    *  rang: scala.collection.immutable.Range = Range(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    *  scala> val a = rang.toArray
    *  a Array[Int] = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    */

  /**
    *  Exercice 2
    *
    *  scala> val rang = 0 until 10
    *  rang: scala.collection.immutable.Range = Range(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    *  scala> val a = rang.toArray
    *  a Array[Int] = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    *  scala> for(i <- 0 until a.length) if (i % 2 == 0) {var b = a(i); a(i) = a(i+1); a(i + 1) = b}
    *  scala> a
    *  res0: Array[Int] = Array(1, 0, 3, 2, 5, 4, 7, 6, 9, 8)
    */

  /**
    *  Exercice 3
    *
    *  scala> val rang = 0 until 10
    *  rang: scala.collection.immutable.Range = Range(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    *  scala> val a = rang.toArray
    *  a Array[Int] = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    *  scala> val b = for (i <- 0 until a.length; from = if (i % 2 == 0) a(i + 1) else a(i - 1)) yield from
    *  b: scala.collection.immutable.IndexedSeq[Int] = Vector(1, 0, 3, 2, 5, 4, 7, 6, 9, 8)
    *  scala> val c = b.toArray
    *  c: Array[Int] = Array(1, 0, 3, 2, 5, 4, 7, 6, 9, 8)
    *
    *
    */

  /**
    *  Exercice 4
    *
    *
    */

  /**
    *  Exercice 5
    *
    *  scala> val a = Array(1.0, 2.0, 3.0)
    *  a: Array[Double] = Array(1.0, 2.0, 3.0)
    *  scala> val mean: Double = a.sum / a.size
    *  mean: Double = 2.0
    */

  /**
    *  Exercice 6
    *
    *
    */

  /**
    *  Exercice 7
    *
    *
    */

  /**
    *  Exercice 8
    *
    *
    */

  /**
    *  Exercice 9
    *
    *
    */

  /**
    *  Exercice 10
    *
    *
    */

}
