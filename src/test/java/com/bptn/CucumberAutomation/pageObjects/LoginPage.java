package com.bptn.CucumberAutomation.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bptn.CucumberAutomation.provider.ResourceProvider;
import com.bptn.CucumberAutomation.web.DriverManager;

@Component
public class LoginPage {

	@Autowired
	DriverManager driverManager;

	@Autowired
	ResourceProvider provider;
// specify the element locations in the login page  
	By txtUsername = By.id("username");
	By txtPassword = By.id("password");

	By btnSubmit = By.cssSelector("button");
// open the login page	
	public void openLoginPage() {
		this.driverManager.getDriver().get(this.provider.getUrl());
	}
// finds username input and types the username inside it 
	public void setUsername(String username) {
		this.driverManager.getDriver().findElement(this.txtUsername).sendKeys(username);
	}
	// finds password input and types the password inside it 
	public void setPassword(String password) {
		this.driverManager.getDriver().findElement(this.txtPassword).sendKeys(password);
	}
// finds the submit button and click it 
	public void clickSubmit() {
		this.driverManager.getDriver().findElement(this.btnSubmit).click();
	}

	public boolean verifyMessage(String result) {

		try {
			this.driverManager.getDriver().findElement(By.xpath("//*[contains(text(), '" + result + "')]"));
		} catch (NoSuchElementException e) {
			return false;
		}

		return true;
	}
}