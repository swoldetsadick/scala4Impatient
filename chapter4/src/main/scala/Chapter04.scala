/**
  * Created by User on 26.12.2018.
  */
object Chapter04 {

  /**
    * Exercise 1
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
    * Exercise 2
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
    * Exercise 3
    *
    * scala> import java.io.File
    * import java.io.File
    * scala> import java.util.Scanner
    * import java.util.Scanner
    * scala> val path = new File("./src/main/scala/text.txt")
    * path: java.io.File = .\src\main\scala\text.txt
    * scala> val in = new Scanner(path)
    * in: java.util.Scanner = java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0][match valid=false][need input=false][source closed=false][skipped=false][grou
    * p separator=\.][decimal separator=\,][positive prefix=][negative prefix=\Q-\E][positive suffix=][negative suffix=][NaN string=\Q?\E][infinity string=\Q?\E]
    * scala> import scala.collection.mutable._
    * import scala.collection.mutable._
    * scala> val D = ArrayBuffer[String]()
    * D: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer()
    * scala> while(in.hasNext()) { var key = in.next().replaceAll("""[\p{Punct}]""", ""); D.append(key) }
    * scala> val E = ArrayBuffer[Int]()
    * E: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
    * scala> for( elem <- D ) E.append(D.count(el => el == elem))
    * scala> val F = D.zip(E)
    * F: scala.collection.mutable.ArrayBuffer[(String, Int)] = ArrayBuffer((Lorem,2), (ipsum,29), (dolor,26), (sit,67), (amet,67), (consectetur,28), (adipiscing,2), (eli
    * t,38), (Praesent,20), (in,60), (mattis,18), (nisl,31), (eu,57), (vulputate,37), (lacus,34), (Curabitur,29), (luctus,21), (mollis,21), (odio,37), (Etiam,14), (elit,
    * 38), (urna,40), (consectetur,28), (sit,67), (amet,67), (sollicitudin,35), (a,63), (finibus,23), (eu,57), (mauris,38), (Sed,48), (fermentum,28), (rhoncus,25), (nequ
    * e,43), (blandit,26), (placerat,21), (Morbi,31), (nec,76), (euismod,27), (lorem,32), (Maecenas,17), (varius,26), (urna,40), (id,51), (urna,40), (venenatis,30), (vul
    * putate,37), (In,30), (at,68), (ex,27), (nec,76), (orci,35), (ornare,33), (luctus,21), (Sed,48), (luctus,21), (ante,38), (nec,76), (urna,40), (var...
    * scala> val result = F.toMap
    * result: scala.collection.immutable.Map[String,Int] = Map(elit -> 38, Curae -> 3, est -> 35, consequat -> 26, pulvinar -> 17, Pellentesque -> 24, tortor -> 34, frin
    * gilla -> 17, consectetur -> 28, sed -> 60, aliquet -> 19, taciti -> 1, vulputate -> 37, dictum -> 21, in -> 60, fames -> 7, accumsan -> 24, sapien -> 35, sagittis
    * -> 29, efficitur -> 16, torquent -> 1, molestie -> 33, Maecenas -> 17, volutpat -> 23, Fusce -> 27, Vestibulum -> 27, dui -> 32, senectus -> 6, hac -> 4, auctor ->
    *  21, eu -> 57, ultricies -> 28, Etiam -> 14, aliquam -> 28, nec -> 76, justo -> 26, laoreet -> 23, sit -> 67, mattis -> 18, quis -> 56, ultrices -> 27, In -> 30, r
    * honcus -> 25, vitae -> 52, risus -> 36, Orci -> 1, dapibus -> 17, ridiculus -> 1, ipsum -> 29, tempus -> 16, felis -> 35, cubilia -> 3, mus -> 1,...
    */

