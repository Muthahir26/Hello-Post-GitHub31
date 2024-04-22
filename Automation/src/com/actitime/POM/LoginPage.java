package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="username")
	private WebElement untb;

	@FindBy(name="pwd")
	private WebElement pwtb;

	@FindBy(xpath="//div [.='Login ']")
	private WebElement lgBtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setLogin(String un,String pw) {
		untb.sendKeys(un);
		pwtb.sendKeys(pw);
		lgBtn.click();
	}

}
