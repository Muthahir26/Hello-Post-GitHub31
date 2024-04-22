package qsp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOnlyDuplicates {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	     driver.get("file:///C:/Users/muthahir/OneDrive/Desktop/Hotel.html");
	     WebElement slvlb = driver.findElement(By.id("slv"));
	     Select s=new Select(slvlb);
	     List<WebElement> allopt = s.getOptions();
   	     HashSet<String> hs = new HashSet<String>();
	     for (int i = 0; i < allopt.size(); i++) {
			 String text = allopt.get(i).getText();
		 if(hs.add(text)==false)
		 {
			System.out.println(text); 
		 }
		}
	}
}