  /**
    * Exercise 4
    *
    * scala> import java.io.File
    * import java.io.File
    * scala> import java.util.Scanner
    * import java.util.Scanner
    * scala> val path = new File("./src/main/scala/text.txt")
    * path: java.io.File = .\src\main\scala\text.txt
    * scala> val in = new Scanner(path)
    * in: java.util.Scanner = java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0][match valid=false][need input=false][source closed=false][skipped=false][grou
    * p separator=\.][decimal separator=\,][positive prefix=][negative prefix=\Q-\E][positive suffix=][negative suffix=][NaN string=\Q?\E][infinity string=\Q?\E]
    * scala> import scala.collection.mutable._
    * import scala.collection.mutable._
    * scala> val D = ArrayBuffer[String]()
    * D: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer()
    * scala> while(in.hasNext()) { var key = in.next().replaceAll("""[\p{Punct}]""", ""); D.append(key) }
    * scala> val E = ArrayBuffer[Int]()
    * E: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
    * scala> for( elem <- D ) E.append(D.count(el => el == elem))
    * scala> val F = D.zip(E)
    * F: scala.collection.mutable.ArrayBuffer[(String, Int)] = ArrayBuffer((Lorem,2), (ipsum,29), (dolor,26), (sit,67), (amet,67), (consectetur,28), (adipiscing,2), (eli
    * t,38), (Praesent,20), (in,60), (mattis,18), (nisl,31), (eu,57), (vulputate,37), (lacus,34), (Curabitur,29), (luctus,21), (mollis,21), (odio,37), (Etiam,14), (elit,
    * 38), (urna,40), (consectetur,28), (sit,67), (amet,67), (sollicitudin,35), (a,63), (finibus,23), (eu,57), (mauris,38), (Sed,48), (fermentum,28), (rhoncus,25), (nequ
    * e,43), (blandit,26), (placerat,21), (Morbi,31), (nec,76), (euismod,27), (lorem,32), (Maecenas,17), (varius,26), (urna,40), (id,51), (urna,40), (venenatis,30), (vul
    * putate,37), (In,30), (at,68), (ex,27), (nec,76), (orci,35), (ornare,33), (luctus,21), (Sed,48), (luctus,21), (ante,38), (nec,76), (urna,40), (var...
    * scala> val result = scala.collection.immutable.SortedMap(F:_*)
    * result: scala.collection.immutable.SortedMap[String,Int] = Map(Aenean -> 19, Aliquam -> 20, Class -> 1, Cras -> 19, Curabitur -> 29, Curae -> 3, Donec -> 42, Duis ->
    *  15, Etiam -> 14, Fusce -> 27, In -> 30, Integer -> 20, Interdum -> 1, Lorem -> 2, Maecenas -> 17, Mauris -> 17, Morbi -> 31, Nam -> 23, Nulla -> 28, Nullam ->
    * 27, Nunc -> 15, Orci -> 1, Pellentesque -> 24, Phasellus -> 17, Praesent -> 20, Proin -> 16, Quisque -> 25, Sed -> 48, Suspendisse -> 19, Ut -> 21, Vestibulum -
    * > 27, Vivamus -> 21, a -> 63, ac -> 74, accumsan -> 24, ad -> 1, adipiscing -> 2, aliquam -> 28, aliquet -> 19, amet -> 67, ante -> 38, aptent -> 1, arcu -> 30,
    *  at -> 68, auctor -> 21, augue -> 39, bibendum -> 16, blandit -> 26, commodo -> 29, condimentum -> 17, congue -> 24, consectetur -> 28, consequat -> 26, conu...
    */

  /**
    * Exercise 5
    *
    * scala> import java.io.File
    * import java.io.File
    * scala> import java.util.Scanner
    * import java.util.Scanner
    * scala> val path = new File("./src/main/scala/text.txt")
    * path: java.io.File = .\src\main\scala\text.txt
    * scala> val in = new Scanner(path)
    * in: java.util.Scanner = java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0][match valid=false][need input=false][source closed=false][skipped=false][grou
    * p separator=\.][decimal separator=\,][positive prefix=][negative prefix=\Q-\E][positive suffix=][negative suffix=][NaN string=\Q?\E][infinity string=\Q?\E]
    * scala> import scala.collection.mutable._
    * import scala.collection.mutable._
    * scala> val D = ArrayBuffer[String]()
    * D: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer()
    * scala> while(in.hasNext()) { var key = in.next().replaceAll("""[\p{Punct}]""", ""); D.append(key) }
    * scala> val E = ArrayBuffer[Int]()
    * E: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
    * scala> for( elem <- D ) E.append(D.count(el => el == elem))
    * scala> val F = D.zip(E)
    * F: scala.collection.mutable.ArrayBuffer[(String, Int)] = ArrayBuffer((Lorem,2), (ipsum,29), (dolor,26), (sit,67), (amet,67), (consectetur,28), (adipiscing,2), (eli
    * t,38), (Praesent,20), (in,60), (mattis,18), (nisl,31), (eu,57), (vulputate,37), (lacus,34), (Curabitur,29), (luctus,21), (mollis,21), (odio,37), (Etiam,14), (elit,
    * 38), (urna,40), (consectetur,28), (sit,67), (amet,67), (sollicitudin,35), (a,63), (finibus,23), (eu,57), (mauris,38), (Sed,48), (fermentum,28), (rhoncus,25), (nequ
    * e,43), (blandit,26), (placerat,21), (Morbi,31), (nec,76), (euismod,27), (lorem,32), (Maecenas,17), (varius,26), (urna,40), (id,51), (urna,40), (venenatis,30), (vul
    * putate,37), (In,30), (at,68), (ex,27), (nec,76), (orci,35), (ornare,33), (luctus,21), (Sed,48), (luctus,21), (ante,38), (nec,76), (urna,40), (var...
    * scala> val result = scala.collection.immutable.TreeMap(F:_*)
    * result: scala.collection.immutable.TreeMap[String,Int] = Map(Aenean -> 19, Aliquam -> 20, Class -> 1, Cras -> 19, Curabitur -> 29, Curae -> 3, Donec -> 42, Duis -> 1
    * 5, Etiam -> 14, Fusce -> 27, In -> 30, Integer -> 20, Interdum -> 1, Lorem -> 2, Maecenas -> 17, Mauris -> 17, Morbi -> 31, Nam -> 23, Nulla -> 28, Nullam -> 27
    * , Nunc -> 15, Orci -> 1, Pellentesque -> 24, Phasellus -> 17, Praesent -> 20, Proin -> 16, Quisque -> 25, Sed -> 48, Suspendisse -> 19, Ut -> 21, Vestibulum ->
    * 27, Vivamus -> 21, a -> 63, ac -> 74, accumsan -> 24, ad -> 1, adipiscing -> 2, aliquam -> 28, aliquet -> 19, amet -> 67, ante -> 38, aptent -> 1, arcu -> 30, a
    * t -> 68, auctor -> 21, augue -> 39, bibendum -> 16, blandit -> 26, commodo -> 29, condimentum -> 17, congue -> 24, consectetur -> 28, consequat -> 26, conubi...
    */

