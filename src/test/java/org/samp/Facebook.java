package org.samp;

import org.samp.LoginFindBy;
import org.test.BaseClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook extends BaseClass {
	@Parameters({"username","password"})
	@Test
	private void test1(String user,String pass) {

		launchBrowser("chrome");
		launchUrl("https://www.facebook.com/");
		LoginFindBy b=new LoginFindBy();
		fillTextBox(b.getUser(), user);
		fillTextBox(b.getPassword(),pass);
		btnClick(b.getLog());

	}
}	

