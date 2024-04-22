package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_DoB {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	      driver.findElement(By.linkText("Create new account")).click();
	      Thread.sleep(4000);
	      WebElement daylb = driver.findElement(By.id("day"));
	      Select s1=new Select(daylb);
	      s1.selectByIndex(25);
	      
	      WebElement monthlb = driver.findElement(By.id("month"));
	      Select s2=new Select(monthlb);
	      s2.selectByValue("6");
	      
	      WebElement yearlb = driver.findElement(By.id("year"));
	      Select s3=new Select(yearlb);
	      s3.selectByVisibleText("1996");
	     
	}
}
