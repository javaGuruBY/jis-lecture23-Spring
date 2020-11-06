package by.jrr.springexample.scanbeans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;

@Component
public class DoStuffFirst {

    @Autowired
    private Logger logger;

    public void doStuff() {
        logger.info("Doing stuff in do stuff");
    }
}
