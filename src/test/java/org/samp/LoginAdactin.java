package org.samp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class LoginAdactin extends BaseClass{
	public LoginAdactin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement user;
	@FindBy(id="password")   
	private WebElement pass;
	@FindBy(id="login")
	private WebElement log;
	
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLog() {
		return log;
	}
}
