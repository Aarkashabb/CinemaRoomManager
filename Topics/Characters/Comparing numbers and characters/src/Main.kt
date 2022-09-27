fun main() {
    val inputNumber = readln().toInt()
    val inputLetter: Char = readln().first()
    if (inputLetter.code==inputNumber){
        println("true")
    } else {
        println("false")
    }

}