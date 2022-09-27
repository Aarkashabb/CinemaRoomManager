fun solution() {
    val input1 = readln().toInt()
    val input2 = readln().toInt()
    try {
        var result = input1 / input2
        println(result)
    } catch (e: NumberFormatException) {
        println(e.message)
    } catch (e: ArithmeticException) {
        println(e.message)
    } finally {
        println("This is the end, my friend.")
    }
}