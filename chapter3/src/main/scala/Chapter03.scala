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
    *  scala> val A: Array[Int] = Array(1, 2, 3, 0, -1, 4, 5, -2, 0)
    *  A: Array[Int] = Array(1, 2, 3, 0, -1, 4, 5, -2, 0)
    *  scala> val D = ArrayBuffer[Int]()
    *  D: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
    *  scala> var B = for(i <- 0 until A.length; from = if(A(i) < 0) i else {D.append(A(i)); -1}) yield from
    *  B: scala.collection.immutable.IndexedSeq[Int] = Vector(-1, -1, -1, -1, 4, -1, -1, 7, -1)
    *  scala> B = B.filter(elem => elem > 0).sorted
    *  B: scala.collection.immutable.IndexedSeq[Int] = Vector(4, 7)
    *  scala> for( elem <- B) D.append(A(elem))
    *  scala> D
    *  res0: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 0, 4, 5, 0, -1, -2)
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
    *  scala> val A = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    *  A: Array[Int] = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    *  scala> A.reverse
    *  res0: Array[Int] = Array(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
    *  scala> import scala.collection.mutable.ArrayBuffer
    *  import scala.collection.mutable.ArrayBuffer
    *  scala> val B = ArrayBuffer(1, 7, 2, 9)
    *  B: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 7, 2, 9)
    *  scala> B.reverse
    *  res1: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(9, 2, 7, 1)
    */

  /**
    *  Exercice 7
    *
    *  scala> val A = Array(0, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7, 7, 7, 8, 8, 9)
    *  A: Array[Int] = Array(0, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7, 7, 7, 8, 8, 9)
    *  scala> A.distinct
    *  res0: Array[Int] = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    */

  /**
    *  Exercice 8
    *
    *  scala> import scala.collection.mutable.ArrayBuffer
    *  import scala.collection.mutable.ArrayBuffer
    *  scala> val A: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 0, -1, 4, 5, -2, 0, -4, -8)
    *  A: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 0, -1, 4, 5, -2, 0, -4, -8)
    *  scala> var B = A.zipWithIndex.collect{case(elem, i) if elem < 0 => i}
    *  B: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(4, 7, 9, 10)
    *  scala> B = B.drop(1)
    *  B: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(7, 9, 10)
    *  scala> B = B.reverse
    *  B: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(10, 9, 7)
    *  scala> for (index <- B) A.remove(index)
    *  scala> A
    *  res0: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 0, -1, 4, 5, 0)
    */

  /**
    *  Exercice 9
    *
    *  import java.util.TimeZone._
    *  val TZs = TimeZone.getAvailableIDs.filter( zone => zone.contains("America/")).map(zone => zone.replace("America/", "")).sorted
    *  TZS: Array[String] = Array(Adak, Anchorage, ...)
    */

  /**
    *  Exercice 10
    *
    *  scala> import scala.collection.JavaConverters._
    *  import scala.collection.JavaConverters._
    *  scala> import java.awt.datatransfer._
    *  import java.awt.datatransfer._
    *  scala> val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
    *  flavors: java.awt.datatransfer.SystemFlavorMap = java.awt.datatransfer.SystemFlavorMap@1a19604
    *  scala> val scalaStuff = flavors.getNativesForFlavor(DataFlavor.imageFlavor).asScala
    *  scalaStuff: scala.collection.mutable.Buffer[String] = Buffer(PNG, JFIF, DIB, ENHMETAFILE, METAFILEPICT)
    */

}
