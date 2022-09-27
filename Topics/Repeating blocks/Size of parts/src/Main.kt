fun main() {
    val n = readln().toInt()
    var larger = 0
    var smaller = 0
    var perfect = 0

    repeat(n) {
        val detail = readln().toInt()

        if (detail == 1) {
            larger++
        }
        if (detail == -1) {
            smaller++
        }
        if (detail == 0) {
            perfect++
        }

    }
    println("$perfect $larger $smaller")
}
