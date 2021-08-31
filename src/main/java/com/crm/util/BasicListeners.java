package com.crm.util;

import java.io.IOException;

import org.testng.IClass;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.config.BrowserDriver;

public class BasicListeners extends TestListenerAdapter {
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	@BeforeSuite
	public void setUp() {
		htmlReporter = new ExtentHtmlReporter("Reports//crm-test-result.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Host Name", "Rajkumar");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User Name", "RajkumarGannem");

		htmlReporter.config().setDocumentTitle("Crm Automation Testing Report");
		htmlReporter.config().setReportName("My Own Report");
		htmlReporter.config().setTheme(Theme.DARK);
	}

	@AfterMethod
	public void getResult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			BrowserDriver.takeScreenShot();
			htmlReporter.config().setAutoCreateRelativePathMedia(true);
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Test Case FAILED due to below issues:",
					ExtentColor.RED));
			test.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
		} else {
			test.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}
	}

	@AfterSuite
	public void tearDown() {
		extent.flush();
	}

	/*	static ExtentTest elogger;
	static ExtentReports extent = new ExtentReports();

	
	@Override
	public void onTestStart(ITestResult itr) {
		log ("Test Started...........");
	//	elogger.info("Test Started......");
	}
	 
	@Override
	public void onTestSuccess(ITestResult itr) {
		log("Test  "+itr.getName() + "Passed");
		log(itr.getTestClass());
		log("Priority of the method is "+itr.getMethod().getPriority());
		
	//	elogger.pass(itr.getThrowable());
		elogger.log(Status.PASS, MarkupHelper.createLabel(itr.getName() + "Test Case Passed", ExtentColor.GREEN));
	}
	
	@Override
	public void onTestFailure(ITestResult itr) {
		BrowserDriver.takeScreenShot();
		log("Test "+itr.getName() +"Failed");
		log(itr.getTestClass());
		log("Priority of the method is "+itr.getMethod().getPriority());
		
		elogger.fail(itr.getThrowable());
		elogger.log(Status.PASS, MarkupHelper.createLabel(itr.getName() + "Test Case Failed", ExtentColor.RED));


	}
	
	private void log(String methodName) {
		System.out.println(methodName);
	}
	
	private void log(IClass testClass) { 
		System.out.println(testClass);
	}
	
/*	public void testResult(ITestResult result) {
		extent = new ExtentReports();
         ExtentHtmlReporter reporter = new ExtentHtmlReporter("Reports//crm-test-result.html");
		
		extent.setSystemInfo("OS Name", "Windows");
		extent.setSystemInfo("Environment", "QA");
		reporter.config().setDocumentTitle("Crm Automation Test Report for QA Environment");
		extent.attachReporter(reporter);
		elogger = extent.createTest("Crm Automation Test Cases");
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
	
	    }*/
	    //extent.flush();
	}


