package by.jrr.fabrique.pizza.service.pizza;

import by.jrr.fabrique.pizza.bean.pizza.ArabiaCheesePizza;
import by.jrr.fabrique.pizza.bean.pizza.ArabiaHawaiiPizza;
import by.jrr.fabrique.pizza.bean.pizza.ArabiaPepperoniPizza;
import by.jrr.fabrique.pizza.bean.pizza.Pizza;
import by.jrr.fabrique.pizza.service.component.ComponentFactory;
import by.jrr.fabrique.pizza.service.pizza.PizzaFactoryI;

public class ArabiaPizzaFactory implements PizzaFactoryI {

    public Pizza getPizza(String name, ComponentFactory componentFactory) {
        Pizza pizza = null;

        if (name.equals("cheese")) {
            pizza = new ArabiaCheesePizza("cheese", componentFactory);
        } else if (name.equals("hawaii")) {
            pizza = new ArabiaHawaiiPizza("hawaii", componentFactory);
        } else if (name.equals("pepperoni")) {
            pizza = new ArabiaPepperoniPizza("pepperoni", componentFactory);
        }
        return pizza;

    }

}
