package org.samp;

//import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class LoginFindBy extends BaseClass{
	public LoginFindBy() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@name='email']")})
	//private List<WebElement> user;
	private WebElement user;

	@FindAll({@FindBy(id="pass"),@FindBy(xpath="//input[@name='password']")})
	private WebElement password;
	@FindBy(name="login")
	private WebElement log;
	//public List<WebElement> getUser() {
		public WebElement getUser() {
		return user;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLog() {
		return log;
	}
	public void login(String user,String pass)
	{
		//fillTextBox(getUser().get(0),user);
		fillTextBox(getUser(),user);
		fillTextBox(getPassword(),pass);
		btnClick(getLog());
	}	
}
