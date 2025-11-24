package com.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzStepDefinitions {
    private int number;
    private String result;

    @Given("the number {int}")
    public void the_number(int num) {
        this.number = num;
    }

    @When("I compute its FizzBuzz representation")
    public void i_compute_its_fizzbuzz_representation() {
        if (number % 15 == 0) {
            result = "FizzBuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else {
            result = Integer.toString(number);
        }
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String expected) {
        assertEquals(expected, result);
    }
}
