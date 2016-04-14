package org.luanlouis.meditations.thinkinginspring.aop;

import org.springframework.aop.framework.ProxyFactoryBean;

/**
 * Created by louis on 2016/4/14.
 */
public class App {

    public static void main(String[] args) {

        TicketServiceBeforeAdvice beforeAdvice = new TicketServiceBeforeAdvice();

        RailwayStation railwayStation = new RailwayStation();
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setInterfaces(TicketService.class);
        proxyFactoryBean.setTarget(railwayStation);

        proxyFactoryBean.addAdvice(beforeAdvice);

        TicketService ticketService = (TicketService) proxyFactoryBean.getObject();

        ticketService.sellTicket();

    }


}
