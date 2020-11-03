package by.jrr.fabrique.tranport;

import by.jrr.fabrique.tranport.bean.Bicycle;
import by.jrr.fabrique.tranport.bean.Transport;
import by.jrr.fabrique.tranport.service.TransportFactory;

public class TransportApplication {
    public static void main(String[] args) throws Exception {
        Transport transport1 = TransportFactory.getTransport(1);
        Transport transport2 = TransportFactory.getTransport(2);
        Transport transport3 = TransportFactory.getTransport(3);
        Transport transport4 = TransportFactory.getTransport(4);

    }
}
