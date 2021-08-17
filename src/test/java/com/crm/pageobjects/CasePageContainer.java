package com.crm.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CasePageContainer {
	
	@FindBy(xpath = "//a[@data-name='create']")
	public WebElement createCase;
	
	@FindBy(xpath = "//input[@data-name='name']")
	public WebElement txtCaseName;
	
//	@FindBy(xpath = "//select[@data-name='status']")
//	public WebElement txtCaseStatus;
	
    @FindBy(xpath = "//option[@value='Closed']")
    public WebElement txtCaseStatus1;

    @FindBy(xpath = "//option[@value='Urgent']")
    public WebElement dropproirity;
    
    @FindBy (xpath = "//option[@value='Incident']")
    public WebElement droptype;
	
    @FindBy(xpath = "//button[text()='Save']")
	public WebElement saveAccount;
    
 //   @FindBy(xpath = "//td[@data-name='name']")
 //   public WebElement AccountNameCasePage;
    
    @FindBy(xpath  = "//div[@class='field' and @data-name='name']")
    public WebElement getCaseName;
    
    @FindBy(xpath = "//button[@data-action='edit']")
    public WebElement EditTheDetials;
    
    @FindBy(xpath = "//input[@data-name='name']")
    public WebElement EditedaccountName;
    

	@FindBy(xpath = "//span[@class='fas fa-ellipsis-h']")
	public WebElement txtDeleteTheDetails;
	
	@FindBy(xpath = "//a[text() ='Remove']")
	public WebElement deleteAccount;
	
	@FindBy(xpath =" //button[text() =' Remove ']")
	public WebElement buttonRemove;
	
	@FindBy(xpath = "//i[@class='fas fa-angle-up']")
	public WebElement AccountDropdown;
	
	@FindBy(xpath  = "//a[@title='sriramvenu']")
	public WebElement SelectAccount;
	
    @FindBy(xpath = "//span[@class='fas fa-angle-up']")
    public WebElement ContactDropDown;
    
    @FindBy(xpath = "//a[@title='sravan arjun']")
    public WebElement SelectContact;
    
    @FindBy(xpath = "//textarea[@class='main-element form-control auto-height']")
    public WebElement txtDescription;
    
	public WebElement getGetCaseName() {
		return getCaseName;
	}

	public void setGetCaseName(WebElement getCaseName) {
		this.getCaseName = getCaseName;
	}

	public WebElement getSaveAccount() {
		return saveAccount;
	}

	public void setSaveAccount(WebElement saveAccount) {
		this.saveAccount = saveAccount;
	}

	public WebElement getDroptype() {
		return droptype;
	}

	public void setDroptype(WebElement droptype) {
		this.droptype = droptype;
	}

	public WebElement getDropproirity() {
		return dropproirity;
	}

	public void setDropproirity(WebElement dropproirity) {
		this.dropproirity = dropproirity;
	}

	public WebElement getCreateCase() {
		return createCase;
	}

	public void setCreateCase(WebElement createCase) {
		this.createCase = createCase;
	}

	public WebElement getTxtCaseName() {
		return txtCaseName;
	}

	public void setTxtCaseName(WebElement txtCaseName) {
		this.txtCaseName = txtCaseName;
	}

//	public WebElement getTxtCaseStatus() {
//		return txtCaseStatus;
//	}

//	public void setTxtCaseStatus(WebElement txtCaseStatus) {
//		this.txtCaseStatus = txtCaseStatus;
//	}

	public WebElement getTxtCaseStatus1() {
		return txtCaseStatus1;
	}

	public void setTxtCaseStatus1(WebElement txtCaseStatus1) {
		this.txtCaseStatus1 = txtCaseStatus1;
	}

	public WebElement getEditTheDetials() {
		return EditTheDetials;
	}

	public void setEditTheDetials(WebElement editTheDetials) {
		EditTheDetials = editTheDetials;
	}

	public WebElement getEditedaccountName() {
		return EditedaccountName;
	}

	public void setEditedaccountName(WebElement editedaccountName) {
		EditedaccountName = editedaccountName;
	}

	public WebElement getTxtDeleteTheDetails() {
		return txtDeleteTheDetails;
	}

	public void setTxtDeleteTheDetails(WebElement txtDeleteTheDetails) {
		this.txtDeleteTheDetails = txtDeleteTheDetails;
	}

	public WebElement getDeleteAccount() {
		return deleteAccount;
	}

	public void setDeleteAccount(WebElement deleteAccount) {
		this.deleteAccount = deleteAccount;
	}

	public WebElement getButtonRemove() {
		return buttonRemove;
	}

	public void setButtonRemove(WebElement buttonRemove) {
		this.buttonRemove = buttonRemove;
	}

	public WebElement getAccountDropdown() {
		return AccountDropdown;
	}

	public void setAccountDropdown(WebElement accountDropdown) {
		AccountDropdown = accountDropdown;
	}

	public WebElement getSelectAccount() {
		return SelectAccount;
	}

	public void setSelectAccount(WebElement selectAccount) {
		SelectAccount = selectAccount;
	}

	public WebElement getContactDropDown() {
		return ContactDropDown;
	}

	public void setContactDropDown(WebElement contactDropDown) {
		ContactDropDown = contactDropDown;
	}

	public WebElement getSelectContact() {
		return SelectContact;
	}

	public void setSelectContact(WebElement selectContact) {
		SelectContact = selectContact;
	}

	public WebElement getTxtDescription() {
		return txtDescription;
	}

	public void setTxtDescription(WebElement txtDescription) {
		this.txtDescription = txtDescription;
	}

/*	public WebElement getAccountNameCasePage() {
		return AccountNameCasePage;
	}

	public void setAccountNameCasePage(WebElement accountNameCasePage) {
		AccountNameCasePage = accountNameCasePage;
	}

	public WebElement getGetName() {
		return getName;
	}

	public void setGetName(WebElement getName) {
		this.getName = getName;
	}   */

	}
