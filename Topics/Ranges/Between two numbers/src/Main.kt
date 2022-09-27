fun main() {
    val input1 = readln().toInt()
    val input2 = readln().toInt()
    val input3 = readln().toInt()

    if (input1 in input2..input3) {
        println("true")
    } else {
        println("false")
    }
}