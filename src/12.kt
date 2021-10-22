//exercise1
//data class Point(var x: Double, val y: Double)
//fun main() {
//    val point1 = Point(10.0,30.0)
//    println(point1.toString())
////exercise2
//    val point2 = Point(11.0,20.0)
//    val point3 = Point(11.0,20.0)
//    if (point2.equals(point3))
//        println("point2 is equal to point3")
//    else
//        println("point2 is not equal to point3")
////exercise3
//    val point4 = Point(12.0,14.0)
//    println("(${-point4.x},${-point4.y})")
////exercise4
//    val point5 = Point(10.0,12.0)
//    println(kotlin.math.sqrt(((point4.x - point5.x) * (point4.x - point5.x) + (point4.x - point5.y) * (point4.x - point5.y))))
//}

//დავალება2
fun main() {
    val f1: Fraction = Fraction()
    f1.numerator = 3.0
    f1.denominator = 4.0

    val f2: Fraction = Fraction()
    f2.numerator = 6.0
    f2.denominator = 8.0
    println(f1)
    println(f2)
    println(f1 == f2)
    //exercise3
    println((f1.numerator * f2.numerator) / (f1.denominator * f2.denominator))
    //exercise2
    if (f1.denominator == f2.denominator)
        println((f1.numerator + f2.numerator) / f1.denominator)
    if (f1.denominator != f2.denominator)
        println((f2.denominator*f1.numerator+f1.denominator*f2.numerator)/(f1.denominator*f2.denominator))
}

class Fraction {
    var numerator: Double = 0.0
    var denominator: Double = 0.0


    override fun toString(): String {
        return "$numerator/$denominator"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator)
                return true
        }
        return false
    }
}


