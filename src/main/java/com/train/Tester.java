package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tickets = 0;

        while (tickets != -1) {
            System.out.println("Please enter number of tickets or enter -1 to exit.");
            tickets = scanner.nextInt();

            if (tickets > 0) {
                System.out.println("How many round-trip tickets: ");
                int roundTripCount = scanner.nextInt();

                if (roundTripCount >= 0 && tickets >= roundTripCount) {
                    Ticket ticket = new Ticket(tickets, roundTripCount);
                    ticket.printTotalMoney();
                } else {
                    System.out.println("Please check the tickets number & round-trip count again.");
                }

            } else {
                System.out.println("Goodbye!");
            }
        }
    }
}
