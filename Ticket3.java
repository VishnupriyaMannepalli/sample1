package com.TicketGeneration;

import java.util.*;

class Ticket {
    private String passengerName;
    private int seatNumber;
    private String destination;
    
    public Ticket(String passengerName, int seatNumber, String destination) {
        this.passengerName = passengerName;
        this.seatNumber = seatNumber;
        this.destination = destination;
    }
    
    public String getPassengerName() {
        return passengerName;
    }
    
    public int getSeatNumber() {
        return seatNumber;
    }
    
    public String getDestination() {
        return destination;
    }
}

public class Ticket3 {
    private TreeMap<Integer, Ticket> ticketMap;
    private int nextSeatNumber;

    public Ticket3() {
        ticketMap = new TreeMap<>();
        nextSeatNumber = 1;
    }
    
    public void generateTicket(String passengerName, String destination) {
        Ticket ticket = new Ticket(passengerName, nextSeatNumber, destination);
        ticketMap.put(nextSeatNumber, ticket);
        nextSeatNumber++;
        System.out.println("Ticket generated successfully for " + passengerName + ". Seat number: " + ticket.getSeatNumber() + ". Destination: " + destination);
    }
    
    public void displayAllTickets() {
        System.out.println("All Tickets:");
        for (Map.Entry<Integer, Ticket> entry : ticketMap.entrySet()) {
            Ticket ticket = entry.getValue();
            System.out.println("Seat number: " + ticket.getSeatNumber() + ", Passenger: " + ticket.getPassengerName() + ", Destination: " + ticket.getDestination());
        }
    }
    
    public static void main(String[] args) {
        Ticket3 ticketManager = new Ticket3();
        ticketManager.generateTicket("priya", "Nellore");
        ticketManager.generateTicket("bhavi", "Rajmundry");
        ticketManager.generateTicket("kavya", "Knr");
        
        ticketManager.displayAllTickets();
    }
}