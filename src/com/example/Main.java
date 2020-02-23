package com.example;

public class Main {

    public static void main(String[] args) {
        Theater theater = new Theater("Banjo", 10, 10);
        theater.reserveSeat("J10");
        theater.cancelReservation("J10");
    }
}
