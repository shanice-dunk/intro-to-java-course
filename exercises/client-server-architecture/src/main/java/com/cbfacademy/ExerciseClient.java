package com.cbfacademy;

import java.io.*;
import java.net.*;


public class ExerciseClient {
    public static void main(String[] args) {
        // Creates Socket connection to the server on localhost at port 4040
        try (Socket socket = new Socket("localhost", 4040);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
        // Sends simple message to the server
            String message = "Hello World!";
            out.println(message);
            System.out.println("Send message to server" + message);

        } catch (IOException e) {
            e.printStackTrace();
        }   
    }
}
