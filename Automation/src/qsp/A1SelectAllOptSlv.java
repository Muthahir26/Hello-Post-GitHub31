package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A1SelectAllOptSlv {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/muthahir/OneDrive/Desktop/Hotel.html");
		 WebElement slvlist = driver.findElement(By.id("slv"));

         Select s=new Select(slvlist);
         List<WebElement> allopt = s.getOptions();
         
         for (int i = 0; i < allopt.size(); i++) {
        	 Thread.sleep(500);
			s.selectByIndex(i);
		}
         for (int i = (allopt.size())-1; i >0 ; i--) {
        	 Thread.sleep(500);
 			s.deselectByIndex(i);
 		}
	}

}
