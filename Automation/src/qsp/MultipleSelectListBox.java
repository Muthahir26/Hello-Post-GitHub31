package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectListBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/muthahir/OneDrive/Desktop/Hotel.html");
		WebElement slvlb = driver.findElement(By.id("slv"));
		Select s=new Select(slvlb);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("v");
		Thread.sleep(3000);
		s.selectByVisibleText("dosa");
		Thread.sleep(3000);
		s.deselectByIndex(2);
		Thread.sleep(3000);
		s.deselectByValue("d");
		Thread.sleep(3000);
		s.deselectByVisibleText("idly");
		Thread.sleep(3000);
		System.out.println(s.isMultiple());
   driver.quit();
	}

}
