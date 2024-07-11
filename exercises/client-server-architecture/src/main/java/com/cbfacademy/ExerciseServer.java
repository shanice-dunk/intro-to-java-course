package com.cbfacademy;
import java.io.*;
import java.net.*;

public class ExerciseServer {
    public static void main(String[] args) {
        // Creates ServerSocket to listen to connections on port 4040
        try (ServerSocket serverSocket = new ServerSocket(4040)) {
            System.out.println("Server is listening on port 4040...");
        // Uses infinite while lopp to continuously accept new client connections
            while (true) {
        // For each client connection, it reads and prints the message 
                try (Socket clientSocket = serverSocket.accept();
                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
                        String message = in.readLine();
            
            System.out.println("Received message from client: " + message);        
                    }
                
            }
        } catch (IOException e) {
                e.printStackTrace();
            } 
    }
}