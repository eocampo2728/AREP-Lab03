package edu.escuelaing.arep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(4444);
        } catch (IOException e) {
            System.err.println("Cant enter to port: 4444.");
            System.exit(1);
        }
        Socket clientSocket = null;
        try {
            System.out.println("Esperando datos: ");
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        clientSocket.getInputStream()));
        String inputLine, outputLine;
        while ((inputLine = in.readLine()) != null) {
            int res = (int)Math.pow(Integer.parseInt(inputLine),2);
            System.out.println("El resultado de "+ inputLine+" al cuadrado: " + res);
            outputLine = "El resultado de " + inputLine + " al cuadrado: " + res ;
            out.println(outputLine);
            if (outputLine.equals("Respuestas: Bye."))
                break;
        }
        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }
}
