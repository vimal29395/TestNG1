package org.samp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class FirstAdactin extends BaseClass{
	public FirstAdactin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement room;
	@FindBy(id="room_nos")
	private WebElement roomNo;
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	@FindBy(id="child_room")
	private WebElement child ;
	@FindBy(id="datepick_in")
	private WebElement dateIn;
	@FindBy(id="datepick_out")
	private WebElement dateout;
	@FindBy(id="Submit")
	private WebElement search;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getRoomNo() {
		return roomNo;
	}
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getDateIn() {
		return dateIn;
	}
	public WebElement getDateout() {
		return dateout;
	}
	public WebElement getSearch() {
		return search;
	}
}
