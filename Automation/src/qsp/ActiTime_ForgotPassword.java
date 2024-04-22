package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_ForgotPassword {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/sselenium/login.do");
        String text = driver.findElement(By.id("toPasswordRecoveryPageLink")).getText();
        System.out.println(text);
        driver.quit();
	}	

}
