package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Radio_Buttons {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		int a = driver.findElement(By.xpath("(//input [@ name='sex'])[1]")).getLocation().getY();
		int b = driver.findElement(By.xpath("(//input [@ name='sex'])[2]")).getLocation().getY();
		int c = driver.findElement(By.xpath("(//input [@ name='sex'])[3]")).getLocation().getY();
		
		if(a==b&&b==c) {
			System.out.println("All the 3 radio buttons are aligned properly and Passed");
		}
		else {
			System.out.println("All the 3 radio buttons are not aligned properly and Failed");
		}
		driver.quit();
	}

}
