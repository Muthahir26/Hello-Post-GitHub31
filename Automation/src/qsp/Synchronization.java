package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver=new ChromeDriver();
       driver.get("https://online.actitime.com/sselenium/login.do");
       driver.findElement(By.id("username")).sendKeys("admin@actitime.com");
       driver.findElement(By.name("pwd")).sendKeys("manager");
       driver.findElement(By.id("loginButton")).click();
       //Thread.sleep(4000);
       driver.findElement(By.linkText("Logout")).click();
       driver.quit();
	}

}
