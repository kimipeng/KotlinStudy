package com.train;

public class Ticket {

    final double discount = 0.9;
    final int oneWayPrice = 1000; // 單程票價
    final int roundTripPrice = (int) (2000 * discount);     // 來回票價打九折

    private int tickets;
    private int oneWayCount;
    private int roundTripCount;

    public Ticket(int tickets, int roundTripCount) {
        this.tickets = tickets;
        this.roundTripCount = roundTripCount;
        this.oneWayCount = tickets - roundTripCount; //計算單程票幾張
    }

    public void printTotalMoney(){

        int totalOneWayPrice = oneWayCount * oneWayPrice;           // 計算單程票總價
        int totalRoundTripPrice = roundTripCount * roundTripPrice;  // 計算來回票總價
        int sum = totalOneWayPrice + totalRoundTripPrice;           // 全部總價

        System.out.println("Total tickets: " + tickets);
        System.out.println("Round-trip: " + roundTripCount);
        System.out.println("Total: " + sum);
    }
}
