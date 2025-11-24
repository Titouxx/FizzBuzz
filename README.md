# Names

- Axel Delignieres
- Romain Le Monnier
- Titouan Bazillio
- Taha Abou-eljinane

# FizzBuzz Maven Project

This project is a Java 21 Maven setup for the classic FizzBuzz problem.

## Structure

- `src/main/java`: Source code
- `src/test/java`: Test code
- `FizzBuzz`: Main class
- `FizzBuzzTest`: Test class

## How to build

Run `mvn clean install` in the project root.

## How to test

Run `mvn test` in the project root.

## FizzBuzz Rules

- If the number is a multiple of 3, return "Fizz"
- If the number is a multiple of 5, return "Buzz"
- If the number is a multiple of both 3 and 5, return "FizzBuzz"
- Otherwise, return the number itself

## Examples

- 1 ➔ 1
- 2 ➔ 2
- 3 ➔ Fizz
- 5 ➔ Buzz
- 15 ➔ FizzBuzz
- 30 ➔ FizzBuzz
