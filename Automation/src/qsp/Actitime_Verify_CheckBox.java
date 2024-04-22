package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_Verify_CheckBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	      driver.get("https://online.actitime.com/sselenium/login.do");
	      boolean status = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
          
	      if(status==true)
	    	  System.out.println("Check box is is selected & Passed");
	      
	      else
              System.out.println("Check box is not selected & Failed ");
	
	      driver.quit();
	}

}
