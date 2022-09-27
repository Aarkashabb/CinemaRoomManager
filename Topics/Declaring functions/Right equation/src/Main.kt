// write your code here
fun isRightEquation(a: Int, b: Int, c: Int): Boolean {
    var result = false
    if (a * b == c) {
        result = true
    }

    return result
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    println(isRightEquation(a, b, c))
}