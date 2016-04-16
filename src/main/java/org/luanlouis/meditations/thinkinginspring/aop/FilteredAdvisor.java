package org.luanlouis.meditations.thinkinginspring.aop;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;

/**
 * 实现一个PointcutAdvisor，通过提供的Pointcut,对Advice的执行进行过滤
 * Created by louis on 2016/4/16.
 */
public class FilteredAdvisor implements PointcutAdvisor {

    private Pointcut pointcut;
    private Advice advice;

    public FilteredAdvisor(Pointcut pointcut, Advice advice) {
        this.pointcut = pointcut;
        this.advice = advice;
    }

    /**
     * Get the Pointcut that drives this advisor.
     */
    @Override
    public Pointcut getPointcut() {
        return pointcut;
    }

    @Override
    public Advice getAdvice() {
        return advice;
    }

    @Override
    public boolean isPerInstance() {
        return false;
    }
}
