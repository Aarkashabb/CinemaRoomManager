fun main() {
    val inputFirst: Char = readln().first()
    val inputSecond: Char = readln().first()
    val inputThird: Char = readln().first()
    val inputFourth: Char = readln().first()
    val array = arrayOf(inputFirst, inputSecond, inputThird, inputFourth)

    for (i in array) {
        if (i.isDigit()) {
            println("true")
        } else {
            println("false")
        }
    }


}