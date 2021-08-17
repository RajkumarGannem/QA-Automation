package com.crm.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageContainer {
	
/*	@FindBy(xpath = "//span[text() = 'Accounts']")
	public WebElement ClickOnAccountsTab;

	public WebElement getClickOnAccountsTab() {
		return ClickOnAccountsTab;
	}

	public void setClickOnAccountsTab(WebElement clickOnAccountsTab) {
		ClickOnAccountsTab = clickOnAccountsTab;
	}   */    
	
	
	
/*		@FindBy(xpath = "//a[@class='dropdown-toggle']")
	public WebElement ClickOnDropdownElement;
	
	public WebElement getClickOnDropdownElement() {
		return ClickOnDropdownElement;
	}

	public void setClickOnDropdownElement(WebElement clickOnDropdownElement) {
		ClickOnDropdownElement = clickOnDropdownElement;
	}    */     
	
/*   @FindBy(xpath ="//span[text()='Contacts']")
	public WebElement homepageContactsTab;
	
	public WebElement getHomepageContactsTab() {
		return homepageContactsTab;
	}

	public void setHomepageContactsTab(WebElement homepageContactsTab) {
		this.homepageContactsTab = homepageContactsTab;
	}  */
	
	 @FindBy(xpath ="//span[text()='Cases']")
		public WebElement homepageCasesTab;

	public WebElement getHomepageCasesTab() {
		return homepageCasesTab;
	}

	public void setHomepageCasesTab(WebElement homepageCasesTab) {
		this.homepageCasesTab = homepageCasesTab;
	}
	

	

}
