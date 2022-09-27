fun main() {
    val numbers = readln().toInt()
    val arrayOfNumbers = mutableListOf<Int>()
    repeat(numbers) {
        val input = readln().toInt()
        arrayOfNumbers.add(input)
    }

    var result = 0
    for (i in arrayOfNumbers.sorted()) {
        if (i % 4 == 0) {
            result = i
        }
    }
    println(result)
}