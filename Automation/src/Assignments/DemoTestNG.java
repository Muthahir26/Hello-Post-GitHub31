package Assignments;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNG {
    @Test
	public void demo() {
		Reporter.log("Welcome to TestNG", true);
	}
}
