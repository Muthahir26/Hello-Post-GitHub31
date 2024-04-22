package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1AutoSugg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("java");
		Thread.sleep(1000);
		List<WebElement> allsug = driver.findElements(By.xpath("//span [contains (text(),'java')]"));
       int count = allsug.size();
		for (int i = 0; i < count; i++) {
			String text = allsug.get(i).getText();
			System.out.println(text);
}
	}
}
