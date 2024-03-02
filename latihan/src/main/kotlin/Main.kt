import kotlin.math.PI

class Circle(private val radius: Double) {

    fun getRadius(): Double {
        return radius
    }

    fun areaCircleCalculate(): Double { //method to calculate area of circle
        return PI * radius * radius
    }

    fun circumferenceCircleCalculate(): Double { //method to calculate circumference of circle
        return 2 * PI * radius
    }

    fun printHeaderCircle(){ //method to print header of circle
        println("Perhitungan Lingkaran")
        println("-------------------------------------")
    }
}
class Triangle(){
    fun wideTriangle(height: Double, base: Double){
        println("Wide is : ${(height * base)/2}")
    }
    fun circumferenceTriangle(a: Double, b: Double, c: Double){
        println("Wide is : ${a + b + c}")
    }
}

class Square(){
    fun wideSquare(long: Double){
        println("Wide is : ${long * long}")
    }
}
fun main(args: Array<String>) {
    val radius = 42.0
    val circle = Circle(radius)
    circle.printHeaderCircle()
    println("Jari-jari lingkaran adalah ${circle.getRadius()}")
    println("Luas lingkaran dengan jari-jari yaitu $radius adalah ${circle.areaCircleCalculate()}")
    println("Keliling lingkaran dengan jari-jari yaitu $radius adalah ${circle.circumferenceCircleCalculate()}")
    Triangle().circumferenceTriangle(3.0, 4.0, 5.0)
    Triangle().wideTriangle(4.0, 3.0)
    Square().wideSquare(5.0)
}