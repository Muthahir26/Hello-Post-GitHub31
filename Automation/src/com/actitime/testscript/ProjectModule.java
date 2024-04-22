package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule extends BaseClass {
	    @Test(groups="SmokeTest")
	    public void createProject() {
	    	Reporter.log("createProject",true);
	    }
	    @Test
	    public void modifyProject() {
	    	Reporter.log("modifyProject",true);
	    }
	    @Test
	    public void deleteProject() {
	    	Reporter.log("deleteProject",true);
	    }
}
