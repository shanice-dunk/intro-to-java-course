package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collection;
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
                System.out.println("January");
            case 2:
                System.out.println("February");        
            case 3:
                System.out.println("March");        
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
            default:
                System.out.println("Invalid month number");
                return number.toString();
        }  
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        //  for loop
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        HashMap<Integer, Integer> calculatedSumOfEvens = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> calculatedSumOfOdds = new HashMap<Integer, Integer>();
        int even = 0;
        int odd = 0;
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        for (int i = 1; i <= 100; i ++) {
            if (i % 2 == 0) {
                even = even+i;
            } else {
                odd = odd+i;
            }
        }
        //  - returns a map with two entries:
        System.out.println("SumOfEvens" + calculatedSumOfEvens);
        System.out.println("SumOfOdds" + calculatedSumOfOdds);
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        // throw new RuntimeException("Not implemented");
        return sumOfOddsAndSumOfEvens();
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        //  - it takes an array list of integers
        ArrayList<Integer> list = new ArrayList<>();
        //  - it returns the list in reverse order
        Collections.reverse(list);
        // throw new RuntimeException("Not implemented");
            return numbers;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
