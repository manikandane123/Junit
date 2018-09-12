package org.test.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JunitLoginPOM extends JunitBase {
	public JunitLoginPOM() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//input[@class='_2zrpKA']")
	private WebElement emailorMobileNo;
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv']")
	private WebElement loginPassword;
	public WebElement getEmailorMobileNo() {
		return emailorMobileNo;
	}
	public WebElement getLoginPassword() {
		return loginPassword;
	}

	
	

}
