package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethodCls {
	@Test
	public void validLogin() {
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost/login.do");
		LoginPagePoM l=new LoginPagePoM(driver);
		l.setLogin("admin", "manager");
	}

}
