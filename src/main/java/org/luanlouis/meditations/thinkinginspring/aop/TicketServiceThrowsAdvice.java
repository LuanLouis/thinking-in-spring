package org.luanlouis.meditations.thinkinginspring.aop;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * 抛出异常时的处理意见
 * Created by louis on 2016/4/14.
 */
public class TicketServiceThrowsAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception ex){

    }
    public void afterThrowing(Method method, Object[] args, Object target, Exception ex){

    }

}
