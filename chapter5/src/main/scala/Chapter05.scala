/**
  * Created by User on 27.12.2018.
  */


import scala.beans.BeanProperty


object Chapter05 {

  def main(args: Array[String]): Unit = {

    // Exercise 1
    val one: Counter = new Counter
    one.increment()
    println(one.current)
    // for(i <- 0 to Int.MaxValue) one.increment() // This throws exception if uncommented

    // Exercise 2
    val myAccount = new BankAccount
    myAccount.deposit(950.0)
    myAccount.withdraw(50.0)
    println(myAccount.current)

    // Exercise 3
    val myTime = new Time(2)
    val yourTime = new Time(2, 56)
    println(myTime.before(yourTime))
    println(yourTime.before(myTime))
    println(yourTime.current)
    // val newTime = new Time(25) // This throws exception if uncommented
    // val anotherTime = new Time(2, 70) // This throws exception if uncommented
    
    // Exercise 4
    val myTime1 = new Time1(2)
    val yourTime1 = new Time1(2, 56)
    println(myTime1.before(yourTime1))
    println(yourTime1.before(myTime1))
    println(yourTime1.current)
    // val newTime1 = new Time1(25) // This throws exception if uncommented
    // val anotherTime1 = new Time1(2, 70) // This throws exception if uncommented

    // Exercise 5
    val myStudent = new Student
    myStudent.setName("Bo LI")
    myStudent.setId(421596)
    println( "My student %s has q-number id %d.".format(myStudent.getName, myStudent.getId))
    // scala get set and get set java type for each field
    // Yes one can call javaBeans getters and setters, and one should.

    // Exercise 6
    val fred: Person = new Person(21)
    val valery: Person = new Person(-21)
    println(fred.age)
    println(valery.age)

    // Exercise 7
    val myFavStudent = new Person1("Bo LI")
    println(myFavStudent.getFirstName)
    println(myFavStudent.getLastName)

    // Exercise 8
    val myCar = new Car("VW", "Sharan")
    val yourCar = new Car("BMW", "G20", 1920)
    val theirCar = new Car("VW", "Sharan", 1920, "GH34567")
    myCar.setLicensePlate("GH34587")
    println(myCar.getManufacturer)
    println(myCar.getModelName)
    println(myCar.getModelYear)
    println(myCar.getLicensePlate)

    // Exercise 9

    // Exercise 10


  }

  /**
    * Exercise 1
    */

  class Counter {

    // Property
    private var value = 0

    // Methods
    def increment(): Unit = {
      if (value == Int.MaxValue) {
        throw new IllegalStateException("counter cannot be incremented anymore")
      } else {
        value += 1
      }
    }
    def current = value
  }

  /**
    * Exercise 2
    */

  class BankAccount {

    // Property
    private var balance: Double = 0.0

    // Methods
    def current = balance
    def deposit(amount: Double): Unit = { balance += amount }
    def withdraw(amount: Double): Unit = { balance -= amount }
  }

  /**
    * Exercise 3
    */

  class Time {

    // Property
    private var hours: Int = 0
    private var minutes: Int = 0

    // Constructors
    def this(hours: Int) {
      this()
      this.hours = if( hours >= 0 & hours < 24 ) hours else throw new IllegalStateException("Hours should be between 0 and 23")
    }

    def this(hours: Int, minutes: Int) {
      this(hours)
      this.minutes = if( minutes >= 0 & minutes < 60 ) minutes else throw new IllegalStateException("Minutes should be between 0 and 59")
    }

    // Methods
    def current: String = hours + ":" + minutes
    def before(other: Time): Boolean = { (60 * hours + minutes) < (60 * other.hours + other.minutes) }
  }

  /**
    * Exercise 4
    */

  class Time1 {

    // Property
    private var hours: Int = 0
    private var minutes: Int = 0

    // Constructors
    def this(hours: Int) {
      this()
      this.hours = if( hours >= 0 & hours < 24 ) hours else throw new IllegalStateException("Hours should be between 0 and 23")
      this.minutes = this.hours * 60
    }

    def this(hours: Int, minutes: Int) {
      this(hours)
      this.minutes = if( minutes >= 0 & minutes < 60 ) (this.minutes + minutes) else throw new IllegalStateException("Minutes should be between 0 and 59")
    }

    // Methods
    def current: String = minutes + " minutes since midnight"
    def before(other: Time1): Boolean = { minutes < other.minutes }
  }

  /**
    * Exercise 5
    */

  class Student {

    // Property
    @BeanProperty var name: String = ""
    @BeanProperty var id: Long = 0
  }

  /**
    * Exercise 6
    */

  class Person(var age: Int) {
    if(age < 0) age = 0
  }

  /**
    * Exercise 7
    */

  class Person1(var fullname: String) {

    // Properties
    private var firstName: String = fullname.split(" ")(0)
    private var lastName: String = fullname.split(" ")(1)

    // Methods
    def getFirstName = firstName
    def getLastName = lastName
  }

  /**
    * Exercise 8
    */
  class Car(private var manufacturer: String,
            private var modelName: String,
            private var modelYear: Int = -1,
            @BeanProperty var licensePlate: String = "") {

    // Methods
    def getManufacturer = manufacturer
    def getModelName = modelName
    def getModelYear = modelYear

  }

  /**
    * Exercise 9
    */

  /**
    * Exercise 10
    */

  class Employee10 {
    val name: String = "John Q. Public"  // No need to change name
    var salary: Double = 0.0  // Salary changes all the time
  }

}
