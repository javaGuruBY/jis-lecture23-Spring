package by.jrr.fabrique.pizza;

import by.jrr.fabrique.pizza.service.component.ArabiaComponentFactory;
import by.jrr.fabrique.pizza.service.pizza.IndiaPizzaFactory;
import by.jrr.fabrique.pizza.service.pizza.PizzaService;
import by.jrr.myspring.MyContext;

public class PizzaFactoryApplication {
    public static void main(String[] args) {
        PizzaService pizzaService = new PizzaService(
                new IndiaPizzaFactory(),
                new ArabiaComponentFactory());

        pizzaService.orderPizza("hawaii");

    }
}
