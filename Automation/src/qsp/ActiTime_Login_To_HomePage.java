package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_Login_To_HomePage {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
		       driver.get("http://localhost/login.do");
		       driver.findElement(By.id("username")).sendKeys("admin");
		       driver.findElement(By.name("pwd")).sendKeys("manager");
		       Thread.sleep(3000);
		       driver.findElement(By.linkText("Login")).click();
		       Thread.sleep(3000);
		driver.quit();
	}}
	


