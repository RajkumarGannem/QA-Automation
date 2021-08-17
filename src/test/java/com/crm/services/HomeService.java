package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.pageobjects.HomePageContainer;

public class HomeService {
	
	public static HomePageContainer homePageContainer;
	private static Logger log = Logger.getLogger(HomeService.class);
	
/*	public void clickOnAccountsTab() {
		homePageContainer.getClickOnAccountsTab().click();
		
	}   */
	
/*	public void clickonContactTab() {
		homePageContainer.getHomepageContactsTab().click();
		
	}  */
	
/*	public void clickOnDropDown() {
		homePageContainer.getClickOnDropdownElement().click();
		log.info("User Page opened");
	}    */   
	
	public void ClickonCaseTab() {
		homePageContainer.getHomepageCasesTab().click();
	}
	
	public static void init() {
		homePageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), HomePageContainer.class);
	}

}
