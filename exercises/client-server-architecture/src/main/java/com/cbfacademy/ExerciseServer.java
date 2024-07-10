package com.cbfacademy;
import java.io.*;
import java.net.*;

public class ExerciseServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        BufferedReader in = null;

        try {
            serverSocket = new ServerSocket(4040);
            System.out.println("Server is listening on port 4040...");
            clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String message = in.readLine();
            System.out.println("Received message: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) in.close();
                if (clientSocket != null) clientSocket.close();
                if (serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}