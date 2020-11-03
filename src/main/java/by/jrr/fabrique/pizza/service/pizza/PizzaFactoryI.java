package by.jrr.fabrique.pizza.service.pizza;

import by.jrr.fabrique.pizza.bean.pizza.Pizza;
import by.jrr.fabrique.pizza.service.component.ComponentFactory;

public interface PizzaFactoryI {
    Pizza getPizza(String name, ComponentFactory componentFactory);
}
