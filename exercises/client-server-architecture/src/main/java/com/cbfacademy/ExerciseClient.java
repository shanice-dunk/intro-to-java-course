package com.cbfacademy;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ExerciseClient {
    public static void main(String[] args) {
        Socket socket = null;
        PrintWriter out = null;

        try {
            // Creates a Socket to conntect to the server on localhost at port 4040
            socket = new Socket("localhost", 4040);
            out = new PrintWriter(socket.getOutputStream(), true);
            // Sends a simple text message to the server
            System.out.println("Hello Server!");
            System.out.println("Message sent to the server.");
        } catch (UnknownHostException e) {
            System.out.println("Do not know about host: localhost.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Couldn't get I/O for the connection to: localhost.");
            e.printStackTrace();
            // Ensures all resources Socket and PrintWriter are properly closed in finally block
        } finally {
            try {
                if (out != null) out.close();
                if (socket != null) socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
