package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAllUrlGoogle {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("wipro jobs");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		Thread.sleep(2000);
        List<WebElement> allwebs = driver.findElements(By.tagName("a"));
	    for (int i = 1; i < allwebs.size(); i++) {
	    	
			String allText = allwebs.get(i).getAttribute("href");
			System.out.println(allText);
		}
	    driver.quit();
	}

}
