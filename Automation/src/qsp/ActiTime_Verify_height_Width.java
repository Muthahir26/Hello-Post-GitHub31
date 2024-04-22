package qsp;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ResourceBundle.Control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//public class ActiTime_Verify_height_Width {
//
//	public static void main(String[] args) {
//      WebDriver driver=new ChromeDriver();
//      driver.get("https://online.actitime.com/sselenium/login.do");
//      WebElement un=driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"A");
//      int h1 = un.getSize().getHeight();
//      int w1 = un.getSize().getWidth();
//      
//      WebElement pwd=driver.findElement(By.name("pwd"));
//      int h2 = pwd.getSize().getHeight();
//      int w2 = pwd.getSize().getWidth();
//      
//      if(h1==h2&&w1==w2)
//    	  System.out.println("Height & Width of UN & Pwd is equal & Passed");
//      else
//    	  System.out.println("Height & Width of UN & Pwd unequal & Fail");
//	
//      driver.quit();
//	}
//
//}
