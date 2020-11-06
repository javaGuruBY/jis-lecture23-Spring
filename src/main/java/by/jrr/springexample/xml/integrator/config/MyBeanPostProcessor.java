package by.jrr.springexample.xml.integrator.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("\t\t\t[MyBeanPostProcessor.BEFORE]... ");
        System.out.println("\t... bean name "+ beanName);
        System.out.println("\t... bean obj "+ bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("\t\t\t[MyBeanPostProcessor.AFTER]... ");
        System.out.println("\t... bean name "+ beanName);
        System.out.println("\t... bean obj "+ bean);
        return bean;
    }
}
