import java.util.*

fun main() {
    val numberRepeats = readln().toInt()
    val array = mutableListOf<Int>()
    repeat(numberRepeats) {
        val scanner = readln().toInt()
        array.add(scanner)
    }
    val distance = readln().toInt()

    Collections.rotate(array, distance)
    println(array.joinToString(" "))
    // write your code here
}
