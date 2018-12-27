/**
  * Created by User on 27.12.2018.
  */
class Person {
  // Property
  private var originalAge = 0
  var sexe = "male"  // Automatic getter and setter
  val hairColor = "black" // Automatic getter only
  private val religion = "Orthodox" // getter and setter are private

  def age = originalAge // Getter (exists by default when craeting class)
  def age_=(newAge: Int) {
    if (newAge > originalAge) originalAge = newAge;
  } // Complex setter (exists by default when craeting class)
}
