package com.cbfacademy;

public class FizzBuzz {
    public static String get(int number) {
        // multiple of 15
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        // multiple of 3
        else if (number % 3 == 0) {
            return "Fizz";
        }
        // multiple of 5
        else if (number % 5 == 0) {
            return "Buzz";
        }
        // not a multiple of 3, 5, or 15, return String(number)
        else {
            return String.valueOf(number);
        }
    }
}