package by.jrr.template.service;

import by.jrr.template.bean.BaseComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Drink {
    protected BaseComponent baseComponent;

    private static Logger log = LoggerFactory.getLogger("Drink");

    public final void make() {
        takeGlass();
        addWater();
        addSugar();
        addBaseComponent(); // don't now how to do that yet;
        shuffle();
    }

    private final void takeGlass() {
        log.info("taking glass");
    }

    private final void addWater() {
        log.info("adding water");
    }

    private final void addSugar() {
        log.info("adding sugar");
    }

    protected abstract void addBaseComponent();

    private final void shuffle() {
        log.info("shuffling" + baseComponent);
    }
}
