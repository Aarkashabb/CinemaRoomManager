fun main() {
    val array = mutableListOf<Int>()
    repeat(3) {
        val inputOne = readln().toInt()
        array.add(inputOne)
    }
    var result = false
    val arraySum = array.sum() - 20 // delete "-20" for second solution

    println(array.any { it == arraySum })



/*    for ( i in array){
        if (arraySum-i==20){
            result=true
            break
        }

    }
    println(result)*/
}



