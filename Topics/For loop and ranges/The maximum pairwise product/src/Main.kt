fun main() {
    val numberOfRepeats = readln().toInt()
    val array = mutableListOf(1)

    repeat(numberOfRepeats) {
        val scanner = readln().toInt()
        array.add(scanner)
    }

    array.sort()
    println(array[array.size - 1] * array[array.size - 2])
}


