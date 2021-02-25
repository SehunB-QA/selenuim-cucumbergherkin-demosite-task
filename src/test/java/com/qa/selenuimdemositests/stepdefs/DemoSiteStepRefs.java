package com.qa.selenuimdemositests.stepdefs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoSiteStepRefs {
	private static RemoteWebDriver driver;
	
	@Given("I access {string}")
	public void i_access(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  

		 driver = SelenuimWebDriver.getDriver();
			driver.manage().window().setSize(new Dimension(1366,768));
		    driver.get("http://" + string);
	}

	@When("I click on the add user link and that takes me to the add user page")
	public void i_click_on_the_add_user_link_and_that_takes_me_to_the_add_user_page() {
		WebElement addUserLink = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
		addUserLink.click();
		
	}

	@When("the user enters {string} username in the username text box")
	public void the_user_enters_username_in_the_username_text_box(String string) {
		WebElement userNameInput = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		userNameInput.click();
		userNameInput.sendKeys(string);
	}

	@When("the user enters {string} password in the password text box")
	public void the_user_enters_password_in_the_password_text_box(String string) {
		WebElement passwordInput = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		passwordInput.click();
		passwordInput.sendKeys(string);
	}

	@When("the user clicks the save user button")
	public void the_user_clicks_the_save_user_button() {
		WebElement saveButton = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		saveButton.click();
		
	}

	@When("the user clicks on the login user link")
	public void the_user_clicks_on_the_login_user_link() {
		WebElement loginUserLink = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
		loginUserLink.click();
	}

	@When("the user enters the same {string} username in the username text box")
	public void the_user_enters_the_same_username_in_the_username_text_box(String string) {
		WebElement loginUserNameInput = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		loginUserNameInput.click();
		loginUserNameInput.sendKeys(string);
		
	}

	@When("the user enters the same  {string} password in the password text box")
	public void the_user_enters_the_same_password_in_the_password_text_box(String string) {
		WebElement loginPasswordInput = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		loginPasswordInput.click();
		loginPasswordInput.sendKeys(string);
		
	}

	@When("the user clicks the testlogin  button")
	public void the_user_clicks_the_testlogin_button() {
		WebElement testLoginButton = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
		testLoginButton.click();
	}

	@Then("I verify I have logged in with the {string} text.")
	public void i_verify_i_have_logged_in_with_the_text(String string) {
		WebElement loginSucessfulText = driver.findElement(By.xpath(("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")));
		assertEquals(string, loginSucessfulText.getText());
	}


}
