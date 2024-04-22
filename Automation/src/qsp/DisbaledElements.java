package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;

public class DisbaledElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/muthahir/OneDrive/Desktop/Login.html");
        driver.findElement(By.id("d1")).sendKeys("admin");
        Thread.sleep(2000);
      //  driver.findElement(By.id("d2")).sendKeys("manager");
        RemoteWebDriver r= (RemoteWebDriver)driver;
        r.executeScript("document.getElementById(\"d2\").value='manager'");
        Thread.sleep(2000);
        r.executeScript("document.getElementById(\"d2\").value=''");
        Thread.sleep(2000);
        r.executeScript("document.getElementById(\"d3\").click");
	}

}
