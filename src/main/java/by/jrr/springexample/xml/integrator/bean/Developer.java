package by.jrr.springexample.xml.integrator.bean;

import lombok.Data;

import java.util.Map;

@Data
public class Developer extends Contractor {

//    private String name;
    private String skill;
    private int level;
    private boolean isIntesive;

    private Map<String, Integer> techSteck;

    public Developer() {
        System.out.println(">>> [Developer NoArgsConstructor call]");
    }

    public Developer(String name) {
        this.name = name;
    }

    public Developer(String skill, int level, boolean isIntesive, Map<String, Integer> techSteck) {
        System.out.println(">>> [Developer AllArgsConstructor call]");
        this.skill = skill;
        this.level = level;
        this.isIntesive = isIntesive;
        this.techSteck = techSteck;
        System.out.println(">>> [Developer AllArgsConstructor complete]");
    }

    public Developer(String name, String skill, int level, boolean isIntesive) {
        System.out.println(">>> [Developer 4 args call]");
        this.name = name;
        this.skill = skill;
        this.level = level;
        this.isIntesive = isIntesive;
        System.out.println(">>> [Developer 4 args complete]");
    }


    @Override
    public String toString() {
        return super.toString() + "\n\t\tDeveloper{" +
                "name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", level=" + level +
                ", isIntesive=" + isIntesive +
                '}';
    }

    public void onDestroy() {
        System.out.println("!!! >>>>  [Developer.onDestroy()] "+this.getClass().getName() + this.toString());
    }
}
