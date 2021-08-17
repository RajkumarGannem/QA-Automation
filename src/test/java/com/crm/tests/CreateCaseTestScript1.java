package com.crm.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.CaseService;
import com.crm.services.HomeService;
import com.crm.services.LoginService;
import com.crm.validators.CreateCaseValidators;

public class CreateCaseTestScript1 {
	
	LoginService loginService = null;
	HomeService homeService = null;
	CaseService caseService = null;
	CreateCaseValidators caseValidator = null;
	
	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;
	
	@BeforeClass
	public void init() {
		loginService = new LoginService();
		homeService = new HomeService();
		caseService = new CaseService();
		caseValidator = new CreateCaseValidators();

		crmLoginData = CrmTestData.getTestData();
		appData = crmLoginData.getCrmlogindata();

		
		InitializeViews.init();
	} 
	
	@Test(description = "This textcase creates without name")
	public  void createCaseWithDetails() throws InterruptedException {
		
		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		loginService.loginToApplication(appData.get(0).getUsername(), appData.get(0).getPassword());
		
		homeService.ClickonCaseTab();
		caseService.clickOnCreateCase();
		caseService.insertCaseName(appData.get(0).getEmptyName());
		caseService.selectCaseStatus();
		caseService.SelectCaseAccount();
		caseService.SelectProirity();
		caseService.SelectCaseContact();
		caseService.SelectProirity();
		caseService.saveAccount();
	
	
}
}