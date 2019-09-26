package by.egar.servertime;

import javax.xml.ws.Endpoint;

import by.egar.servertime.soap.TimeWebServiceImpl;

/**
 * @author Denis Khalaev
 */
public class Main {
    public static void main(String... args) {

        Endpoint.publish("http://localhost:9090/time", new TimeWebServiceImpl());
    }

}
