package by.jrr.fabrique.pizza.bean.pizza;

import by.jrr.fabrique.pizza.service.component.ComponentFactory;

public class IndiaHawaiiPizza extends Pizza {

    public IndiaHawaiiPizza(String name, ComponentFactory componentFactory) {
        this.name = name;
        this.componentFactory = componentFactory;
    }

    @Override
    public void prepare() {
        componentFactory.createCheese();
        componentFactory.createDought();
        componentFactory.createFilling();
        componentFactory.createSause();
    }
}
