package by.jrr.springexample.xml.integrator.bean;

import lombok.Data;

import java.util.List;

@Data
public class Department {
    private String name;
    private List<?> team;

    public Department() {
        System.out.println(">>> [Department NoArgsConstructor call]");
    }

    public Department(String name, List<?> team) {
        System.out.println(">>> [Department AllArgsConstructor call]");
        this.name = name;
        this.team = team;
        System.out.println(">>> [Department AllArgsConstructor complete]");
    }

    @Override
    public String toString() {
        System.out.println(">>> [Department toString call]");
        return "Department{" +
                "name='" + name + '\'' +
                ", team=" + team +
                '}';
    }

    private void initDepartment() {
        System.out.println(">>> [initDepartment call]");
        System.out.println(">>> total devs " + team.size());
        System.out.println(">>> [initDepartment complete]");
    }
}
