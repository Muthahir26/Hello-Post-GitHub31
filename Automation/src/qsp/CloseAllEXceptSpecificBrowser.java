package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllEXceptSpecificBrowser {

	public static void main(String[] args) {
		System.out.println("Enter the title to close the browser");
		Scanner sc=new Scanner(System.in);
		String etitle=sc.nextLine();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://secure.indeed.com/");
		  driver.findElement(By.id("login-google-button")).click();
		  driver.findElement(By.id("apple-signin-button")).click();
		  Set<String> allWh = driver.getWindowHandles();
		  
		  for (String wh : allWh) {
			 driver.switchTo().window(wh);
			 String atitle = driver.getTitle();
			if(atitle.contains(etitle)) {
			}
			else {
				driver.close();
		}
	}	}
	}
