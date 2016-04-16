package org.luanlouis.meditations.thinkinginspring.aop;

import java.util.ArrayList;

/**
 * RailwayStation 实现 TicketService
 * Created by louis on 2016/4/14.
 */
public class RailwayStation implements TicketService {

    public void sellTicket(){
        System.out.println("售票............");
        //new ArrayList().set(1,5);
    }

    public void inquire() {
        System.out.println("问询..............");
    }

    public void withdraw() {
        System.out.println("退票.............");
    }
}
