package by.jrr.springexample.xml.integrator;

import by.jrr.springexample.xml.integrator.bean.BotProject;
import by.jrr.springexample.xml.integrator.bean.Department;
import by.jrr.springexample.xml.integrator.bean.Developer;
import by.jrr.springexample.xml.integrator.bean.Manager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.text.ParseException;
import java.util.Arrays;

public class IntegratorApp {
    private static Logger log = LoggerFactory.getLogger("IntegratorApp");
    public static void main(String[] args) throws ParseException {
        beanLifeCycle();
    }

    private static void beanLifeCycle() {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:context.xml");
//        Developer developer = context.getBean("tester", Developer.class);
//        Manager manager = context.getBean("manager", Manager.class);
        Department department = context.getBean("israel", Department.class);
        context.close();
//        log.info(department.toString());
    }

    private static void useCollectionAndInheritance() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Manager manager = context.getBean("manager", Manager.class);
        log.info(manager.toString());
    }

    private static void useFabricMethods() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        BotProject botProject = context.getBean("yoga", BotProject.class);
        BotProject aBotProject = context.getBean("projectA", BotProject.class);
        log.info(botProject.toString());
        log.info(aBotProject.toString());
    }

    private static void contextCounties() {
        ApplicationContext first = new ClassPathXmlApplicationContext("context.xml");
        ApplicationContext second = new ClassPathXmlApplicationContext("context.xml");

        BotProject yoga = first.getBean("yoga", BotProject.class);
        log.info("first project = " + yoga);

        yoga.setName("Scope changing demonstration");

        BotProject newYoga = second.getBean("yoga", BotProject.class);
        log.info("second project = " + newYoga);

        log.info("(yoga == newYoga) = " + (yoga == newYoga));
    }

    private static void printContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(a -> log.info(a));
    }

    private static void singletonVsPrototype() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        BotProject project = context.getBean("projectA", BotProject.class);
        project.setName("Scope changing demonstration");
        log.info("project = " + project);

        BotProject fitness = context.getBean("projectA", BotProject.class);
        log.info("fitness = " + fitness);

        BotProject fitnessYoga = context.getBean("projectA", BotProject.class);
        log.info("fitnessYoga = " + fitnessYoga);

        log.info("are equall: "
                + ((project == fitness)
                && (fitness == fitnessYoga)
                && (project == fitnessYoga)));
    }

    private static void composition() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

        BotProject aBotProject = ctx.getBean("projectA", BotProject.class);
        BotProject cBotProject = ctx.getBean("projectC", BotProject.class);
        BotProject fitnessYoga = ctx.getBean("fitness yoga", BotProject.class);
        BotProject yogaProject = ctx.getBean("yoga", BotProject.class);
        BotProject bBotProject = ctx.getBean("projectB", BotProject.class);

        log.info(aBotProject.toString());
        log.info(cBotProject.toString());
        log.info(fitnessYoga.toString());
        log.info(yogaProject.toString());
        log.info(bBotProject.toString());
    }

    private static void baseSyntax() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

        Developer developer = (Developer) ctx.getBean("dev");
        Developer trainee = ctx.getBean("trainee", Developer.class);
        Developer anon = ctx.getBean("anon", Developer.class);

        log.info(developer.toString());
        log.info(trainee.toString());
        log.info(anon.toString());
    }
}
