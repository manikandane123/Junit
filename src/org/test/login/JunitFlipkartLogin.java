package org.test.login;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.test.base.JunitBase;
import org.test.base.JunitLoginPOM;

public class JunitFlipkartLogin {

	static JunitBase ju = new JunitBase();

	@BeforeClass
	public static void beforeClass() {

		ju.getDriver("https://www.flipkart.com/account/login");

	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

	@Before
	public void beforeMethod() {
		System.out.println("Before Method");
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void afterMethod() {
		System.out.println("After Method");
		Date d = new Date();
		System.out.println(d);

	}

	@Test
	public void test1() {
		System.out.println("Test1");
		JunitLoginPOM pagePOM = new JunitLoginPOM();
		ju.userNamePassword(pagePOM.getEmailorMobileNo(), "9790097990");
		ju.userNamePassword(pagePOM.getLoginPassword(), "Mani@12345");
	
	}

	@Test
	public void test2() {
		System.out.println("Test2");
		System.out.println("done");
	}

}
