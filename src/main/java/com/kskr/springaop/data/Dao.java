package com.kskr.springaop.data;

import com.kskr.springaop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao {

    @TrackTime
    public String retrieveSomething() {
        return "Dao";
    }
}
