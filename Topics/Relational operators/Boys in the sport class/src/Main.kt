fun main() {
    val boy1 = readln().toInt()
    val boy2 = readln().toInt()
    val boy3 = readln().toInt()
    if (boy2 in boy3..boy1 || boy2 in boy1..boy3) {
        println(true)
    } else {
        println(false)
    }
}
