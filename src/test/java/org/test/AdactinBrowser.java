package org.test;

import org.testng.annotations.*;

import org.samp.FirstAdactin;
import org.samp.LoginAdactin;
import org.samp.SecondAdactin;


public class AdactinBrowser extends BaseClass{
	@BeforeClass
	private void beforeClass() {
		launchBrowser("chrome");
		implicitWait();
		launchUrl("http://adactinhotelapp.com/");
	}
	@AfterClass
	private void afterClass() {
		//quitBrowser();
	}
	@Test
	private void test() {
		LoginAdactin l=new LoginAdactin();
		fillTextBox(l.getUser(), "achuhari2928");
		fillTextBox(l.getPass(), "harshitha");
		btnClick(l.getLog());
		
		FirstAdactin f=new FirstAdactin();
		
		selectByIndex(f.getLocation(),2);
		selectByIndex(f.getHotel(),1);
		selectByIndex(f.getRoom(),3);
		byValue(f.getRoomNo(), "4");
		clear(f.getDateIn());
		fillTextBox(f.getDateIn(), "28/03/2021");
		clear(f.getDateout());
		fillTextBox(f.getDateout(), "29/03/2021");
		selectByIndex(f.getAdultRoom(), 2);
		selectByIndex(f.getChild(), 3);
		btnClick(f.getSearch());
		
		SecondAdactin s=new SecondAdactin();
		
		btnClick(s.getRadio());
		btnClick(s.getCont());
		fillTextBox(s.getFirst(), "Hari");
		fillTextBox(s.getLast(), "haran");
		fillTextBox(s.getAddress(), "chennai");
		fillTextBox(s.getCardNo(), "2345 6789 0123 5678");
		selectByIndex(s.getCardType(), 2);
		selectByIndex(s.getExpMonth(), 5);
		selectByIndex(s.getExpYear(), 11);
		fillTextBox(s.getCvv(), "567");
		btnClick(s.getBook());
		System.out.println(getAttri(s.getOrder())); 
	}
}
