fun main() {
    val inputFirst: Char = readln().first().lowercaseChar()
    val inputSecond: Char = readln().first().lowercaseChar()
    val inputThird: Char = readln().first().lowercaseChar()

    if (inputFirst+1==inputSecond && inputSecond+1==inputThird) {
        println("true")
    } else {
        println("false")
    }

}