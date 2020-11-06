package by.jrr.springexample.xml.integrator.config;

import org.springframework.beans.factory.DisposableBean;

public class OnDestroy implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("!!! >>> [---OnDestroy.destroy---]");
    }
}
