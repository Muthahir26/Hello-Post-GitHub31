package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_VerifyLoginButton {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean login = driver.findElement(By.xpath("//button [@ name=\"login\"]")).isEnabled();
		
		if(login==true)
System.out.println("Login button is displayed & Passed");
		
		else
			System.out.println("Login button is displayed & Fail");
		
		driver.close();
	}

}
