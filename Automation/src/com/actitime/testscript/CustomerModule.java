package com.actitime.testscript;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.HomePage;
import com.actitime.POM.TaskListPage;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass  {
	
    @Test
    public void createCustomer() throws EncryptedDocumentException, IOException {
    	Reporter.log("createCustomer",true);
    	FileLib f=new FileLib();
    	String customerName = f.getExcelData("CreateCustomer", 1, 3);
    	String customerDescription = f.getExcelData("CreateCustomer", 1, 4);
    	HomePage h=new HomePage(driver);
    	h.setTaskTab();
    	TaskListPage t=new TaskListPage(driver);
    	t.getAddNewBtn().click();
    	t.getNewCustomerOption().click();
    	t.getEnterCustomerNameTbx().sendKeys(customerName);
    	t.getCustomerDescriptionTbx().sendKeys(customerDescription);
    	t.getSelectDD().click();
    	t.getOurCompanyOption().click();
    	t.getCreateCustomerBtn().click();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.textToBePresentInElement(t.getVerifyCustomerName(),customerName));
    String actualCustomer = t.getVerifyCustomerName().getText();
    Assert.assertEquals(actualCustomer, customerName);
    	}	
    }