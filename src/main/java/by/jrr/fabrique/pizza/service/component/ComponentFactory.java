package by.jrr.fabrique.pizza.service.component;

import by.jrr.fabrique.pizza.bean.component.*;

public interface ComponentFactory {

    Dought createDought();;
    Cheese createCheese();;
    Filling createFilling();;
    Sause createSause();;

}
