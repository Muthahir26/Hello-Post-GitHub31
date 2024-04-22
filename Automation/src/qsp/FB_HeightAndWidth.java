package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_HeightAndWidth {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement login=driver.findElement(By.name("login"));
        System.out.println("Height :"+login.getSize().getHeight());
        System.out.println("Width :"+login.getSize().getWidth());
        driver.quit();
	}

}
