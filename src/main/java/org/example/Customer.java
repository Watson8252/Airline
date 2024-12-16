package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Customer {

    private final String firstName;
    private final String lastName;
    private final Date birthday;
    private final UUID id;
    private final Double wallet;
    private ArrayList<Ticket> tickets;

    // New Customer constructor
    public Customer(String firstName, String lastName, Date birthday, Double wallet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.wallet = wallet;
        this.id = UUID.randomUUID();
    }

    // Existing Customer constructor
    public Customer(String firstName, String lastName, Date birthday, Double wallet, UUID id, ArrayList<Ticket> tickets) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.wallet = wallet;
        this.id = id;
        this.tickets = tickets;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Double getWallet() {
        return this.wallet;
    }

    public UUID getID() {
        return this.id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public ArrayList<Ticket> getTickets() {
        return this.tickets;
    }

    public Boolean checkTickets(Ticket ticket) {
        return this.tickets.contains(ticket);
    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public void removeTicket(Ticket ticket) {
        this.tickets.remove(ticket);
    }
}
