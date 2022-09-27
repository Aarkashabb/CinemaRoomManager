fun main() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()
    if (num1 == num2 || num2 == num3 || num1 == num3) print("false") else print("true")     
}
