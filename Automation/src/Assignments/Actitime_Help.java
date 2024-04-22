package Assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_Help {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.get("http://localhost/login.do");
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.id("loginButton")).click();
	    driver.findElement(By.xpath("//div [@ class='popup_menu_icon support_icon']/../div [ contains( text(),'Help')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("About your actiTIME")).click();
	    Thread.sleep(1000);
     driver.findElement(By.linkText("Read License Agreement")).click();
     Thread.sleep(1000);
     Set<String> allWh = driver.getWindowHandles();
    
      List<String> WinID=new ArrayList(allWh);
     String pwid=WinID.get(0);
     String cwid=WinID.get(1);
         
      //System.out.println(pwid);
      //System.out.println(cwid);
      driver.switchTo().window(cwid);
     
      String title = driver.getTitle();
      System.out.println(title);
         
   List<WebElement> allsug = driver.findElements(By.xpath("//h2"));
   if(title.contains("License")) {
		 for (int i = 0; i < allsug.size(); i++) {
			 Thread.sleep(1000);
				String text=allsug.get(i).getText();
				System.out.println(text);
			}
		 driver.quit();
	}

}}

