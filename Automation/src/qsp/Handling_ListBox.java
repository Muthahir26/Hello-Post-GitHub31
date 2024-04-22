
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_ListBox {

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.findElement(By.linkText("Create new account")).click();
      Thread.sleep(4000);
      WebElement dayListbox = driver.findElement(By.id("day"));
      Select s=new Select(dayListbox);
      s.selectByIndex(10);
      Thread.sleep(4000);
      s.selectByValue("6");
      Thread.sleep(4000);
      s.selectByVisibleText("14");
      Thread.sleep(4000);
      //driver.quit();
      
	}

}
