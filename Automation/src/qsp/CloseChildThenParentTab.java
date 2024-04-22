package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildThenParentTab {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://secure.indeed.com/");
		  driver.findElement(By.id("login-google-button")).click();
		  driver.findElement(By.id("apple-signin-button")).click();
		  Set<String> wh = driver.getWindowHandles();
		  
		  Iterator<String> it = wh.iterator();
		  String pid = it.next();
		  String cwid1 = it.next();
		  String cwid2= it.next();
		 
		 Thread.sleep(3000);
		 
		 driver.switchTo().window(cwid1).close();
		 driver.switchTo().window(cwid2).close();
		 driver.switchTo().window(pid).close();
		}

}
