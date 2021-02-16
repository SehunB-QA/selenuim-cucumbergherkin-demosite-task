package com.qa.selenuimtests.pagelinks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageLinks {

	public PageLinks(WebDriver driver) {
		
		
	}
	@FindBy(xpath= "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")
	private WebElement addUserLink;
	
	@FindBy(xpath= "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
	private WebElement loginUserLink;

	
	
	public void addUser()
	{
		addUserLink.click();
	}
	
	public void loginUser()
	{
		loginUserLink.click();
	}
}
