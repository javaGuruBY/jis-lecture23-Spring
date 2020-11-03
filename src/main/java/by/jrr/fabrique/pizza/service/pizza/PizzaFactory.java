package by.jrr.fabrique.pizza.service.pizza;

import by.jrr.fabrique.pizza.bean.pizza.CheesePizza;
import by.jrr.fabrique.pizza.bean.pizza.HawaiiPizza;
import by.jrr.fabrique.pizza.bean.pizza.PepperoniPizza;
import by.jrr.fabrique.pizza.bean.pizza.Pizza;
import by.jrr.fabrique.pizza.service.component.ComponentFactory;

public class PizzaFactory implements PizzaFactoryI{


    public Pizza getPizza(String name, ComponentFactory componentFactory) {
        Pizza pizza = null;

        if (name.equals("cheese")) {
            pizza = new CheesePizza("cheese", componentFactory);
        } else if (name.equals("hawaii")) {
            pizza = new HawaiiPizza("hawaii", componentFactory);
        } else if (name.equals("pepperoni")) {
            pizza = new PepperoniPizza("pepperoni", componentFactory);
        }
        return pizza;

    }

}
