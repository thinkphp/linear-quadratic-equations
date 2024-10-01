object Main {
  def main(args: Array[String]): Unit = {
    val a = 2.0  // coeficientul lui x
    val b = -4.0 // termenul liber

    if (a == 0) {
      if (b == 0) {
        println("Soluții infinite (orice x este soluție).")
      } else {
        println("Nu există soluție.")
      }
    } else {
      val x = -b / a
      println(s"Soluția ecuației $a x + $b = 0 este x = $x")
    }
  }
}
