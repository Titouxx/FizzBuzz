package com.example;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        boolean isFizz = (number % 3 == 0) || Integer.toString(number).contains("3");
        boolean isBuzz = (number % 5 == 0) || Integer.toString(number).contains("5");
        if (isFizz && isBuzz) {
            return "FizzBuzz";
        } else if (isFizz) {
            return "Fizz";
        } else if (isBuzz) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }
}