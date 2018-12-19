package com.train

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets: ")
    var tickets = scanner.nextInt()
    println("How many round-trip tickets: ")
    var roundTripCount = scanner.nextInt()

    if (tickets > 0 && roundTripCount >= 0 && tickets >= roundTripCount) {
        val ticket = TicketKotlin(tickets, roundTripCount)
        ticket.printTotalMoney()
    } else {
        println("Please check the tickets number & round-trip count again.")
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