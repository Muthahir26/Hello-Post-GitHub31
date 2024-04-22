package qsp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChildBrowsers {

	
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://secure.indeed.com/");
	  driver.findElement(By.id("login-google-button")).click();
	  driver.findElement(By.id("apple-signin-button")).click();
	  Set<String> wh = driver.getWindowHandles();
	  
	  Iterator<String> it = wh.iterator();
	  String pid = it.next();
	  String cwid1 = it.next();
	  String cwid2= it.next();
	 
	/* List<String> whlist=new ArrayList(wh);	
	 String pw = whlist.get(0);
	 String cw1 = whlist.get(1);
	 String cw2 = whlist.get(2);
	 System.out.println(pw);
	 System.out.println(cw1);
	 System.out.println(cw2);*/
	 
	 Thread.sleep(3000);
	 
	 driver.switchTo().window(cwid1).close();
	 driver.switchTo().window(cwid2).close();
	 driver.switchTo().window(pid).close();
	}

}

