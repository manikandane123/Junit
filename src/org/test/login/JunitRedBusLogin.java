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
import org.test.base.JunitBase;

public class JunitRedBusLogin extends JunitBase {
	public static WebDriver driver;
	JunitBase bb = new JunitBase();

	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\Mani\\GreensTech\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void afterClass() {
//		driver.quit();

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
	public void test1() throws InterruptedException {
		WebElement signIcon = driver.findElement(By.id("signin-block"));
		bb.btnClick(signIcon);
		WebElement signInSignUp = driver.findElement(By.id("signInLink"));
		bb.btnClick(signInSignUp);
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.className("modalIframe")));
		WebElement signUpEmail = driver.findElement(By.xpath("//button[text()='signup with email']"));
		bb.btnClick(signUpEmail);
		WebElement emailId=driver.findElement(By.id("emailID"));
		bb.userNamePassword(emailId, "mani");
		WebElement emailPassword=driver.findElement(By.xpath("(//input[@id='password'])[2]"));
		bb.userNamePassword(emailPassword, "mani");
		String name = emailId.getAttribute("value");
		Assert.assertEquals("mani", name);
		String pass = emailPassword.getAttribute("value");
		Assert.assertEquals("mani", pass);
	}

	@Test
	public void test2() {
		
		System.out.println("done");
	}

}
