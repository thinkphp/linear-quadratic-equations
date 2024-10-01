import scala.io.StdIn._
import math.sqrt

object QuadraticEquation {
  def main(args: Array[String]): Unit = {
    println("Enter coefficient a:")
    val a = readDouble()

    println("Enter coefficient b:")
    val b = readDouble()

    println("Enter coefficient c:")
    val c = readDouble()

    val discriminant = b * b - 4 * a * c

    if (discriminant > 0) {
      // Two distinct real roots
      val root1 = (-b + sqrt(discriminant)) / (2 * a)
      val root2 = (-b - sqrt(discriminant)) / (2 * a)
      println(s"The roots are: $root1 and $root2")
    } else if (discriminant == 0) {
      // One real root (repeated)
      val root = -b / (2 * a)
      println(s"The root is: $root")
    } else {
      // No real roots
      val realPart = -b / (2 * a)
      val imaginaryPart = sqrt(-discriminant) / (2 * a)
      println(s"The roots are complex: $realPart + ${imaginaryPart}i and $realPart - ${imaginaryPart}i")
    }
  }
}
