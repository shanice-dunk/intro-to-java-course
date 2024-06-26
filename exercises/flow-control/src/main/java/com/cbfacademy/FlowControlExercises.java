package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import javax.swing.text.html.StyleSheet.ListPainter;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)%3 == 0 && numbers.get(i)%5 == 0) {
                result.add("FizzBuzz");
            }
            else if (numbers.get(i)%3 == 0) {
                result.add("Fizz");
            }
            else if (numbers.get(i)%5 == 0) {
                result.add("Buzz");
            }
            else {
                result.add(numbers.get(i).toString());
            }
        }
        return result;
    }

    public String whichMonth(Integer number) {
        // Switch statement
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        int month = number;
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";              
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month number";
        }  
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        //  for loop
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        // create one hashmap 
        HashMap<String, Integer> sumOfOddsAndSumOfEvens = new HashMap<String, Integer>();
        int even = 0;
        int odd = 0;
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        for (int i = 1; i <= 100; i ++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        // throw new RuntimeException("Not implemented");
        sumOfOddsAndSumOfEvens.put("SumOfEvens", even);
        sumOfOddsAndSumOfEvens.put("SumOfOdds", odd);

        System.out.print(sumOfOddsAndSumOfEvens);

        return sumOfOddsAndSumOfEvens;
        
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        //  - it takes an array list of integers
        // ArrayList<Integer> list = new ArrayList<>();
        //  - it returns the list in reverse order
        Collections.reverse(numbers);
        // throw new RuntimeException("Not implemented");
        return numbers;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
