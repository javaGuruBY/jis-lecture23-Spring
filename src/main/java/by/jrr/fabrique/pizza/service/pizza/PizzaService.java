package by.jrr.fabrique.pizza.service.pizza;

import by.jrr.fabrique.pizza.bean.pizza.Pizza;
import by.jrr.fabrique.pizza.service.component.ComponentFactory;

public class PizzaService {

    PizzaFactoryI pizzaFactory;
    ComponentFactory componentFactory;

    public PizzaService(PizzaFactoryI pizzaFactory, ComponentFactory componentFactory) {
        this.pizzaFactory = pizzaFactory;
        this.componentFactory = componentFactory;
    }

    public Pizza orderPizza(String name) {
        Pizza pizza = pizzaFactory.getPizza(name, componentFactory);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
