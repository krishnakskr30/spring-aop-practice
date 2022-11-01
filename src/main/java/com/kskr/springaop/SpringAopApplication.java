package com.kskr.springaop;

import com.kskr.springaop.business.AnotherBusiness;
import com.kskr.springaop.business.Business;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Business business;

    @Autowired
    private AnotherBusiness anotherBusiness;

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info(business.calculateSomething());
        logger.info(anotherBusiness.calculateSomething());
    }
}
