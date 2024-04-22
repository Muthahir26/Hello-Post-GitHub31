package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contents_WebTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/muthahir/OneDrive/Desktop/Book.html");
		List<WebElement> allcon = driver.findElements(By.xpath("(//td)"));
	     int count = allcon.size();
	     
	     System.out.println(count);
	     
	     for (int i = 0; i < count; i++) {
			String text=allcon.get(i).getText();
			System.out.println(text);
		}
	    
	     driver.quit();
	     
	}

}
