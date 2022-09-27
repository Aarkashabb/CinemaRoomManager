fun main() {
    val inputFirst: Char = readln().first().lowercaseChar()
    val inputSecond: Char = readln().first().lowercaseChar()
    if (inputFirst == inputSecond) {
        println("true")
    } else {
        println("false")
    }
}
