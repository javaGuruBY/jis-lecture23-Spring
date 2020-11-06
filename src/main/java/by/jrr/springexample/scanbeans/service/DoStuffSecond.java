package by.jrr.springexample.scanbeans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;

@Component
public class DoStuffSecond {

    @Autowired
    private Logger logger;

    public void doStuff() {
        logger.info("Second Doing stuff in do stuff");
    }
}
