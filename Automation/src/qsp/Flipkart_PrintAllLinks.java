package qsp;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart_PrintAllLinks {

	public static void main(String[] args) {
		System.out.println("Enter the URL");
		Scanner s=new Scanner(System.in);
		String url=s.nextLine();
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		int count = alllinks.size();
		System.out.println(count);
		
		for (int i = 0; i < count; i++) {
			String text = alllinks.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
	}

}
