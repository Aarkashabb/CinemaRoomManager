//fun main() {
//    val numberOfRepeats = readln().toInt()
//    val array = mutableListOf<Int>()
//    val arrayOfSizes = mutableListOf(0)
//    var counter = 1
//
//    repeat(numberOfRepeats) {
//        val scanner = readln().toInt()
//        array.add(scanner)
//    }
//
//    for (i in 0 until array.size - 1) {
//        if (array[i] <= array[i + 1]) {
//            counter++
//            arrayOfSizes.add(counter)
//
//
//        } else {
//            counter = 1
//            arrayOfSizes.add(counter)
//        }
//    }
//
//    println(arrayOfSizes.maxOf { it })
//
//}

fun main() {
    var length = 0
    var maxLength = 0
    var minNum = 0
    for (i in 1..readLine()!!.toInt()) {
        val num = readLine()!!.toInt()
        length = if (minNum <= num) length + 1 else 1
        maxLength = if (length > maxLength) length else maxLength
        minNum = num
    }
    println(maxLength)
}