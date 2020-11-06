package by.jrr.springexample.scanbeans.config;

import by.jrr.springexample.scanbeans.bean.Head;
import by.jrr.springexample.scanbeans.bean.Human;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyHumanoidConfig {

    @Bean
    @Scope("singleton")
    public Human pavel() {
        Human human = new Human();
        human.setName("Pavel");
        human.setWeight(78);
        return human;
    }

    @Bean
    public Head head() {
        Head head = new Head();
        head.setEyes(3);
        return head;
    }

    @Bean
    public Logger logger() {
        return LoggerFactory.getLogger("MyHumanoidConfig");
    }
}
