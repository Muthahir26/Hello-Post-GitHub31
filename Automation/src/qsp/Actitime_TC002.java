package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_TC002 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div [.='TASKS']")).click();
		driver.findElement(By.xpath("//div [.='Add New']")).click();
		driver.findElement(By.xpath("//div [.='+ New Project']")).click();
        driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("HDFC Bank");
        driver.findElement(By.xpath("//button [contains(text(),'-- Please Select Customer')]")).click();
        driver.findElement(By.xpath("//a[text()='hdfc_001']")).click();
        driver.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("HDFC Pvt Ltd");
        driver.findElement(By.xpath("//div [.='Create Project']")).click();
         String actRes = driver.findElement(By.xpath("//div [.='HDFC Bank']")).getText();
         String expRes="HDFC Bank";
         if(actRes.equals(expRes)) {
        	 System.out.println("Passed");
         }
         else 
         {
        	 System.out.println("Failed");
         }
         driver.findElement(By.id("logoutLink")).click();
         
         
         
         
         
         
         
         
         
         
         
         
         
         driver.quit();
	}

}
