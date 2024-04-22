package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollVerticalBbc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("close")).click();
		Actions a=new Actions(driver);
		//1st Assignment Logic
		a.scrollByAmount(0, 3000).perform();
       
		Thread.sleep(3000);
        //2nd Assignment Logic		
		WebElement wb = driver.findElement(By.xpath("(//h2 [@ data-testid='montana-title'])[2]"));
		 a.scrollToElement(wb).perform();      
	}

}
