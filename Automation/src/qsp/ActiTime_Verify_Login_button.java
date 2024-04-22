package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_Verify_Login_button {

	public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
       driver.get("https://online.actitime.com/sselenium/login.do");
        int x = driver.findElement(By.id("loginButton")).getLocation().getX();
        int y = driver.findElement(By.id("loginButton")).getLocation().getY();

        System.out.println(x);
        System.out.println(y);
        driver.quit();
    }

}
