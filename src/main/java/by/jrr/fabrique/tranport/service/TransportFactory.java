package by.jrr.fabrique.tranport.service;

import by.jrr.fabrique.tranport.bean.*;

public class TransportFactory {
    public static Transport getTransport(int numberOfWheels) throws Exception {
        switch (numberOfWheels) {
            case 1:
                return new Monocycle();
            case 2:
                return new Bicycle();
            case 3:
                return new Tricycle();
            case 4:
                return new Car();
            default:
                throw new Exception("Bad transport criteria");
        }
    }
}
