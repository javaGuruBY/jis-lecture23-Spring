package by.jrr.springexample.xml.integrator.bean;

import lombok.Data;

import java.util.Set;

@Data
public class Manager {

    private String name;
    private int age;
    private Set<Developer> developers;

    public Manager() {
        System.out.println(">>> [Manager NoArgsConstructor call]");
    }

    public void setLevel(int i) {
        System.out.println("Manager Dummy level setter");
    }

    @Override
    public String toString() {
        return "\nManager{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", developers=" + developers +
                '}';
    }
}
