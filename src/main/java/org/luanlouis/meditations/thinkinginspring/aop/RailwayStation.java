package org.luanlouis.meditations.thinkinginspring.aop;

/**
 * Created by louis on 2016/4/14.
 */
public class RailwayStation implements TicketService {

    public void sellTicket() {
        System.out.println("selling tickets............");
    }

    public void inquire() {
        System.out.println("Inquiring..............");
    }

    public void withdraw() {
        System.out.println("Withdrawing.............");
    }
}
