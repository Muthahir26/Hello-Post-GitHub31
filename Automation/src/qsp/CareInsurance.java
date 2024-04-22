package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsurance {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement monthlb = driver.findElement(By.xpath("//select[@ class='ui-datepicker-month']"));
	    Select s1=new Select(monthlb);
	    s1.selectByIndex(5);
	    WebElement yearlb = driver.findElement(By.xpath("//select[@ class='ui-datepicker-year']"));
	    Select s2=new Select(yearlb);
	    s2.selectByValue("1996");
	    driver.findElement(By.xpath("//a[@ data-date='26']")).click();
	    driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
	    driver.findElement(By.id("renew_policy_submit")).click();
	    boolean text = driver.findElement(By.id("policynumberError")).isDisplayed();
	    
	    if(text==true)
	    {
	    	System.out.println("Please enter valid Policy No. is displayed & Passed");
	    }
	    else
	    {
	    	System.out.println("Please enter valid Policy No. is not displayed & Failed");
	    }
	    driver.quit();  
	}

}
