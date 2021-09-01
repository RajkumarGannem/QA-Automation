package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.pageobjects.AccountsPageContainer;
import com.crm.util.CommonUtil;

public class AccountService {
	
	public static AccountsPageContainer accountsPageContainer;
	private static Logger log = Logger.getLogger(AccountService.class);
	
   public AccountService clickOnCreateAccount() {
	   accountsPageContainer.getCreateAccount().click();
	   
	  return this;
   } 
	   public AccountService insertAccountName() {
		   accountsPageContainer.getTxtAccountName().sendKeys(CommonUtil.generateRandomName());
		   return this;
		   
	   }
	   public AccountService insertEmtpyName(String aname) {
		   accountsPageContainer.getTxtAccountName().sendKeys(aname);
		   return this;
	   }
	   
	   
	   public AccountService insertEmail(String email) {
		   accountsPageContainer.getTxtAccountEmail().sendKeys(email);
            return this;
	   }
	   
	   public AccountService insertAccountWebsite(String wsite) {
		   accountsPageContainer.getTxtAccountWebsite().sendKeys(wsite);
		   return this;
		   
	   }
	   
	  
	   public AccountService insertBillingAddress(String bStreet) {
		   
		   accountsPageContainer.getTxtBiliingStreet().sendKeys(bStreet);
		   return this;
	   }
		   
		   public AccountService insertBillingAddress1(  String bcity,String bstate, String Bcountry,String zip) {

		  accountsPageContainer.getTxtBillingCity().sendKeys(bcity);
		   accountsPageContainer.getTxtBillingState().sendKeys(bstate);
		   accountsPageContainer.getTxtBillingCountry().sendKeys(Bcountry);
		   accountsPageContainer.getTxtBillingZip().sendKeys(zip);
		   return this;
	   }
		   public AccountService insertShippingAddress(String SStre, String Scity,String Sste,String Szip,String Scoun) {
			   accountsPageContainer.getTxtshippingStreet().sendKeys(SStre);
			   accountsPageContainer.getTxtshippingCity().sendKeys(Scity);
			   accountsPageContainer.getTxtshippingState().sendKeys(Sste);
			   accountsPageContainer.getTxtshippingZip().sendKeys(Szip);
			   accountsPageContainer.getTxtshippingCountry().sendKeys(Scoun);
			   return this;
			   
		   }
	   
	   public AccountService saveAccount() throws InterruptedException {
		   accountsPageContainer.getSaveAccount().click();
		   Thread.sleep(12000);
		   return this;
	   }
	   
	   public String getBillAddressFromWebPage() {
		   String str = accountsPageContainer.getBillAdd.getText();
	//	   System.out.println(str);
		   return str;
	   }
	   
	   public String  getShipAddressFromWebPage() {
		   String str = accountsPageContainer.getShipAdd.getText();
		//   System.out.println(str);
		   return str;
	   }
	   
	   public String getCreatedACcountName() {
		   String aname = accountsPageContainer.getAccountNameAccountPage().getText();
		   System.out.println("Account Name: "+aname);
		   return aname;
	   }     
	   
/*	   public String getCreatedBillingStreet() {
		   String bstreet = accountsPageContainer.getCreatedtxtBillingStreet().getText();
		   System.out.println("Billing Street: "+bstreet);
		   return bstreet;
	   }     
	   
	   public String getCreatedBillingState() {
		   String bstate = accountsPageContainer.getCreatedtxtBillingState().getText();
		   System.out.println("Billing State: "+bstate);
		   return bstate;
	   }
	   public String getCreatedBillingCity() {
		   String bcity = accountsPageContainer.getCreatedtxtBillingCity().getText();
		   System.out.println("Billing City: "+bcity);
		   return bcity;
	   }
	   
	   public String getCreatedBillingCountry() {
		   String bcountry = accountsPageContainer.getCreatedtxtBillingCountry().getText();
		   System.out.println("Billing Country: "+bcountry);
		   return bcountry;
	   }    */   
	   
	   public AccountService insertPhoneNumber(String phoneNumber) {
		   BrowserDriver.selectDropDownItem(accountsPageContainer.getPhoneDropDown(), "Mobile");
		   accountsPageContainer.getTxtFieldPhone().sendKeys(phoneNumber);
		   return this;
		   
	   }
	   
	   public AccountService clickOnCopyBilling() {
		   BrowserDriver.waitForPageElement(accountsPageContainer.getButtoncopybilling(), 45);
		   accountsPageContainer.getButtoncopybilling().click();
		   return this;
		   
		   
	   }
	   public AccountService EditTheDetails() throws InterruptedException {
		   accountsPageContainer.getTxtEditTheDetails().click();
		   Thread.sleep(12000);

		   return this;
	   }
	   
	   public AccountService EditAccountName() {
		   accountsPageContainer.getEditAccountName().sendKeys("sravan");
		   return this;
	   }
	   
	   public AccountService saveAccount1() throws InterruptedException {
		   accountsPageContainer.getSaveAccount().click();
		 
		   return this;
	   }
	   
	   public AccountService DeleteAccount() {
		   accountsPageContainer.getTxtDeleteTheDetails().click();
		   accountsPageContainer.getDeleteAccount().click();
		   accountsPageContainer.getButtonRemove().click();
		   return this;
	   }
	   
	   
	   
	   public static void init() {
		   accountsPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AccountsPageContainer.class);
	   }
}


