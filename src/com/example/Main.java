package com.example;

public class Main {

    public static void main(String[] args) {
        Theater theater = new Theater("Banjo", 10, 10);
        theater.reserveSeat("J10");

        Theater theater = new Theater("Banjo", 8, 13);
        if(theater.reserveSeat("B13")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

    }
}
