package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.BooleanSupplier;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Basic Test Suite")
public class AppTest {

    @Test
    @DisplayName("creates the app")
    public void createsAnApp() {
        final App app = new App();

        assertThat(app, is(notNullValue()));
    }

    @Test
    @DisplayName("prints Fizz")
    public void testFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", FizzBuzz.get(3));
        assertEquals("Fizz", FizzBuzz.get(6));
        assertEquals("Fizz", FizzBuzz.get(9));
        assertEquals("Fizz", FizzBuzz.get(12));
        
    }

    @Test
    @DisplayName("prints Buzz")
    public void testBuzz() {
        assertEquals("Buzz", FizzBuzz.get(5));
        assertEquals("Buzz", FizzBuzz.get(10));
    }

    @Test
    @DisplayName("prints FizzBuzz")
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.get(15));
    }

    @Test
    @DisplayName("prints number")
    public void testNumbers() {
        assertEquals("1", FizzBuzz.get(1));
        assertEquals("2", FizzBuzz.get(2));
        assertEquals("4", FizzBuzz.get(4));
        assertEquals("7", FizzBuzz.get(7));
        assertEquals("8", FizzBuzz.get(8));
        assertEquals("11", FizzBuzz.get(11));
        assertEquals("13", FizzBuzz.get(13));
        assertEquals("14", FizzBuzz.get(14));
    }

//     @Test
//     @DisplayName("prints true")
//     public void leapYear400() {
//         int year = 2000; // example year
//         assertTrue(Year.isLeap(year));
// }
//     @Test
//     @DisplayName("1700 is not a leap year")
//     public void leapYear1700() {
//         assertEquals(false, Year.isLeap(1700));
//     }

static Stream<Arguments> inputAndOutputProvider() {
    return Stream.of(
        Arguments.of(1600, true),
        Arguments.of(1700, false)

    );
    
}

@ParameterizedTest
@MethodSource("inputAndOutputProvider")
@DisplayName("Determine whether leap year or not")
public void returnExpectedValue(Integer number, Boolean expected) {
    final Year year = new Year(number);
    assertThat(year.isLeap(0), is(expected));
}

    
    
}

// assertEquals("Fizz", FizzBuzz.printFizzBuzz(3));
        // assertEquals("Buzz", FizzBuzz.printFizzBuzz(5));
        // assertEquals("FizzBuzz", FizzBuzz.printFizzBuzz(15));