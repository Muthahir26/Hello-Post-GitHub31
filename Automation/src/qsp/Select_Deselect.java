package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Deselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/muthahir/OneDrive/Desktop/Hotel.html");
		WebElement slvlb = driver.findElement(By.id("slv"));
		Select s=new Select(slvlb);
		List<WebElement> allopt = s.getOptions();
         int count=allopt.size();
         
         for (int i = 0; i < count; i++) {
        	 Thread.sleep(500);
			s.selectByIndex(i);
			}
         for (int i = count-1 ; i >=0 ; i--) {
        	 Thread.sleep(500);
			s.deselectByIndex(i);
		}
         driver.quit();
	}

}
