package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerLoginPageConfirmation {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement resource = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(resource).perform();
		
		driver.findElement(By.partialLinkText("Customers")).click();
		//Thread.sleep(2000);
		WebElement wb = driver.findElement(By.id("login"));
		a.doubleClick(wb).perform();
		//Thread.sleep(2000);
	    String title = driver.getTitle();
	    //Thread.sleep(2000);
	    //System.out.println(title);
	    if(title.equals("Login - Vtiger")) {
	    	System.out.println("Login page is displayed");
	    }
	    else
	    	System.out.println("Login page is not displayed");
	    
	    driver.close();
	}

}