  /**
    * Exercise 6
    *
    * scala> import java.util.Calendar
    * import java.util.Calendar
    * scala> val days = new scala.collection.mutable.LinkedHashMap[String, Int]
    * days: scala.collection.mutable.LinkedHashMap[String,Int] = Map()
    * scala> days("Monday") = Calendar.MONDAY
    * scala> days("Tuesday") = Calendar.TUESDAY
    * scala> days("Wednesday") = Calendar.WEDNESDAY
    * scala> days("Thursday") = Calendar.THURSDAY
    * scala> days("Friday") = Calendar.FRIDAY
    * scala> days("Saturday") = Calendar.SATURDAY
    * scala> days("Sunday") = Calendar.SUNDAY
    * scala> days
    * res0: scala.collection.mutable.LinkedHashMap[String,Int] = Map(Monday -> 2, Tuesday -> 3, Wednesday -> 4, Thursday -> 5, Friday -> 6, Saturday -> 7, Sunday -> 1)
    */

  /**
    * Exercise 7
    *
    * val x = Array("java.runtime.name", "sun.boot.library.path", "java.vm.version", "java.vm.vendor", "java.vendor.url", "path.separator", "java.vm.name")
    * x: Array[String] = Array(java.runtime.name, sun.boot.library.path, java.vm.version, java.vm.vendor, java.vendor.url, path.separator, java.vm.name)
    * val y = Array("Java(TM) SE Runtime Environment", "/home/apps/jdk1.6.0_21/jre/lib/i386", "17.0-b16", "Sun Microsystems Inc.", "htpp://java.sun.com/", ":", "Java HotSpot(TM) Server VM")
    * y: Array[String] = Array(Java(TM) SE Runtime Environment, /home/apps/jdk1.6.0_21/jre/lib/i386, 17.0-b16, Sun Microsystems Inc., htpp://java.sun.com/, :, Java Ho
    * tSpot(TM) Server VM)
    * scala> var constant: Int = x.map(_.size).max + 10
    * constant: Int = 31
    * scala> val z = x.map(elem => elem + " " * (constant - elem.size))
    * z: Array[String] = Array("java.runtime.name              ", "sun.boot.library.path          ", "java.vm.version                ", "java.vm.vendor
    *   ", "java.vendor.url                ", "path.separator                 ", "java.vm.name                   ")
    * scala> val pairs = z.zip(y)
    * pairs: Array[(String, String)] = Array(("java.runtime.name              ",Java(TM) SE Runtime Environment), ("sun.boot.library.path          ",/home/apps/jdk1.6
    * .0_21/jre/lib/i386), ("java.vm.version                ",17.0-b16), ("java.vm.vendor                 ",Sun Microsystems Inc.), ("java.vendor.url                "
    * ,htpp://java.sun.com/), ("path.separator                 ",:), ("java.vm.name                   ",Java HotSpot(TM) Server VM))
    * scala> for((s, n) <- pairs) println(s + "| " + n)
    * java.runtime.name              | Java(TM) SE Runtime Environment
    * sun.boot.library.path          | /home/apps/jdk1.6.0_21/jre/lib/i386
    * java.vm.version                | 17.0-b16
    * java.vm.vendor                 | Sun Microsystems Inc.
    * java.vendor.url                | htpp://java.sun.com/
    * path.separator                 | :
    * java.vm.name                   | Java HotSpot(TM) Server VM

    */

  /**
    * Exercise 8
    *
    * scala> def minmax(values: Array[Int]): Tuple2[Int, Int] = {(values.min, values.max)}
    * minmax: (values: Array[Int])(Int, Int)
    * scala> minmax(Array(0,1,2,3,4,5))
    * res0: (Int, Int) = (0,5)
    */

  /**
    * Exercise 9
    *
    * scala> def lteqgt(values: Array[Int], v: Int): Tuple3[Int, Int, Int] = {(values.count(elem => elem < v), values.count(elem => elem == v), values.count(elem => elem > v))}
    * lteqgt: (values: Array[Int], v: Int)(Int, Int, Int)
    * scala> lteqgt(Array(0, 1, 2, 3, 4, 5), 3)
    * res0: (Int, Int, Int) = (3,1,2)
    */

  /**
    * Exercise 10
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
