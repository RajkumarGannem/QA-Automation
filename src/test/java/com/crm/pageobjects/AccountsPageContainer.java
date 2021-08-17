package com.crm.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsPageContainer {

	@FindBy(xpath = "//a[@data-action='create']")
	public WebElement createAccount;
	
	@FindBy(xpath = "//input[@data-name='name']")
	public WebElement txtAccountName;
	
	@FindBy(xpath = "//input[@type='email']")
	public WebElement txtAccountEmail;
	
	@FindBy(xpath ="//input[@data-name='website']")
	public WebElement txtAccountWebsite;
	
	@FindBy(xpath = "//textarea[@data-name='billingAddressStreet']")
	public WebElement txtBiliingStreet;
	
	@FindBy(xpath = "//input[@data-name='billingAddressCity']")
	public WebElement txtBillingCity;
	
	@FindBy(xpath = "//input[@data-name='billingAddressState']")
	public WebElement txtBillingState;
	
	@FindBy(xpath = "//input[@data-name='billingAddressPostalCode']")
	public WebElement txtBillingZip;
	
	@FindBy(xpath = "//input[@data-name='billingAddressCountry']")
	public WebElement txtBillingCountry;
	
	@FindBy(xpath = "//button[text()='Save']")
	public WebElement saveAccount;
	
//	@FindBy(xpath = "//td[@data-name='name']")
//	public WebElement AccountNameAccountPage;
	
	@FindBy(xpath = "//select[@data-property-type='type']")
	public WebElement phoneDropDown;
	
	@FindBy(css = ".form-control.phone-number.no-margin-shifting")
	public WebElement txtFieldPhone;
	
	@FindBy(xpath = "//button[text() = 'Copy Billing']")
	public WebElement buttoncopybilling;
	
	@FindBy(xpath = "//button[text() = 'Edit']")
	public WebElement txtEditTheDetails;
	
	@FindBy(xpath = "//input[@data-name='name']")
	public WebElement editAccountName;
	
	@FindBy(xpath = "//span[@class='fas fa-ellipsis-h']")
	public WebElement txtDeleteTheDetails;
	
	@FindBy(xpath = "//a[text() ='Remove']")
	public WebElement deleteAccount;
	
	@FindBy(xpath =" //button[text() =' Remove ']")
	public WebElement buttonRemove;
	
/*	@FindBy(xpath = "//textarea['form-control auto-height']")
	public WebElement createdtxtBillingStreet;
	
	@FindBy(xpath = "//input[@data-name='billingAddressCity']")
	public WebElement createdtxtBillingCity;
	
	@FindBy(xpath = "//input[@data-name='billingAddressState']")
	public WebElement createdtxtBillingState;
	
	@FindBy(xpath = "//input[@data-name='billingAddressCountry']")
	public WebElement createdtxtBillingCountry;      */    
	
	@FindBy(xpath = "//div[@class='field' and @data-name='billingAddress']")
	public WebElement getBillAdd;
	
	@FindBy(xpath = "//textarea[@data-name='shippingAddressStreet']")
	public WebElement txtshippingStreet;
	
	@FindBy(xpath = "//input[@data-name='shippingAddressCity']")
	public WebElement txtshippingCity;
	
	@FindBy(xpath = "//input[@data-name='shippingAddressState']")
	public WebElement txtshippingState;
	
	@FindBy(xpath = "//input[@data-name='shippingAddressPostalCode']")
	public WebElement txtshippingZip;
	
	@FindBy(xpath = "//input[@data-name='shippingAddressCountry']")
	public WebElement txtshippingCountry;
	
	@FindBy(xpath  = "//div[@class='field' and @data-name='shippingAddress']")
	public WebElement getShipAdd;
	
	
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

	
	public WebElement getTxtEditTheDetails() {
		return txtEditTheDetails;
	}

	public void setTxtEditTheDetails(WebElement txtEditTheDetails) {
		this.txtEditTheDetails = txtEditTheDetails;
	}

	public WebElement getEditAccountName() {
		return editAccountName;
	}

	public void setEditAccountName(WebElement editAccountName) {
		this.editAccountName = editAccountName;
	}

	
	
	public WebElement getButtoncopybilling() {
		return buttoncopybilling;
	}

	public void setButtoncopybilling(WebElement buttoncopybilling) {
		this.buttoncopybilling = buttoncopybilling;
	}

	public WebElement getTxtFieldPhone() {
		return txtFieldPhone;
	}

	public void setTxtFieldPhone(WebElement txtFieldPhone) {
		this.txtFieldPhone = txtFieldPhone;
	}

	public WebElement getPhoneDropDown() {
		return phoneDropDown;
	}

	public void setPhoneDropDown(WebElement phoneDropDown) {
		this.phoneDropDown = phoneDropDown;
	}

	public WebElement getAccountNameAccountPage() {
		return AccountNameAccountPage;
	}

	public void setAccountNameAccountPage(WebElement accountNameAccountPage) {
		AccountNameAccountPage = accountNameAccountPage;
	}    

		public WebElement getTxtAccountEmail() {
		return txtAccountEmail;
	}

	public WebElement getTxtAccountWebsite() {
		return txtAccountWebsite;
	}

	public void setTxtAccountWebsite(WebElement txtAccountWebsite) {
		this.txtAccountWebsite = txtAccountWebsite;
	}

	
	public WebElement getTxtBiliingStreet() {
		return txtBiliingStreet;
	}

	public void setTxtBiliingStreet(WebElement txtBiliingStreet) {
		this.txtBiliingStreet = txtBiliingStreet;
	}

	public WebElement getTxtBillingCity() {
		return txtBillingCity;
	}

	public void setTxtBillingCity(WebElement txtBillingCity) {
		this.txtBillingCity = txtBillingCity;
	}

	public WebElement getTxtBillingState() {
		return txtBillingState;
	}

	public void setTxtBillingState(WebElement txtBillingState) {
		this.txtBillingState = txtBillingState;
	}

	public WebElement getTxtBillingZip() {
		return txtBillingZip;
	}

	public void setTxtBillingZip(WebElement txtBillingZip) {
		this.txtBillingZip = txtBillingZip;
	}

	public WebElement getTxtBillingCountry() {
		return txtBillingCountry;
	}

	public void setTxtBillingCountry(WebElement txtBillingCountry) {
		this.txtBillingCountry = txtBillingCountry;
	}

	public WebElement getSaveAccount() {
		return saveAccount;
	}

	public void setSaveAccount(WebElement saveAccount) {
		this.saveAccount = saveAccount;
	}

	public void setTxtAccountEmail(WebElement txtAccountEmail) {
		this.txtAccountEmail = txtAccountEmail;
	}

	public WebElement getTxtAccountName() {
		return txtAccountName;
	}

	public void setTxtAccountName(WebElement txtAccountName) {
		this.txtAccountName = txtAccountName;
	}

	public WebElement getCreateAccount() {
		return createAccount;
	}

	public void setCreateAccount(WebElement createAccount) {
		this.createAccount = createAccount;
	}



	public WebElement getCreatedtxtBillingCity() {
		return createdtxtBillingCity;
	}

	public void setCreatedtxtBillingCity(WebElement createdtxtBillingCity) {
		this.createdtxtBillingCity = createdtxtBillingCity;
	}

	public WebElement getCreatedtxtBillingState() {
		return createdtxtBillingState;
	}

	public void setCreatedtxtBillingState(WebElement createdtxtBillingState) {
		this.createdtxtBillingState = createdtxtBillingState;
	}

	public WebElement getCreatedtxtBillingCountry() {
		return createdtxtBillingCountry;
	}

	public void setCreatedtxtBillingCountry(WebElement createdtxtBillingCountry) {
		this.createdtxtBillingCountry = createdtxtBillingCountry;
	}

	public WebElement getCreatedtxtBillingStreet() {
		return createdtxtBillingStreet;
	}

	public void setCreatedtxtBillingStreet(WebElement createdtxtBillingStreet) {
		this.createdtxtBillingStreet = createdtxtBillingStreet;
	}

	public WebElement getGetBillAdd() {
		return getBillAdd;
	}

	public void setGetBillAdd(WebElement getBillAdd) {
		this.getBillAdd = getBillAdd;
	}

	public WebElement getTxtshippingStreet() {
		return txtshippingStreet;
	}

	public void setTxtshippingStreet(WebElement txtshippingStreet) {
		this.txtshippingStreet = txtshippingStreet;
	}

	public WebElement getTxtshippingCity() {
		return txtshippingCity;
	}

	public void setTxtshippingCity(WebElement txtshippingCity) {
		this.txtshippingCity = txtshippingCity;
	}

	public WebElement getTxtshippingState() {
		return txtshippingState;
	}

	public void setTxtshippingState(WebElement txtshippingState) {
		this.txtshippingState = txtshippingState;
	}

	public WebElement getTxtshippingZip() {
		return txtshippingZip;
	}

	public void setTxtshippingZip(WebElement txtshippingZip) {
		this.txtshippingZip = txtshippingZip;
	}

	public WebElement getTxtshippingCountry() {
		return txtshippingCountry;
	}

	public void setTxtshippingCountry(WebElement txtshippingCountry) {
		this.txtshippingCountry = txtshippingCountry;
	}

	public WebElement getGetShipAdd() {
		return getShipAdd;
	}

	public void setGetShipAdd(WebElement getShipAdd) {
		this.getShipAdd = getShipAdd;
	}

}
