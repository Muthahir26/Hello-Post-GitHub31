package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPOM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement untb = driver.findElement(By.name("username"));
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		untb.sendKeys("admin");
		
	}

}
