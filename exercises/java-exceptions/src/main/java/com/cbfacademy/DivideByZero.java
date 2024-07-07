package com.cbfacademy;

// Practice
public class DivideByZero {
    // public static void main(String args[]) {
    //     int a = 5;
    //     int b = 0;
    //     try {
    //         System.out.println(a / b); // throw Exception
    //     }catch(ArithmeticException e) {
    //         // Exception handler
    //         System.out.println("Divided by zero operation cannot be possible");
    //     }
    // }

    public static void main(String args[]) {
        try {
            int number[] = new int[10];
            number[10] = 30 / 0; 
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.getMessage());
            // print message
        }
    }
}
