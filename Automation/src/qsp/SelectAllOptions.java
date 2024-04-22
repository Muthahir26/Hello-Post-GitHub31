package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/muthahir/OneDrive/Desktop/Hotel.html");
		WebElement slvlb = driver.findElement(By.id("slv"));
		Select s=new Select(slvlb);
		String text = s.getWrappedElement().getText();
		System.out.println(text);
	}

}
