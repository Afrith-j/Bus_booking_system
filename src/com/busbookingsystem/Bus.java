package com.busbookingsystem;

public class Bus {
    private int busNo;
    private String from;
    private String to;
    private int totalSeats;
    private int availableSeats;
    private double fare;

    public Bus(int busNo, String from, String to, int totalSeats, double fare) {
        this.busNo = busNo;
        this.from = from;
        this.to = to;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.fare = fare;
    }

    public int getBusNo() {
        return busNo;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public double getFare() {
        return fare;
    }

    public void bookSeat() {
        availableSeats--;
    }

    public void displayBus() {
        System.out.println("Bus No: " + busNo);
        System.out.println("Route: " + from + " to " + to);
        System.out.println("Available Seats: " + availableSeats);
        System.out.println("Fare: ₹" + fare);
        System.out.println("-------------------------");
    }
}