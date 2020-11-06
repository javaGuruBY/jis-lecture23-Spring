package by.jrr.strategy.partB;

import by.jrr.strategy.partB.bean.*;
import by.jrr.strategy.partB.service.BitcoinSalaryService;
import by.jrr.strategy.partB.service.EmailSubscriptionService;
import by.jrr.strategy.partB.service.VisaSalaryService;

public class App {
    public static void main(String[] args) {
        Curator curator = new Curator();
        Director director = new Director();
        Guest guest = new Guest();
        Lecturer lecturer = new Lecturer();
        Student student = new Student();

        curator.setSalaryService(new BitcoinSalaryService());
        director.setSalaryService(new VisaSalaryService());

        guest.setSubscriptionService(new EmailSubscriptionService());


    }

}
