package edu.escuelaing.arep;

import jdk.nashorn.api.scripting.URLReader;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class URLRequest {

    public void read(URL page){
        System.out.println("Protocol: " + page.getProtocol());
        System.out.println("Authority: " + page.getAuthority());
        System.out.println("Host: " + page.getHost());
        System.out.println("Port: " + page.getPort());
        System.out.println("Path: " + page.getPath());
        System.out.println("Query: " + page.getQuery());
        System.out.println("File: " + page.getFile());
        System.out.println("Ref: " + page.getRef());
    }

    public  void readAndSaveURLPage(URL url) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))){
            String inputLine = null;
            File file = new File("src\\main\\java\\edu\\escuelaing\\arep\\resources\\results.html");
            FileWriter fileWriter = new FileWriter(file);
            while((inputLine = reader.readLine()) != null){
                System.out.println(inputLine);
                fileWriter.write(inputLine);
            }
            fileWriter.close();
        } catch (IOException e){
            Logger.getLogger(URLReader.class.getName()).log(Level.SEVERE, null, e);
            System.err.println(e);
        }
    }


    public static void main(String[] args) throws MalformedURLException {
        URLRequest reader = new URLRequest();
        System.out.println("Enter URL, for example: https://www.escuelaing.edu.co/es/ ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        URL url = new URL(line);
        System.out.println("Ejercicio 1: ");
        reader.read(url);
        System.out.println("Ejercicio 2: ");
        reader.readAndSaveURLPage(url);
    }
}
