package com.kskr.springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnotherBusiness {
    @Autowired
    private AnotherDao anotherDao;

    public String calculateSomething() {
        return anotherDao.retrieveSomething();
    }
}
