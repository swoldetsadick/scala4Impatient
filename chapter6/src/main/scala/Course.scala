/**
  * Created by User on 28.12.2018.
  */
object Course {

  // Main
  def main(args: Array[String]): Unit = {

    println(Accounts.newUniqueNumber().toString)

  }

  object Accounts {
    private var lastNumber = 9
    def newUniqueNumber() = { lastNumber += 1; lastNumber }
  }

}
