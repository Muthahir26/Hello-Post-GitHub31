package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoB {
	
	public static void main(String[] args) {
	 WebDriver driver =new ChromeDriver();
     DemoA.testA(driver);
     EdgeDriver driver1= new EdgeDriver();
     DemoA.testA(driver1);
     //WebDriver driver2= new FirefoxDriver();
     driver.close();
     }

}
