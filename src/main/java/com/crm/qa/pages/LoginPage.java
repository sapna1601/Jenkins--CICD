package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	public void launchURL() {
		System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");
		driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.altimetrik.com/contact/");
		
	}

	public boolean verifyHeader() {
		List<WebElement> elements = driver.findElements(By.xpath("//img[@alt='Altimetrik']"));
        if (elements.size() > 0) {
            System.out.println("Element is present.");
            return true;
        } else {
            System.out.println("Element is not present.");
            return false;
        }
		
	}
	
}
