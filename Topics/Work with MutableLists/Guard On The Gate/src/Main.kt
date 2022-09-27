fun main() {
    val backToTheWall = readLine()!!.split(", ").map { it }.toMutableList()
    val returnedWatchman = readLine()!!
    // do not touch the lines above
    // write your code here   
    backToTheWall.add(returnedWatchman)
    println(backToTheWall.joinToString(", "))
}