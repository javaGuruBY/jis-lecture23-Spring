package by.jrr.springexample.scanbeans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyMainService {

    @Autowired
    DoStuffFirst stuffFirst;
    @Autowired
    DoStuffSecond stuffSecond;

    public void stuffingg() {
        stuffFirst.doStuff();
        stuffSecond.doStuff();
    }
}
