package by.jrr.template.service;

import by.jrr.template.bean.Vodka;

import java.sql.DriverManager;

public class VodkaCoctail extends Drink {
    @Override
    protected void addBaseComponent() {
        baseComponent = new Vodka(40);
    }
}
