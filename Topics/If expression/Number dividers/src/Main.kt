fun main() {
    val array = arrayOf(2, 3, 5, 6)
    val input = readln().toInt()

    for (div in array) {
        if (input % div == 0) {
            println("Divided by $div")
        }
    }
}