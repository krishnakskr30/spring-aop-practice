package com.kskr.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.kskr.springaop.data.*.*(..))")
    public void dataLayerExecution() {
        //intercept any execution in data layer
    }

    @Pointcut("execution(* com.kskr.springaop.business.*.*(..))")
    public void businessLayerExecution() {

    }

    @Pointcut("com.kskr.springaop.aspect.CommonJoinPointConfig.dataLayerExecution() && com.kskr.springaop.aspect.CommonJoinPointConfig.businessLayerExecution())")
    public void allLayerExecution() {

    }

    @Pointcut("bean(*dao*)")
    public void beanContainingDao() {

    }

    @Pointcut("within(* com.kskr.springaop.data..*)")
    public void dataLayerExecutionWithWithIn() {

    }

    @Pointcut("@annotation(com.kskr.springaop.aspect.TrackTime)")
    public void trackTimeAnnotation() {

    }
}
