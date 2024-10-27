package ma.emsi;
import Service.EtudiantServiceImp;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8088/";
        Endpoint.publish(url,new EtudiantServiceImp());
        System.out.println("Service web publié à l'adresse : " + url);
    }
}