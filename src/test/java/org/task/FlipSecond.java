package org.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class FlipSecond extends BaseClass {
	public FlipSecond() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@type='button']")
	private  WebElement buy;
	public WebElement getBuy() {
		return buy;
	}
	
}
