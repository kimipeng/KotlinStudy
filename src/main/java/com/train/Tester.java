package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickets: ");
        int tickets = scanner.nextInt();
        System.out.println("How many round-trip tickets: ");
        int roundTripCount = scanner.nextInt();

        if (tickets > 0 && roundTripCount >= 0 && tickets >= roundTripCount) {
            Ticket ticket = new Ticket(tickets, roundTripCount);
            ticket.printTotalMoney();
        } else {
            System.out.println("Please check the tickets number & round-trip count again.");
        }
    }
}
