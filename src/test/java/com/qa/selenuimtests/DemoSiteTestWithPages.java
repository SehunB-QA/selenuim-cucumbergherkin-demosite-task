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
import org.openqa.selenium.support.PageFactory;

import com.qa.selenuimtests.pagelinks.PageLinks;
import com.qa.selenuimtests.pages.CreateUserPage;
import com.qa.selenuimtests.pages.UserLoginPage;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DemoSiteTestWithPages {
	
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
		
		PageLinks website = PageFactory.initElements(driver, PageLinks.class);
		CreateUserPage createUserPage = PageFactory.initElements(driver, CreateUserPage.class);
		UserLoginPage userLoginPage = PageFactory.initElements(driver, UserLoginPage.class);
		
		website.addUser();
		createUserPage.CreateUser("fdgghgfhgf", "dfgdfg");
		website.loginUser();
		userLoginPage.loginUser("fdgghgfhgf", "dfgdfg");
		
		WebElement loginSucessfulText = driver.findElement(By.xpath(("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")));
		assertEquals("**Successful Login**", loginSucessfulText.getText());
	}
	
	@AfterAll
	public void tearDown()
	{
		driver.close();
	}

}
