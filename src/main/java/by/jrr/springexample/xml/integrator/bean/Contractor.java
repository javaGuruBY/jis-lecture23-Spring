package by.jrr.springexample.xml.integrator.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Contractor{

    protected String name;

    private String number;
    private Date date;

    public void setLevel(int i) {
        System.out.println("Contractor Dummy level setter");
    }

    @Override
    public String toString() {
        return "\n\tContractor " + name + " {" +
                "number='" + number + '\'' +
                ", date=" + date +
                '}';
    }
}
