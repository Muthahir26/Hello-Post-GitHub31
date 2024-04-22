package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://online.actitime.com/sselenium/login.do");
	       driver.findElement(By.id("username")).sendKeys("admin@actitime.com");
	       driver.findElement(By.name("pwd")).sendKeys("manager");
	       driver.findElement(By.id("loginButton")).click();
	       
	       //driver.findElement(By.linkText("Logout")).click();
	       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	       wait.until(ExpectedConditions.titleContains("Enter"));
	       String title=driver.getTitle();
	       System.out.println(title);
	       driver.quit();
	}

}
