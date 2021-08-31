package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.pageobjects.HomePageContainer;

public class HomeService1 {
	
	public static HomePageContainer homePageContainer;
	private static Logger log = Logger.getLogger(HomeService1.class);
	
	public void clickOnAccountsTab() {
		homePageContainer.getClickOnAccountsTab().click();
		
	}
	
	public static void init() {
		homePageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), HomePageContainer.class);
	}

}
