package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
     WebDriver a=new ChromeDriver();
     a.get("https://www.youtube.com/");
     String title=a.getTitle();
     System.out.println(title);
     a.close();
	}

}
