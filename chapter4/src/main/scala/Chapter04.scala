/**
  * Created by User on 26.12.2018.
  */
object Chapter04 {

  /**
    * Exercice 1
    *
    * scala> val prices = Map("Tesla"-> 100000, "BMW" -> 80000, "Benz" -> 120000, "Audi" -> 70000, "Jaguar" -> 150000, "Ferari" -> 200000)
    * prices: scala.collection.immutable.Map[String,Int] = Map(Audi -> 70000, Jaguar -> 150000, Tesla -> 100000, BMW -> 80000, Benz -> 120000, Ferari -> 200000)
    * scala> val reducedPrices = new scala.collection.mutable.HashMap[String, Double]
    * reducedPrices: scala.collection.mutable.HashMap[String,Double] = Map()
    * scala> for((k, v) <- prices) reducedPrices(k) = v - (v * 10.0 / 100.0)
    * reducedPrices
    * res0: scala.collection.mutable.HashMap[String,Double] = Map(Benz -> 108000.0, BMW -> 72000.0, Jaguar -> 135000.0, Audi -> 63000.0, Ferari -> 180000.0, Tesla -> 90000.0)
    */

  /**
    * Exercice 2
    *
    * scala> import java.io.File
    * import java.io.File
    * scala> import java.util.Scanner
    * import java.util.Scanner
    * scala> val wordCount = new scala.collection.mutable.HashMap[String, Int]
    * wordCount: scala.collection.mutable.HashMap[String,Int] = Map()
    * scala> val path = new File("./src/main/scala/text.txt")
    * path: java.io.File = .\src\main\scala\text.txt
    * scala> val in = new Scanner(path)
    * in: java.util.Scanner = java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0][match valid=false][need input=false][source closed=false][skipped=false][grou
    * p separator=\.][decimal separator=\,][positive prefix=][negative prefix=\Q-\E][positive suffix=][negative suffix=][NaN string=\Q?\E][infinity string=\Q?\E]
    * scala> while(in.hasNext()) { var key = in.next().replaceAll("""[\p{Punct}]""", ""); var value = wordCount.getOrElse(key, 0) + 1; wordCount(key) = value }
    * scala> wordCount
    * res0: scala.collection.mutable.HashMap[String,Int] = Map(justo -> 26, ad -> 1, odio -> 37, eget -> 59, magnis -> 1, rutrum -> 20, ultricies -> 28, lorem -> 32, fi
    * nibus -> 23, parturient -> 1, hendrerit -> 28, malesuada -> 32, platea -> 4, dui -> 32, felis -> 35, urna -> 40, bibendum -> 16, Fusce -> 27, Donec -> 42, interdum
    *  -> 21, aptent -> 1, laoreet -> 23, convallis -> 30, Aenean -> 19, purus -> 25, habitasse -> 4, nunc -> 31, ultrices -> 27, dignissim -> 16, vitae -> 52, congue ->
    *  24, netus -> 6, Suspendisse -> 19, dis -> 1, fames -> 7, elementum -> 22, et -> 82, Pellentesque -> 24, tellus -> 32, habitant -> 6, dictum -> 21, Aliquam -> 20,
    * lacinia -> 29, viverra -> 22, nisi -> 30, ac -> 74, ut -> 67, posuere -> 29, sagittis -> 29, non -> 63, sodales -> 13, ante -> 38, pulvinar -> 17...
    * scala> wordCount.size
    * res1: Int = 198
    */

  /**
    * Exercice 3
    *
    *
    */

  /**
    * Exercice 4
    *
    *
    */

  /**
    * Exercice 5
    *
    *
    */

  /**
    * Exercice 6
    *
    *
    */

  /**
    * Exercice 7
    *
    *
    */

  /**
    * Exercice 8
    *
    * scala> def minmax(values: Array[Int]): Tuple2[Int, Int] = {(values.min, values.max)}
    * minmax: (values: Array[Int])(Int, Int)
    * scala> minmax(Array(0,1,2,3,4,5))
    * res0: (Int, Int) = (0,5)
    */

  /**
    * Exercice 9
    *
    * scala> def lteqgt(values: Array[Int], v: Int): Tuple3[Int, Int, Int] = {(values.count(elem => elem < v), values.count(elem => elem == v), values.count(elem => elem > v))}
    * lteqgt: (values: Array[Int], v: Int)(Int, Int, Int)
    * scala> lteqgt(Array(0, 1, 2, 3, 4, 5), 3)
    * res0: (Int, Int, Int) = (3,1,2)
    */

  /**
    * Exercice 10
    *
    * scala> val x = "Hello".zip("World")
    * x: scala.collection.immutable.IndexedSeq[(Char, Char)] = Vector((H,W), (e,o), (l,r), (l,l), (o,d))
    * scala> import scala.math._
    * import scala.math._
    * scala> def editDistance(x: String, y: String): Int = {
    *      | var somme = abs(x.size - y.size)
    *      | val f = "Hello".zip("World")
    *      | for((k, v) <- f) { if(k != v) somme += 1; somme }
    *      | somme
    *      | }
    * editDistance: (x: String, y: String)Int
    * scala> editDistance("Hello", "World")
    * res0: Int = 4
    *
    * In this case, "Hello" is at 4 edit distance from "World".
    */

}
