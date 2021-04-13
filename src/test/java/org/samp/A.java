package org.samp;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
	@Parameters({"username","password"})
	@Test
	private void testA(@Optional("Kumar")String user,@Optional("98765")String pass) {
		System.out.println("TestA");
		System.out.println(user);
		System.out.println(pass);

	}
	@Test
	private void testB() {
		System.out.println("TestB");

	}

}
