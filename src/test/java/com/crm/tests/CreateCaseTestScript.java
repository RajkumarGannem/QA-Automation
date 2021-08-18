package com.crm.tests;

import java.util.List;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.CaseService;
import com.crm.services.HomeService;
import com.crm.services.LoginService;
import com.crm.validators.CreateCaseValidators;

public class CreateCaseTestScript {
	
	LoginService loginService = null;
	HomeService homeService = null;
	CaseService caseService = null;
	CreateCaseValidators caseValidator = null;
	
	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;
	
	static ExtentTest elogger;
	static ExtentReports extent = new ExtentReports();

	
	@BeforeClass
	public void init() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("Reports//crm-test-result.html");
		
		extent.setSystemInfo("OS Name", "Windows");
		extent.setSystemInfo("Environment", "QA");
		reporter.config().setDocumentTitle("Crm Automation Test Report for QA Environment");
		extent.attachReporter(reporter);
		elogger = extent.createTest("Crm Automation Test Cases");
		
		loginService = new LoginService();
		homeService = new HomeService();
		caseService = new CaseService();
		caseValidator = new CreateCaseValidators();

		crmLoginData = CrmTestData.getTestData();
		appData = crmLoginData.getCrmlogindata();

		
		InitializeViews.init();
	} 
	
	@AfterClass
	public void tearDown() {
		BrowserDriver.getCurrentDriver().quit();
		extent.flush();
	}
	
	@AfterMethod
	public void getResult(ITestResult result) {
		 if(result.getStatus() == ITestResult.FAILURE) {
				elogger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case Failed due to below issue", ExtentColor.RED));
				elogger.fail(result.getThrowable());
		    }else if (result.getStatus() == ITestResult.SUCCESS) {
		    	elogger.log(Status.PASS,
		    	MarkupHelper.createLabel(result.getName() + "Test Case PASSED", ExtentColor.GREEN));
		    }else {
		    	elogger.log(Status.SKIP, 
	    		MarkupHelper.createLabel(result.getName() + "Test Case Skipped", ExtentColor.ORANGE));
		    	elogger.skip(result.getThrowable());
		    }	
	}
		
		@Test(description = "This textcase creates case with all detials", priority =0)
		public  void createCaseWithDetails() throws InterruptedException {
			
			BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
			loginService.loginToApplication(appData.get(0).getUsername(), appData.get(0).getPassword());
			
//			homeService.clickOnAccountsTab();
			homeService.ClickonCaseTab();
			caseService.clickOnCreateCase();
			caseService.insertCaseName(appData.get(0).getCaseName());
			caseService.selectCaseStatus();
			caseService.SelectCaseAccount();
			caseService.SelectProirity();
			caseService.SelectCaseContact();
			caseService.SelectProirity();
			caseService.SelectType();
			caseService.WriteDescription(appData.get(0).getDescription());
			caseService.saveAccount();
			
	//		caseService.EditTheAccount();
	//		caseService.EditedAccountName();
	//		caseService.saveAccount();

	//		caseService.DeleteAccount();
			
//			homeService.clickOnCasesTab();
//			caseService.getCreatedACcountName();
			
		//	caseValidator.validateAccountName(caseService);
            elogger.pass("Test Case is Passed");
			
		}
		
		@Test(description = "This textcase creates case with valid information", priority =1)
		public  void createCaseWithDetailsandinfo() throws InterruptedException {
			
			
//			homeService.clickOnAccountsTab();
			homeService.ClickonCaseTab();
			caseService.clickOnCreateCase();
			caseService.insertCaseName(appData.get(0).getCaseName());
			caseService.selectCaseStatus();
//			caseService.SelectCaseAccount();
			caseService.SelectProirity();
//			caseService.SelectCaseContact();
			caseService.SelectProirity();
			caseService.SelectType();
			caseService.WriteDescription(appData.get(0).getDescription());
			caseService.saveAccount();
			
			elogger.pass("Test Case with only details is passed");
		}
		
		@Test(description = "This textcase creates case with valid information", priority =2)
		public  void createCaseWithDetailsandinfo1() throws InterruptedException {
			
			
			homeService.ClickonCaseTab();
			caseService.clickOnCreateCase();
			caseService.insertCaseName(appData.get(0).getCaseName());
			caseService.selectCaseStatus();
			caseService.SelectCaseAccount();
			caseService.SelectProirity();
			caseService.SelectProirity();
			caseService.SelectType();
			caseService.WriteDescription(appData.get(0).getDescription());
			caseService.saveAccount();
			
			elogger.pass("Test Case with only details is passed");
		}
}

