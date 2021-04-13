package org.samp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class SecondAdactin extends BaseClass{
	public SecondAdactin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radio ;
	@FindBy(id="continue")
	private WebElement cont ;
	@FindBy(id="first_name")
	private WebElement first ;
	@FindBy(id="last_name")
	private WebElement last ;
	@FindBy(id="address")
	private WebElement address ;
	@FindBy(xpath="(//input[@type='text'])[13]")
	private WebElement cardNo ;
	@FindBy(id="cc_type")
	private WebElement cardType ;
	@FindBy(id="cc_exp_month")
	private WebElement expMonth ;
	@FindBy(id="cc_exp_year")
	private WebElement expYear ;
	@FindBy(id="cc_cvv")
	private WebElement cvv ;
	@FindBy(id="book_now")
	private WebElement book ;
	@FindBy(name="order_no")
	private WebElement order ;
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getCont() {
		return cont;
	}
	public WebElement getFirst() {
		return first;
	}
	public WebElement getLast() {
		return last;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardNo() {
		return cardNo;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getExpMonth() {
		return expMonth;
	}
	public WebElement getExpYear() {
		return expYear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook() {
		return book;
	}
	public WebElement getOrder() {
		return order;
	}
}
