package qsp;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoHelp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.get("http://localhost/login.do");
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.id("loginButton")).click();
	    String pw=driver.getWindowHandle();
	    driver.findElement(By.xpath("//div [@ class='popup_menu_icon support_icon']/../div [ contains( text(),'Help')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("About your actiTIME")).click();
	    Thread.sleep(1000);
     driver.findElement(By.linkText("Read License Agreement")).click();
     Thread.sleep(1000);
     Set<String> allWh = driver.getWindowHandles();
     
     for(String wh: allWh) {
    	 driver.switchTo().window(wh);
         if(pw.equals(wh)) {
        	
         }
         else {
          List<WebElement> allsug = driver.findElements(By.xpath("//h2"));
          int count = allsug.size();
          System.out.println(count);
       		 for (int i = 0; i < count; i++) {
       				String text=allsug.get(i).getText();
       				System.out.println(text);
         }
       		driver.close(); 
   			} driver.close();
         
     }
    
	}
	}