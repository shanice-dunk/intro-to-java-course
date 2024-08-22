package com.cbfacademy;

public class Year {
   private final Integer year; 

   public Year(Integer year) {
      this.year = year;
   }
   public boolean isLeap(int year) {
      
      // years divisible by 400 are leap years
      if (this.year % 400 == 0) {
          return true;
      } else if (this.year % 100 == 0) {
          return false;
      }
      return this.year % 4 == 0;
  }
}

