package com.cbfacademy;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URI;
import java.net.HttpURLConnection;

public class App {
    // public static void main(String[] args) {
    //     System.out.println("Hello World!");
    // }
    public static void main(String[] args) throws Exception {
        
        try {
            // Define URL object, define URI which converts to URL
            URL myURL = new URI("https://codingblackfemales.com/").toURL();
            HttpURLConnection connection = (HttpURLConnection) myURL.openConnection();

            // Get request
            connection.setRequestMethod("GET");

            // Setting up buffer reader
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String intputLine;

                // Loop to print out each line
                while ((intputLine = in.readLine()) != null) {
                    System.out.println((intputLine));
                }
        
                // Closing connection
                connection.disconnect();
            }

        // General exceptions
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
       
    
}

