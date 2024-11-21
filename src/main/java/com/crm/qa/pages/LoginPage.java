package com.crm.qa.pages;

import java.util.List;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.crm.qa.base.TestBase;

public class LoginPage{

	public class Calculator {

	    public int add(int a, int b) {
	        return a + b;
	    }

	    public int subtract(int a, int b) {
	        return a - b;
	    }

	    public int multiply(int a, int b) {
	        return a * b;
	    }

	    public int divide(int a, int b) {
	        if (b != 0) {
	            return a / b;
	        }
	        throw new IllegalArgumentException("Cannot divide by zero");
	    }
	}
}
