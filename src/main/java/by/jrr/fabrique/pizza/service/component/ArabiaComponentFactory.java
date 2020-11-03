package by.jrr.fabrique.pizza.service.component;

import by.jrr.fabrique.pizza.bean.component.Cheese;
import by.jrr.fabrique.pizza.bean.component.Dought;
import by.jrr.fabrique.pizza.bean.component.Filling;
import by.jrr.fabrique.pizza.bean.component.Sause;

public class ArabiaComponentFactory implements ComponentFactory {
    @Override
    public Dought createDought() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Filling createFilling() {
        return null;
    }

    @Override
    public Sause createSause() {
        return null;
    }
}
