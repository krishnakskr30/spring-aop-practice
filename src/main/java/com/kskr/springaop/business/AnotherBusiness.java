package com.kskr.springaop.business;

import com.kskr.springaop.data.AnotherDao;
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
