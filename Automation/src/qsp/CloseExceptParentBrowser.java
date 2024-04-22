package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseExceptParentBrowser {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		 driver.findElement(By.id("login-google-button")).click();
		  driver.findElement(By.id("apple-signin-button")).click();
		  String pwd = driver.getWindowHandle();
		  Set<String> allWh = driver.getWindowHandles();
		  
		  for (String wh : allWh) {
			  driver.switchTo().window(wh);
			  
			  if(pwd.equals(wh)) {
				 
			  }
			  else
			  {
				  driver.close();
			  }
			
		}
	}

}
