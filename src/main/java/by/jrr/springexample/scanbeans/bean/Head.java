package by.jrr.springexample.scanbeans.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Head {
    private Integer eyes;
    public void setEyes(@Value("9") Integer eyes) {
        this.eyes = eyes;
    }
}
