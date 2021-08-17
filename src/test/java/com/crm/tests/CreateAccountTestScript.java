package com.crm.tests;

import java.time.Duration;
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
import com.crm.services.LoginService;
import com.crm.validators.CreateAccountValidators;

public class CreateAccountTestScript {
	
	LoginService loginService = null;
	HomeService homeService = null;
	AccountService accountService = null;
	CreateAccountValidators accountValidator = null;
	
	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;
	
	@BeforeClass
	public void init() {
		loginService = new LoginService();
		homeService = new HomeService();
		accountService = new AccountService();
		accountValidator = new CreateAccountValidators();
		
		crmLoginData = CrmTestData.getTestData();
		appData = crmLoginData.getCrmlogindata();

		InitializeViews.init();
		
		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		loginService.loginToApplication(appData.get(0).getUsername(), appData.get(0).getPassword());
		
	}
	
/*	@Test(description = "It creates account billing address", priority =0)
	public void createAccountWithBillingAddress() throws InterruptedException {
		
		homeService.clickOnAccountsTab();

		accountService.clickOnCreateAccount();
		accountService.insertAccountNameandEmail(appData.get(0).getAccountName(),appData.get(0).getAccountemail());
		accountService.insertAccountWebsite(appData.get(0).getAccountwebsite());
		accountService.insertBillingAddress(appData.get(0).getBillingStreet(),appData.get(0).getBillingcity());
		accountService.insertBillingAddress1(appData.get(0).getBillingState(),appData.get(0).getBillingcountry());
		accountService.insertPhoneNumber(appData.get(0).getPhonenumber());
		accountService.saveAccount();
		

		homeService.clickOnAccountsTab();
		accountService.getCreatedACcountName();
		
		accountValidator.ValidAccountName(accountService);
		
		
	}    */
	
	@Test(description = "This textcase creates account with billing and shipping address", priority =1)
	public void createAccountWithBillingAddressAndShippingAddress() throws InterruptedException {
		
		homeService.clickOnAccountsTab();

		
		accountService.clickOnCreateAccount();
		accountService.insertAccountNameandEmail(appData.get(0).getAccountemail());
		accountService.insertAccountWebsite(appData.get(0).getAccountwebsite());
		accountService.insertPhoneNumber(appData.get(0).getPhonenumber());
		accountService.insertBillingAddress(appData.get(0).getBillingStreet());
		accountService.insertBillingAddress1( appData.get(0).getBillingcity(),  appData.get(0).getBillingState(),appData.get(0).getBillingcountry(),appData.get(0).getPostalcode());
		accountService.insertShippingAddress(appData.get(0).getShippingStreet(), appData.get(0).getShippingCity(), appData.get(0).getShippingState(), appData.get(0).getZipcode(), appData.get(0).getShippingCountry());
		
		accountService.saveAccount();
		
		accountValidator.validateBillingAddress(accountService);
		//accountValidator.validateShippingAddress(accountService);
		
	//	homeService.clickOnAccountsTab();

/*		accountService.getCreatedACcountName();
		
		accountService.getCreatedBillingStreet();
		accountService.getCreatedBillingState();
		accountService.getCreatedBillingCity();
		accountService.getCreatedBillingCountry();    

		accountValidator.ValidAccountName(accountService);
		accountValidator.ValidBillingAddress(accountService);
		accountValidator.ValidBillingAddress1(accountService);
		accountValidator.ValidBillingCity(accountService);
		accountValidator.ValidBillingCountry(accountService);     */
		
		
		

	}    
//	@Test(description = "It edits the account", priority = 2)
//	public void editAccount() throws InterruptedException {
//		accountService.EditTheDetails();
//		accountService.EditAccountName();
//		accountService.saveAccount();

		
//	}
//	@Test(description = "It delets account",priority = 3)
  //  public void deleteAccount() {
	//	accountService.DeleteAccount();

	}

