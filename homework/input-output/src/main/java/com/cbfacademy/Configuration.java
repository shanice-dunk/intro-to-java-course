package com.cbfacademy;
import java.util.*;
import java.io.*;

public class Configuration {
    public static void main(String[] args) throws Exception {
        // Create instance of Properties
        Properties p = new Properties();

        // Add properties to files
        p.setProperty("db.url", "localhost");
        p.setProperty("db.port", "5353");
        p.setProperty("db.user", "cbfacademy");
        p.setProperty("db.password", "password");

        // Store properties to file
        p.store(new FileWriter("configuration.properties"), "CBF Academy Properties Homework");
        
    }

}
