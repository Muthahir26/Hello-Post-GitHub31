package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Un_Pwd_Alignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int x1 = driver.findElement(By.name("email")).getLocation().getX();
		int x2 = driver.findElement(By.name("pass")).getLocation().getX();
		if(x1==x2)
     System.out.println("UN & Pwd is aligned & Passed");
		
		else
			System.out.println("UN & Pwd is not aligned & Fail");
		System.out.println(x1);
		System.out.println(x2);
		driver.quit();
	}

}
