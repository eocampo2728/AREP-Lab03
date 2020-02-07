package edu.escuelaing.arep;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileTransferServer {

    public final static int SOCKET_PORT = 4444;
    //public final static String FILE_TO_SEND = "Resources\\image.jpg";
    public final static String FILE_TO_SEND = "Resources\\web.html";
    public static void main (String [] args ) throws IOException {
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        OutputStream outputStream = null;
        ServerSocket serverSocket = null;
        Socket socket = null;
        PrintWriter printWriter = null;
        try {
            serverSocket = new ServerSocket(SOCKET_PORT);
            while (true) {
                System.out.println("Pending request:");
                try {
                    socket = serverSocket.accept();
                    System.out.println("Accepted connection : " + socket);
                    printWriter = new PrintWriter(
                            socket.getOutputStream(), true);
                    String outputLine = "HTTP/1.1 200 OK\r\n"
                            + "Content-Type: text/html\r\n"
                            + "\r\n"
                            + "<!DOCTYPE html>\n"
                            + "<html>\n"
                            + "<head>\n"
                            + "<meta charset=\"UTF-8\">\n"
                            + "<title>browser</title>\n"
                            + "<script>"
                            + "alert(\"file received:"+ FILE_TO_SEND +"\");"
                            + "</script>"
                            + "</head>\n"
                            + "<body>\n"
                            + "</body>\n"
                            + "</html>\n";
                    System.out.println(outputLine);
                    printWriter.println(outputLine);
                    // send file
                    File myFile = new File (FILE_TO_SEND);
                    byte [] mybytearray  = new byte [(int)myFile.length()];
                    fileInputStream = new FileInputStream(myFile);
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                    bufferedInputStream.read(mybytearray,0,mybytearray.length);
                    outputStream = socket.getOutputStream();
                    System.out.println("Sending " + FILE_TO_SEND + "(" + mybytearray.length + " bytes)");
                    outputStream.write(mybytearray,0,mybytearray.length);
                    outputStream.flush();
                    System.out.println("Done.");
                }
                finally {
                    if (bufferedInputStream != null) bufferedInputStream.close();
                    if (outputStream != null) outputStream.close();
                    if (socket!=null){
                        socket.close();
                        printWriter.close();
                    }
                }
            }
        }
        finally {
            if (serverSocket != null) serverSocket.close();
        }
    }
}
