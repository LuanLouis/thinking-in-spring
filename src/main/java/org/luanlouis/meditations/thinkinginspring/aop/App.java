package org.luanlouis.meditations.thinkinginspring.aop;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactoryBean;

/**
 * 通过ProxyFactoryBean 手动创建 代理对象
 * Created by louis on 2016/4/14.
 */
public class App {

    public static void main(String[] args) {

        //1.针对不同的时期类型，提供不同的Advice
        Advice beforeAdvice = new TicketServiceBeforeAdvice();
        Advice afterReturningAdvice = new TicketServiceAfterReturningAdvice();
        Advice aroundAdvice = new TicketServiceAroundAdvice();
        Advice throwsAdvice = new TicketServiceThrowsAdvice();

        RailwayStation railwayStation = new RailwayStation();

        //2.创建ProxyFactoryBean,用以创建指定对象的Proxy对象
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
       //3.设置Proxy的接口
        proxyFactoryBean.setInterfaces(TicketService.class);
        //4. 设置RealSubject
        proxyFactoryBean.setTarget(railwayStation);
        //5. 添加不同的Advice

        proxyFactoryBean.addAdvice(afterReturningAdvice);
        proxyFactoryBean.addAdvice(aroundAdvice);
        proxyFactoryBean.addAdvice(throwsAdvice);
        proxyFactoryBean.addAdvice(beforeAdvice);

        TicketService ticketService = (TicketService) proxyFactoryBean.getObject();

        ticketService.sellTicket();

    }


}
