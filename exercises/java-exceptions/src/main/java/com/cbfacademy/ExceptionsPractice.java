package com.cbfacademy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

// Practice
public class ExceptionsPractice {
    public static void createNewFile() {
        File file = new File(".resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }
public static void numbersExceptionHandling() {
    File file = new File(".resources/nonexistent.txt");
    Scanner fileReader = null;
    try {
        fileReader = new Scanner(file);

        while (fileReader.hasNext()) {
            double num = fileReader.nextDouble();
            System.out.println(num);
        }
// Catches either exception with the | symbol
    }catch(FileNotFoundException | InputMismatchException e) {
        e.printStackTrace();

    }finally {
        fileReader.close();
}
    
}
public static void main(String args[]) {
    createNewFile();
    numbersExceptionHandling();
    }

}


