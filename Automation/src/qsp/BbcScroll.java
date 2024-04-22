package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BbcScroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		Thread.sleep(3000);
		//driver.findElement(By.id("close")).click();
		JavascriptExecutor j=(JavascriptExecutor) driver;
        j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		

	}

}
