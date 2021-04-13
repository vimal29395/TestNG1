package org.task;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.test.BaseClass;
	public class FlipLogin extends BaseClass {

		public FlipLogin() {
			PageFactory.initElements(driver, this);
		}
				
		@FindBy(xpath="(//input[@type='text'])[2]")
		private WebElement user;
		
		@FindBy(xpath="(//input[@type='password'])[1]")
		private WebElement pass;
		
		@FindBy(xpath="(//button[@type='submit'])[2]")
		private WebElement log;
		
		@FindBy(name="q")
		private WebElement search;
		
		@FindBy(xpath="(//a[@class='_1fQZEK'])[1]")
		private WebElement mobile;
		
		public WebElement getMobile() {
			return mobile;
		}

		public WebElement getSearch() {
			return search;
		}

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

