package by.jrr.fabrique.pizza.bean.pizza;

import by.jrr.fabrique.pizza.service.component.ComponentFactory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Pizza {

    protected ComponentFactory componentFactory;

    protected String name;

    public abstract void prepare();

    public void bake() {
        System.out.println("baking " + name + " pizza");
    }

    public void cut() {
        System.out.println("cutting " + name + " pizza");
    }

    public void box() {
        System.out.println("boxing " + name + " pizza");
    }
}
