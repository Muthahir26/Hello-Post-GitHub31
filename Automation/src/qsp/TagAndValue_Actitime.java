package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagAndValue_Actitime {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/sselenium/login.do");
       
        System.out.println(driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName());
        System.out.println(driver.findElement(By.id("toPasswordRecoveryPageLink")).getAttribute("href"));
        driver.quit();

	}

}
