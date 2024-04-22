package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpilicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://online.actitime.com/sselenium/login.do");
	       driver.findElement(By.id("username")).sendKeys("admin@actitime.com");
	       driver.findElement(By.name("pwd")).sendKeys("manager");
	       driver.findElement(By.id("loginButton")).click();
	       
	       driver.findElement(By.linkText("Logout")).click();
	       driver.quit();

	}

}
