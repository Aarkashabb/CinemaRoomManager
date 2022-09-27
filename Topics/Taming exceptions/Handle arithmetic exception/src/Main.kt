fun main() {
    val input1 = readln().toInt()
    val input2 = readln().toInt()
    if (input2 == 0) {
        println("Division by zero, please fix the second argument!")
        return
    }
    var result = input1 / input2
    println(result)
}