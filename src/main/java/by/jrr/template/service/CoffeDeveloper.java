package by.jrr.template.service;

import by.jrr.template.bean.Coffee;
import by.jrr.template.bean.Vodka;

public class CoffeDeveloper extends Drink {
    @Override
    protected void addBaseComponent() {
        baseComponent = new Coffee("Dalmaier");
    }
}
