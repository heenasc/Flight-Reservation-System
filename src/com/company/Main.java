package com.company;

public class Main {

    public static void main(String[] args) {
        Ticket ticket1 = new RegularTicket("Brunch", "1256ERTY", "patna", "delhi", "4", "10", "11C", 210.0f, false, "EMIR1234", "BOIN", 120, 90, "Street", "Abu Dahbi", "UAE", "Heena", "8511558379", "heena.hc15@gmail.com");


        Ticket ticket2 = new TouristTicket("Spring Resort", new String[]{"canada", "us", "italy", null, null}, "6787LKWU", "paris", "canada", "7", "18", "11A", 360.0f, false, "XVBT0987", "BOIN", 110, 90, "Street2", "Tokyo", "Japan", "Heena", "8511558379", "heena.hc15@gamil.com");

        printTicketDetails(ticket1);
        printTicketDetails(ticket2);
    }

    public static void printTicketDetails(Ticket ticket){
        ticket.printDetails(ticket);
    }
}