
package org.test.login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitSample {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before Class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after Class");
	}

	@Before
	public void beforeMethod() {
		System.out.println("before Method");
	}

	@After
	public void afterMethod() {
		System.out.println("after Method");
	}

	@Test
	public void test1() {
		System.out.println("Test1");
	}

	@Test
	public void test2() {
		System.out.println("Test2");

	}

}
