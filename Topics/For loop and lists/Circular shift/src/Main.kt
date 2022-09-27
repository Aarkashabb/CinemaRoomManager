import java.util.*

fun main() {
    val numberOfrepeats = readln().toInt()
    val array = mutableListOf<Int>()
    repeat(numberOfrepeats) {
        val scanner = readln().toInt()
        array.add(scanner)
    }

    Collections.rotate(array, 1)
    println(array.joinToString(" "))
    // write your code here
}
