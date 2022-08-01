object Question3 {

  def toUpper(text: String): String = text.toUpperCase()
  def toLower(text: String): String = text.toLowerCase()
  
  def formatNames(name: String)(fun: String => String)(index: Int*): String = {
    if(index.isEmpty){

      var temp = ""
      var i = 0
      while(i < name.length()){
        if(index.contains(i)) temp = temp+fun(name.charAt(i).toString)
        else temp = temp+name.charAt(i).toString
        i= i + 1
      }
      temp
    }
    else
    {
      fun(name)
    }

  }

  def main(args: Array[String]): Unit = {

    println(formatNames("Benny")(toUpper)())
    println(formatNames("Niroshan")(toUpper)(0,1))
    println(formatNames("Saman")(toLower)())
    println(formatNames("Kumara")(toUpper)(5))

  }

}
