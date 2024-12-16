package org.example;

import java.util.Date;
import java.util.UUID;

public class Ticket{

    private final Double total;
    private final UUID id;
    private final String flight;
    private final Date date;
    private final String seat;

    public Ticket(Double total, String flight, Date date, String seat) {
        this.total = total;
        this.id = UUID.randomUUID();
        this.flight = flight;
        this.date = date;
        this.seat = seat;
    }

    public Double getTotal() {
        return this.total;
    }

    public UUID getId() {
        return this.id;
    }

    public String getFlight() {
        return this.flight;
    }

    public Date getDate() {
        return this.date;
    }

    public String getSeat() {
        return this.seat;
    }
}
