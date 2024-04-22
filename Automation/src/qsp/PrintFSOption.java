package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFSOption {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/muthahir/OneDrive/Desktop/Hotel.html");
		WebElement mtrlb = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlb);
		WebElement fso = s.getFirstSelectedOption();
		String text = fso.getText();
		System.out.println(text);
   //driver.quit();
	}

}
