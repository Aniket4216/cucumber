package com.cucumber_demo.Cucumber_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login {

	WebDriver dr;
	@Given("Chrome Browser should open")
	public void chrome_browser_should_open() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// Creating an object to access the browaer elements
		dr=new ChromeDriver();
        dr.get("https://www.facebook.com/");
	}
	@Given("the credentials of user should be populated")
	public void the_credentials_of_user_should_be_populated() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 dr.findElement(By.id("email")).sendKeys("priya@gmail.com");
	     dr.findElement(By.id("pass")).sendKeys("priya");
	     
	     Thread.sleep(3000);

	}
	@Then("User Must login to the FB account")
	public void user_must_login_to_the_fb_account() {
	    // Write code here that turns the phrase above into concrete actions
	
		 dr.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	
	}
	
	


}
