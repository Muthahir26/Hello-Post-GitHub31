package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopupText {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
         driver.get("https://demo.automationtesting.in/Alerts.html");
         driver.findElement(By.xpath("//a [text()='Alert with OK & Cancel ']")).click();   
         driver.findElement(By.xpath("//button [@ class='btn btn-primary']")).click();
         driver.switchTo().alert().dismiss();
   
          boolean text = driver.findElement(By.xpath("//p[text()='You Pressed Cancel']")).isDisplayed();
       
         if(text==true) {
        	 System.out.println("You Pressed Cancel is displayed and Passed");
         }	 
         else
         {
        	 System.out.println("You Pressed Cancel is not displayed and Failed");
         }
         driver.quit();
         

	}

}
