package org.test.login;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitFacebook {
	public static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "D:\\Mani\\GreensTech\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void afterClass() {
		driver.quit();
	}

	@Before
	public void beforeMethod() {
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void afterMethod() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void test1() {
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("JAVA");
		String name = txtUserName.getAttribute("value");
		Assert.assertEquals("JAVA",  name);
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("Greens");
		String name1 = txtPassword.getAttribute("value");
		Assert.assertEquals("Greens", name1);
		WebElement btnClick = driver.findElement(By.xpath("//input[@value='Log In']"));
		btnClick.click();
		Assert.assertTrue(true);
		Assert.assertTrue(true);

	}

	

	@Test
	public void test2() {
		System.out.println("done");
	}

}
