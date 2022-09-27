fun main() {
    val input1 = readln().toInt()
    val input2 = readln().toInt()
    val input3 = readln().toInt()
    val input4 = readln().toInt()
    val input5 = readln().toInt()

    if (input5 in input1..input2 && input5 in input3..input4) {
        println("true")
    } else {
        println("false")
    }
}
