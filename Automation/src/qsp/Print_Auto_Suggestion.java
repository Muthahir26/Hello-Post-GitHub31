package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Auto_Suggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb")).sendKeys("Java");
		Thread.sleep(3000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//span [contains (text(),'java')]"));
     int count = allsugg.size();
     System.out.println(count);
     
     for (int i = 0; i < count; i++) {
		String text=allsugg.get(i).getText();
		System.out.println(text);
	}
     allsugg.get(0).click();
     Thread.sleep(3000);
     driver.quit();
	}

}
