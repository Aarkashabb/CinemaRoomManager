fun pepTalk(name: String): String {
    val array = name.split(" ").toTypedArray()
    val firstName = array[0]
    val secondName = array[1]
    return "Don't lose the towel, traveler $firstName $secondName!"
}
// do not change the function above        

fun main() {
    val name = readLine()!!
    try {
        val advice = pepTalk(name) // fix this function call
        println("Good luck!")
        print(advice)
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Good luck!")
        println("Don't lose the towel, nameless one.")

    }
}