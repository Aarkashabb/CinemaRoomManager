fun main() {    
    val inputA = readln().toInt()
    val inputB = readln().toInt()
    val inputH = readln().toInt()
    // если между AB - Normal
    // если >B - Excess
    // если <A - Deficiency

    if (inputH >= inputA && inputH <= inputB) {
        println("Normal")
    } else if (inputH > inputB) {
        println("Excess")
    } else println("Deficiency")
}
