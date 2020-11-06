package by.jrr.strategy.partB.bean;

import by.jrr.strategy.partB.service.SalaryServiceI;
import by.jrr.strategy.partB.service.SubscriptionServiceI;

public abstract class User {

    private SalaryServiceI salaryService;
    private SubscriptionServiceI subscriptionService;

    public SalaryServiceI getSalaryService() {
        return salaryService;
    }

    public void setSalaryService(SalaryServiceI salaryService) {
        this.salaryService = salaryService;
    }

    public SubscriptionServiceI getSubscriptionService() {
        return subscriptionService;
    }

    public void setSubscriptionService(SubscriptionServiceI subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    void register() {
        System.out.println("User registered");
    }

    abstract void display();

}
