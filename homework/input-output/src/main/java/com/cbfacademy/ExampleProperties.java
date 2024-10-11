package com.cbfacademy;
import java.io.*;
import java.util.*;

public class ExampleProperties {
    public static void main(String[] args) throws Exception {
        // Create reader object on example.properties
        FileReader reader = new FileReader("example.properties");

        // Create properties object
        Properties p = new Properties();

        // Add wrapper around reader object
        p.load(reader);

        System.out.println(p.getProperty("Name"));
        System.out.println(p.getProperty("Age"));
        System.out.println(p.getProperty("City"));
        
    }


}
