fun main() {
    val input = mutableListOf<String>()
    repeat(5) {
        var words = readln()
        input.add(words)
    }
    println(input.joinToString(" "))
}

//fun main() {
//    val wordList = List(5) { readLine()!! }
//    println(wordList.joinToString(" "))
//}