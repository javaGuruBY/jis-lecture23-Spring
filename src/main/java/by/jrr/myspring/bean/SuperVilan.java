package by.jrr.myspring.bean;

import by.jrr.myspring.MyContext;

public class SuperVilan implements Humanable{

    String name = "superVilan!";

    @Override
    public void speak() {
        MyContext.getHuman("SuperVilan");
    }
}
