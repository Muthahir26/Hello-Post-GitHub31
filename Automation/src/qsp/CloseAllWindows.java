package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllWindows {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://secure.indeed.com/");
	 driver.findElement(By.id("login-google-button")).click();
	 driver.findElement(By.id("apple-signin-button")).click();
	  Set<String> allWh = driver.getWindowHandles();
	 //int count=allWh.size();
	// System.out.println(count);
	 for (String wh : allWh) {
		 Thread.sleep(1000);
		 driver.switchTo().window(wh);
		//System.out.println(wh);
		driver.close();
	}
	}

}
