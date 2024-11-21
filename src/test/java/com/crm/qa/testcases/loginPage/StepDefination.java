package com.crm.qa.testcases.loginPage;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	
//	static WebDriver driver;
//	static JavascriptExecutor js;
	
	LoginPage loginPage;
	
	private int num1;
    private int num2;
    private int result;

    @Given("I have two numbers {int} and {int}")
    public void i_have_two_numbers_and(int number1, int number2) {
        num1 = number1;
        num2 = number2;
    }

    @When("I add the numbers")
    public void i_add_the_numbers() {
        result = num1 + num2;
    }

    @When("I subtract the numbers")
    public void i_subtract_the_numbers() {
        result = num1 - num2;
    }

    @When("I multiply the numbers")
    public void i_multiply_the_numbers() {
        result = num1 * num2;
    }

    @When("I divide the numbers")
    public void i_divide_the_numbers() {
        result = num1 / num2;
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expectedResult) {
        Assert.assertEquals(expectedResult, result);
    }
}