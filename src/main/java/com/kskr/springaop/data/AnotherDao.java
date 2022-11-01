package com.kskr.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class AnotherDao {
    public String retrieveSomething() {
        return "anotherDao";
    }
}
