package com.kskr.springaop.business;

import com.kskr.springaop.data.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business {
    @Autowired
    private Dao dao;

    public String calculateSomething() {
        return dao.retrieveSomething();
    }
}
