package cinema

import java.util.*

//var tickets: List<MutableList<Char>> = emptyList<MutableList<Char>>()
var tickets: MutableList<MutableList<Char>>? = null
var currentTotal = 0

fun cinema() {
    println()
    println("Cinema:")
    print("  ")
    for (s in 1..tickets!![0].size) {
        print("$s ")
    }
    println()

    var tempRow = 1
    for (i in tickets!!) {
        print("$tempRow ")
        if (i != null) {
            for (col in i) {
                print("$col ")
            }
            tempRow++
        }
        println()
    }
    println()
    menu()

}

//Buying tickets

fun buyTicket() {
    println()
    println("Enter a row number:")
    print("> ")
    val clientRow = readln().toInt()
    println("Enter a seat number in that row:")
    print("> ")
    val clientSeat = readln().toInt()
    try {
        if (tickets!![clientRow - 1][clientSeat - 1] == 'B') {
            println()
            println("That ticket has already been purchased!")
            buyTicket()
        } else {
            tickets!![clientRow - 1][clientSeat - 1] = 'B'
            val totalSeats = tickets!!.size * tickets!![0].size

            if (totalSeats <= 60) {
                currentTotal += 10
                println("Ticket price: $10")
            } else {
                if (clientRow <= tickets!!.size / 2) {
                    currentTotal += 10
                    println()
                    println("Ticket price: $10")
                } else {
                    currentTotal += 8
                    println()
                    println("Ticket price: $8")
                }
            }
        }
    } catch (e: Exception) {
        println()
        println("Wrong input!")
        buyTicket()
    }
    println()
    menu()

}

// Showing Main Menu

fun menu() {
    println("1. Show the seats")
    println("2. Buy a ticket")
    println("3. Statistics")
    println("0. Exit")
    print("> ")
    var menuNumber = readln().toInt()
    when (menuNumber) {
        1 -> cinema()
        2 -> buyTicket()
        3 -> statistics(tickets)
        0 -> return
        else -> println("Choose from the menus number")
    }
}

// Statistics

fun statistics(tickets: MutableList<MutableList<Char>>?) {
    println()
    println("Number of purchased tickets: ${purchasedTickets(tickets)}")
    println("Percentage: ${percentage(tickets)}%")
    println("Current income: $${currentTotal}")
    println("Total income: $${totalIncome(tickets)}")
    println()
    menu()
}

fun purchasedTickets(tickets: MutableList<MutableList<Char>>?): Int {
    var counter = 0
    for (i in tickets!!.indices) {
        for (y in tickets[i]) {
            if (y == 'B') {
                counter++
            }
        }
    }
    return counter
}

fun percentage(tickets: MutableList<MutableList<Char>>?): String? {
    val percent: Double
    val totalSeats = tickets?.size?.times(tickets[0]?.size)?.toDouble()
    val soldSeats = purchasedTickets(tickets).toDouble()
    percent = soldSeats / totalSeats!! * 100
    val formatPercentage = String.format(locale = Locale.ENGLISH, format = "%.2f", percent.toFloat())
    return formatPercentage
}

fun totalIncome(tickets: MutableList<MutableList<Char>>?): Int {
    val row = tickets!!.size
    val seats = tickets!![0].size
    val totalseats = row * seats
    var totalIncome = 0
    if (totalseats <= 60) {
        totalIncome = totalseats * 10
    } else {
        val seatsPer10 = row / 2 * seats * 10
        val seatsPer8 = (row - (row / 2)) * seats * 8
        totalIncome = seatsPer10 + seatsPer8
    }
    return totalIncome
}

fun main() {

// Start creating the Cinema

    println("Enter the number of rows:")
    print("> ")
    val inputRow = readln().toInt()
    println("Enter the number of seats in each row:")
    print("> ")
    val inputSeat = readln().toInt()

// moved to fun cinema
    tickets = MutableList(inputRow) {
        "S".repeat(inputSeat).toMutableList()
    }
    println()
    menu()
}





