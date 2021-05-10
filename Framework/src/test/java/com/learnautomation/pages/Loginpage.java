package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	WebDriver driver;

	public Loginpage(WebDriver ldriver) 
	{
 this.driver=ldriver;
}
	@FindBy(name="email")WebElement email;
	@FindBy(name="password")WebElement password;
	@FindBy(xpath="/html/body/div[2]/div/div/section/div/div/div/div[2]/div/div[2]/div/form/div[2]/button")WebElement loginButton;
	
	public void LogintoPA(String usernameApplication, String passwordApplication)  {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		email.sendKeys(usernameApplication);
		password.sendKeys(passwordApplication);
		loginButton.click();
		
	}
	}
