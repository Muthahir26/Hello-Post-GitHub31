package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHover {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement resource = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(resource).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		String phNo = driver.findElement(By.xpath("//p [contains (text(),'Bengaluru')]/../p[2]")).getText();
	    System.out.println(phNo);
	    driver.close();
	
	}

}
