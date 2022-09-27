fun main() {
    val inputOne = readln().toInt()
    val inputTwo = readln().toInt()

    for (it in inputOne..inputTwo) {

        if (it % 3 == 0 && it % 5 == 0) {
            println("FizzBuzz")
        } else if (it % 3 == 0 && it % 5 != 0) {
            println("Fizz")
        } else if (it % 3 != 0 && it % 5 == 0) {
            println("Buzz")
        } else {
            println(it)
        }
    }
}