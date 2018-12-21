package com.train


fun main(args: Array<String>) {

    var tickets = 0
    var roundTripCount = 0

    while (tickets != -1) {

        println("Please enter number of tickets or enter -1 to exit.")
        tickets = readLine()!!.toInt()

        if (tickets > 0){
            println("How many round-trip tickets: ")
            roundTripCount = readLine()!!.toInt()

            if (roundTripCount >= 0 && tickets >= roundTripCount) {
                val ticket = TicketKotlin(tickets, roundTripCount)
                ticket.printTotalMoney()
            } else {
                println("Please check the tickets number & round-trip count again.")
            }
        } else {
            println("Goodbye!")
        }
    }

}


class TicketKotlin(var tickets: Int, var roundTripCount: Int, var oneWayCount: Int = 0) {

    val discount = 0.9
    val oneWayPrice: Int = 1000  // 單程票價
    val roundTripPrice: Int = (2000 * discount).toInt() // 來回票價

    init {
        oneWayCount = tickets - roundTripCount  // 計算單程票
    }

    fun printTotalMoney() {
        val totalOneWayPrice = oneWayCount * oneWayPrice
        val totalRoundTripPrice = roundTripCount * roundTripPrice
        val sum = totalOneWayPrice + totalRoundTripPrice
        println("Kotlin Total Tickets: $tickets")
        println("Round-trip: $roundTripCount")
        println("Total: $sum")
    }


}