package com.crm.qa.testcases.loginPage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefination {

	
//	static WebDriver driver;
//	static JavascriptExecutor js;
	
	LoginPage loginPage;

	@Given("User launch the Altimetrik URL")
	public void setUp() throws Exception {
		loginPage.launchURL();
		
	};
	
	@Then("Verify Altimetrik header")
	public void setUp(String header) throws Exception {
		Assert.assertTrue(loginPage.verifyHeader());
		
	};
	}
