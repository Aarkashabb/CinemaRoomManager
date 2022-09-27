import java.util.*

fun main() {
    val array = mutableListOf<Int>()
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        val next = scanner.next().toInt()
        array.add(next)
    }
    var max = array[0]
    var indexMax = 1
    for (i in array.indices) {
        if (array[i] > max) {
            max = array[i]
            indexMax = i + 1
        }
    }

    println("$max $indexMax")

}
