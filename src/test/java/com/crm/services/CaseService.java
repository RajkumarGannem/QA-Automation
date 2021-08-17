package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.pageobjects.CasePageContainer;
import com.crm.util.CommonUtil;

public class CaseService {
	
	public static CasePageContainer casePageContainer;
	private static Logger log = Logger.getLogger(CaseService.class);

	
	
	public CaseService clickOnCreateCase() {
		casePageContainer.getCreateCase().click();
		return this;
		
	}
	
	public CaseService insertCaseName(String cname) {
		casePageContainer.getTxtCaseName().sendKeys(cname);
		return this;
	}
	
	public CaseService selectCaseStatus() {
//		casePageContainer.getTxtCaseStatus().click();
		casePageContainer.getTxtCaseStatus1().click();
		
		return this;
	}
	
	public CaseService SelectCaseAccount() {
		casePageContainer.getAccountDropdown().click();
		casePageContainer.getSelectAccount().click();
		return this;
	}
	
	public CaseService SelectProirity() {
		casePageContainer.getDropproirity().click();
         return this;
	}
	
	public CaseService SelectCaseContact() {
		casePageContainer.getContactDropDown().click();
		casePageContainer.getSelectContact().click();
         return this;
	}
	
	public CaseService SelectType() {
		casePageContainer.getDroptype().click();
         return this;
	}
	
	public CaseService WriteDescription(String Desription) {
		casePageContainer.getTxtDescription().sendKeys(Desription);
		return this;
	}
	
    public CaseService saveAccount() throws InterruptedException {
    	casePageContainer.getSaveAccount().click();
    	Thread.sleep(12000);
    	log.info(casePageContainer);
    	return this;
    }
    
 /*   public String getCreatedACcountName() {
		   String aname = casePageContainer.getAccountNameCasePage().getText();
		   System.out.println("Account Name: "+aname);
		   return aname;
	   }   */
	public String getNameFromWebpage() {
		String str = casePageContainer.getCaseName.getText();
		System.out.println(str);
		return str;
	}
	
	public CaseService EditTheAccount() {
		casePageContainer.getEditTheDetials().click();
		return this;
	}
	
	public CaseService EditedAccountName() {
		casePageContainer.getEditedaccountName().sendKeys("soumya");
		return this;
	}
	
	public CaseService DeleteAccount() {
		casePageContainer.getTxtDeleteTheDetails().click();
		casePageContainer.getDeleteAccount().click();
		casePageContainer.getButtonRemove().click();
		return this;
		
	}
	
    
	public static void init() {
		casePageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), CasePageContainer.class);
	   }

}
