package com.cbfacademy;

public class Year {
    public static String isLeap(int year) {
        // divisible by 400
        if (year % 400 == 0) {
            return "Leap Year";
        }
        return null;
    }
}
