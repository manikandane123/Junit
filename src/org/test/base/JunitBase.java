package org.test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitBase  {
	public static WebDriver driver;
	public WebDriver getDriver(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\Mani\\GreensTech\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	

	public void btnClick(WebElement signIcon) {
		signIcon.click();
	}

	public void userNamePassword(WebElement emailId, String string) {
		emailId.sendKeys(string);
	}

}
