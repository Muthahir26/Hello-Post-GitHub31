package qsp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateOption {

	public static void main(String[] args) {
	    WebDriver driver=new ChromeDriver();
	     driver.get("file:///C:/Users/muthahir/OneDrive/Desktop/Hotel.html");
	     WebElement slvlb = driver.findElement(By.id("slv"));
	     Select s=new Select(slvlb);
	     List<WebElement> allopt = s.getOptions();
	     
	     ArrayList<String> al=new ArrayList<String>();
	     for (int i = 0; i < allopt.size(); i++) {
			String text=allopt.get(i).getText();
			al.add(text);
		}for(String option:al)
		{
			System.out.println(option);
		}
	}

}
