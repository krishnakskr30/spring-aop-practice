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
}
