package by.jrr.fabrique.pizza.bean.pizza;

import by.jrr.fabrique.pizza.service.component.ComponentFactory;

public class ArabiaPepperoniPizza extends Pizza {

    public ArabiaPepperoniPizza(String name, ComponentFactory componentFactory) {
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
