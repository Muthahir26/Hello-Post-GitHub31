package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1PrintAllOptionsSlv {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/muthahir/OneDrive/Desktop/Hotel.html");
		List<WebElement> allopt = driver.findElements(By.id("slv"));
		
		for (int i = 0; i < allopt.size(); i++) {
			String text = allopt.get(i).getText();
			System.out.println(text);	
		}
		driver.quit();
	}

}
