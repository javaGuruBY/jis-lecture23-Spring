package by.jrr.springexample.xml.integrator.config;

import org.springframework.beans.factory.InitializingBean;

public class InitBean  implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(">>>> [InitBean.afterPropertiesSet() was called]");
    }
}
