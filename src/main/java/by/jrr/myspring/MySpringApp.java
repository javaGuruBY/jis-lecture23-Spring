package by.jrr.myspring;

import by.jrr.fabrique.pizza.PizzaFactoryApplication;
import by.jrr.fabrique.pizza.service.pizza.PizzaService;
import by.jrr.myspring.bean.Humanable;

public class MySpringApp {

    public static void main(String[] args) {

        Humanable human1 = MyContext.getHuman("SuperHero");
        Humanable human2 = MyContext.getHuman("Oleg");
        PizzaService pizzaService
                = (PizzaService) MyContext.getObject("PizzaService");


        pizzaService.orderPizza("pi");
        human1.speak();
        human2.speak();
    }
}
