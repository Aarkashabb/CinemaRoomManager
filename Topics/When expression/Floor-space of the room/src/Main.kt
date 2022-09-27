import kotlin.math.sqrt

fun main() {
    when (readln()) {
        "triangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val c = readln().toDouble()
            var area = 0.25 * sqrt((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c))
            println(area)
        }

        "rectangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            var result = a * b
            println(result)
        }

        "circle" -> {
            val r = readln().toDouble()
            val result = (r * r) * 3.14
            println(result)
        }
    }
}
