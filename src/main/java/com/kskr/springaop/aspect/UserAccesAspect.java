package com.kskr.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccesAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.kskr.springaop.aspect.CommonJoinPointConfig.datalayerExecution())")
    public void before(JoinPoint joinPoint) {
        logger.info("Check for user access");
        logger.info("Allowed execution for {}", joinPoint);

    }
}
