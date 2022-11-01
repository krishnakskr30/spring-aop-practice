package com.kskr.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao {
    public String retrieveSomething() {
        return "Dao";
    }
}
