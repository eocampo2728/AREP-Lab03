package edu.escuelaing.arep;

import java.net.MalformedURLException;
import java.net.URL;

public class URLRequest {

    public static void main(String[] args) throws MalformedURLException {
        URL page = new URL("http://campusvirtual.escuelaing.edu.co/moodle/mod/assign/view.php?id=34731");

        System.out.println("Protocol: " + page.getProtocol());
        System.out.println("Authority: " + page.getAuthority());
        System.out.println("Host: " + page.getHost());
        System.out.println("Port: " + page.getPort());
        System.out.println("Path: " + page.getPath());
        System.out.println("Query: " + page.getQuery());
        System.out.println("File: " + page.getFile());
        System.out.println("Ref: " + page.getRef());


    }
}
