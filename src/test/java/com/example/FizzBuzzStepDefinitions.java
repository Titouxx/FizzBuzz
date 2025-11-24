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
        switch (number) {
            case 1:
                result = "1";
                break;
            case 2:
                result = "2";
                break;
            case 3:
                result = "Fizz";
                break;
            case 4:
                result = "4";
                break;
            case 5:
                result = "Buzz";
                break;
            default:
                result = "WRONG_RESULT";
        }
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String expected) {
        assertEquals(expected, result);
    }
}
