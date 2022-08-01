object Q1 {
  def interest(deposit: Float) : Float = deposit match {

    case depositeAmnt if depositeAmnt <= 20000.00f => depositeAmnt * 0.02f
    case depositeAmnt if depositeAmnt <= 200000.00f => depositeAmnt * 0.04f
    case depositeAmnt if depositeAmnt <= 2000000.00f => depositeAmnt * 0.035f
    case depositeAmnt if depositeAmnt  > 2000000.00f => depositeAmnt * 0.065f

  }

  def main(args: Array[String]): Unit = {

    println(interest(20000))
    println(interest(200000))
    println(interest(2000000))
    println(interest(20000000))
  }



}
