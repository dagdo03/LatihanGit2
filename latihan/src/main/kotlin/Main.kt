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

class Square(private val side: Double){
    fun wideSquare(){
        println("Wide is : ${side * side}")
    }
    fun getSide(): Double {
        return side
    }

    fun perimeterSquareCalculate(): Double { //method to calculate perimeter of square
        return 4 * side
    }

    fun printHeaderSquare(){ //method to print header of square
        println("Perhitungan Persegi")
        println("-------------------------------------")
    }
}
fun main(args: Array<String>) {
    val radius = 42.0
    val circle = Circle(radius)
    val side = 20.0
    val square = Square(side)
    circle.printHeaderCircle()
    println("Jari-jari lingkaran adalah ${circle.getRadius()}")
    println("Luas lingkaran dengan jari-jari yaitu $radius adalah ${circle.areaCircleCalculate()}")
    println("Keliling lingkaran dengan jari-jari yaitu $radius adalah ${circle.circumferenceCircleCalculate()}")
    Triangle().circumferenceTriangle(3.0, 4.0, 5.0)
    Triangle().wideTriangle(4.0, 3.0)
    Square(side).wideSquare()
    square.printHeaderSquare()
    println("Panjang sisi persegi adalah ${square.getSide()}")
    println("Keliling persegi dengan panjang sisi yaitu $side adalah ${square.perimeterSquareCalculate()}")

    square.printHeaderSquare()
    println("Panjang sisi persegi adalah ${square.getSide()}")
    println("Keliling persegi dengan panjang sisi yaitu $side adalah ${square.perimeterSquareCalculate()}")

}