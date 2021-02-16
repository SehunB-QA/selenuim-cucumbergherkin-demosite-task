package com.qa.selenuimtests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLoginPage {
	
	
	@FindBy(name= "username")
	private WebElement usernameInput;
	
	@FindBy(name= "password")
	private WebElement passwordInput;
	
	@FindBy(name= "FormsButton2")
	private WebElement submitButton;
	
	public void loginUser(String usernameLogin, String passwordLogin)
	{
	  usernameInput.sendKeys(usernameLogin);
	  passwordInput.sendKeys(passwordLogin);
	  submitButton.click();
	}

}
