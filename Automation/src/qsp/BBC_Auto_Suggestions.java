package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBC_Auto_Suggestions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
	
		List<WebElement> allsugg = driver.findElements(By.xpath("(//span [@ class='top-list-item__bullet'])/../h3"));
     int count = allsugg.size();
    // System.out.println(count);
     
     for (int i = 0; i < count; i++) {
		String text=allsugg.get(i).getText();
		System.out.println(text);
	}
     
     driver.quit();
	}

}
