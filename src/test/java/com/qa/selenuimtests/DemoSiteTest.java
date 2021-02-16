package com.qa.selenuimtests;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DemoSiteTest {

	private  WebDriver driver;
    
	@BeforeAll
	
	public  void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver(ChromeOptionsClass.chromeCfg());
		driver.manage().window().setSize(new Dimension(1366,768));
	}
	
	@Test
	public void test() throws InterruptedException{
		driver.get("http://thedemosite.co.uk/");


		WebElement addUserLink = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
		addUserLink.click();
		
		WebElement userNameInput = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		userNameInput.click();
		userNameInput.sendKeys("fdgghgfhgf");
		
		WebElement passwordInput = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		passwordInput.click();
		passwordInput.sendKeys("dfgdfg");
		
		WebElement saveButton = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		saveButton.click();
		
		
		WebElement loginUserLink = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
		loginUserLink.click();
		
		WebElement loginUserNameInput = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		loginUserNameInput.click();
		loginUserNameInput.sendKeys("fdgghgfhgf");
		
		
		WebElement loginPasswordInput = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		loginPasswordInput.click();
		loginPasswordInput.sendKeys("dfgdfg");
		
		WebElement testLoginButton = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
		testLoginButton.click();
		
		WebElement loginSucessfulText = driver.findElement(By.xpath(("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")));
		assertEquals("**Successful Login**", loginSucessfulText.getText());
	}
	
	@AfterAll
	public void tearDown()
	{
		driver.close();
	}
}
