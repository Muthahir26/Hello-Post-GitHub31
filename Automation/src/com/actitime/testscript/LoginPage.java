package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
   private WebElement untb;
   private WebElement pwtb;
   private WebElement lgBtn;

   public LoginPage(WebDriver driver){
	   untb=driver.findElement(By.name("username"));
	   pwtb = driver.findElement(By.name("pwd"));
	   lgBtn = driver.findElement(By.xpath("//div [.='Login ']"));
	   
   }
   public void setLogin(String un,String pw) {
	   untb.sendKeys(un);
	   pwtb.sendKeys(pw);
	   lgBtn.click();
   }
}
