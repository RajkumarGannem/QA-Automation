package com.crm.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.AccountService;
import com.crm.services.HomeService;
import com.crm.services.HomeService1;
import com.crm.services.LoginService;
import com.crm.validators.CreateAccountValidators;

public class CreateAccountTestScript2 {
	
	LoginService loginService = null;
	HomeService1 homeService1 = null;
	AccountService accountService = null;
	CreateAccountValidators accountValidator = null;
	
	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;
	
	@BeforeClass
	public void init() {
		loginService = new LoginService();
		homeService1 = new HomeService1();
		accountService = new AccountService();
		accountValidator = new CreateAccountValidators();
		
		crmLoginData = CrmTestData.getTestData();
		appData = crmLoginData.getCrmlogindata();

		InitializeViews.init();
		
		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		loginService.loginToApplication(appData.get(0).getUsername(), appData.get(0).getPassword());
		
	}

	@Test(description = "This textcase creates account with all details")
	public void createAccountWithBillingAddressAndShippingAddress() throws InterruptedException {
		
		homeService1.clickOnAccountsTab();

		
		accountService.clickOnCreateAccount();
		accountService.insertAccountName();
		accountService.insertEmail(appData.get(0).getAccountemail());
		accountService.insertAccountWebsite(appData.get(0).getAccountwebsite());
		accountService.insertPhoneNumber(appData.get(0).getPhonenumber());
		accountService.insertBillingAddress(appData.get(0).getBillingStreet());
		accountService.insertBillingAddress1( appData.get(0).getBillingcity(),  appData.get(0).getBillingState(),appData.get(0).getBillingcountry(),appData.get(0).getPostalcode());
		accountService.insertShippingAddress(appData.get(0).getShippingStreet(), appData.get(0).getShippingCity(), appData.get(0).getShippingState(), appData.get(0).getZipcode(), appData.get(0).getShippingCountry());
		
		accountService.saveAccount();
		
		
}
}


