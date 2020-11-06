package by.jrr.template;

import by.jrr.template.bean.Vodka;
import by.jrr.template.service.CoffeDeveloper;
import by.jrr.template.service.Drink;
import by.jrr.template.service.VodkaCoctail;

public class App {
    public static void main(String[] args) {
        Drink drink1 = new CoffeDeveloper();
        Drink drink2 = new VodkaCoctail();
        Drink drink3 = new Drink() {
            @Override
            protected void addBaseComponent() {
                baseComponent = new Vodka(37);
            }
        };
    }
}
