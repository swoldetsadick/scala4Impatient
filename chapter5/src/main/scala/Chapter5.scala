/**
  * Created by User on 27.12.2018.
  */

import scala.beans.BeanProperty

object Chapter5 {

  def main(args: Array[String]): Unit = {

    println("Hello, world!")

    val myCounter: Counter = new Counter //
    myCounter.increment() // Use parenthesis for mutators
    println(myCounter.current) // Don't use parenthesis for accessors

    val fred: Person = new Person()
    fred.age = 21 // Calls the fred.age_=(21) method
    println(fred.age) // Calls the method fred.age()
    fred.age = 15 // Can fred get younger?
    println(fred.age) // No he can't
    fred.age = 22 // Can fred get older?
    println(fred.age) // yes he can

    // Default set and get
    fred.sexe = "female"
    println(fred.sexe)
    // fred.hairColor = "brown" doesn't work
    println(fred.hairColor) // works
    // religion cannot be accessed outside the scope of class Person

    val myOtherCounter: Counter = new Counter
    println(myCounter.isLess(myOtherCounter))
    myOtherCounter.increment()
    myOtherCounter.increment()
    println(myCounter.isLess(myOtherCounter))

    val tona = new Wife
    println(tona.getLevel)
    tona.setLevel("unmatchable 10")
    println(tona.getLevel)
    tona.level = "wow"
    println(tona.level)
  }

  class Counter {
    // Property
    private var value = 0 // You must initialize the field
    // val never changes so read only
    // private var cannot be changed directely by setter but some other method
    private[this] var deeperValue = 0 // Cannot be accessed even from another object of same class with [this] object-private

    // Methods
    def increment() { value += 1 } // Methods are public by default
    def current = value // No () in declaration

    def isLess(other: Counter) = value < other.value  // Can access private field of other object
  }

  class Wife {
    @BeanProperty var level: String = "smoking hot"
  }

}
