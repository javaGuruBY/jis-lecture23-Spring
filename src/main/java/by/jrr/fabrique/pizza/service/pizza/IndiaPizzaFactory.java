package by.jrr.fabrique.pizza.service.pizza;

import by.jrr.fabrique.pizza.bean.pizza.IndiaHawaiiPizza;
import by.jrr.fabrique.pizza.bean.pizza.IndiaPepperoniPizza;
import by.jrr.fabrique.pizza.bean.pizza.Pizza;
import by.jrr.fabrique.pizza.bean.pizza.indiaCheesePizza;
import by.jrr.fabrique.pizza.service.component.ComponentFactory;

public class IndiaPizzaFactory implements PizzaFactoryI{


    public Pizza getPizza(String name, ComponentFactory componentFactory) {
        Pizza pizza = null;

        if (name.equals("cheese")) {
            pizza = new indiaCheesePizza("cheese", componentFactory);
        } else if (name.equals("hawaii")) {
            pizza = new IndiaHawaiiPizza("hawaii", componentFactory);
        } else if (name.equals("pepperoni")) {
            pizza = new IndiaPepperoniPizza("pepperoni", componentFactory);
        }
        return pizza;

    }

}
