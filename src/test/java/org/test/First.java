package org.test;

import org.testng.annotations.*;

public class First {
	@BeforeClass
	private void beforeClass() {
		System.out.println("Before class");
	}
	@AfterClass
	private void afterClass() {
		System.out.println("After class");
	}
	@AfterMethod
	private void afterMethod() {
		System.out.println("After Method");
	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Method");
	}
	@Test(priority=2)
	private void test1() {
		System.out.println("Test1");
	}
	@Test()
	private void test2() {
		System.out.println("Test2");
	}
	@Test(priority=1)
	private void test3() {
		System.out.println("Test3");
	}
}
