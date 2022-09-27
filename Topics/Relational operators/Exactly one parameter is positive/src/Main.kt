fun main() {
    val input1 = readln().toInt()
    val input2 = readln().toInt()
    val input3 = readln().toInt()
    var counter = 0
    val array = arrayOf(input1, input2, input3)
    for (i in array) {
        if (i> 0) {
            counter++
        }
    }
    if (counter == 1) {
        println(true)
    } else {
        println(false)
    }
}
