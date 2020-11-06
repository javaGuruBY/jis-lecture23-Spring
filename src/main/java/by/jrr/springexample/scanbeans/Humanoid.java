package by.jrr.springexample.scanbeans;

import by.jrr.springexample.scanbeans.bean.Human;
import by.jrr.springexample.scanbeans.service.MyMainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class Humanoid {

    private static Logger log = LoggerFactory.getLogger("IntegratorApp");

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Humanoid.class);
        MyMainService myMainService = ctx.getBean(MyMainService.class);
        myMainService.stuffingg();

    }

    public static void componentScan() {
        ApplicationContext javaContext =
                new AnnotationConfigApplicationContext(Humanoid.class);
        Human pavel1 = javaContext.getBean("pavel", Human.class);
        log.info(pavel1.toString());
    }

    public static void xmlAnnotatedAutowiring() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("humanoidXml.xml");
        Human human = ctx.getBean("max", Human.class);
        log.info(human.toString());
    }
}
