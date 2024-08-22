package com.cbfacademy;

public class Year {
    public boolean isLeap(int year) {
        // divisible by 400
        if (year % 400 == 0) {
            return true;
        // divisible by 100
        } else if (year % 200 == 0) {
            return false;
        } else {
            return false;
        }
        
    }
}
