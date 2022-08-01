import scala.io.StdIn.readInt

object Question2 {

    def checker(num: Int): Unit = num match {

      case num if num <= 0 => println("Negative/Zero")
      case num if num % 2 == 0 => println("Even Number")
      case num if num % 2 == 1 => println("Odd Number")

    }

    def main(args: Array[String]): Unit ={

      print("Enter Number : ")
      val Number = readInt()
      checker(Number)

    }

}
