package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.pageobjects.AccountsPageContainer;
import com.crm.pageobjects.UserPageContianer;
import com.crm.util.CommonUtil;

public class UserService {

	public static UserPageContianer userPageContainer;
	private static Logger log = Logger.getLogger(UserService.class);

	
	
	public UserService clickOnUserDropDown() {
		userPageContainer.getClickOnUsersDropDown().click();
		return this;
	}
	
	public UserService clickOncreateUser() {
		userPageContainer.getClickOnCreateUser().click();
		return this;
		
	}
	public UserService insertusernameandemail(String NameTitle,String Fname,String Lname,String mail) {
		userPageContainer.getInsertUserName().sendKeys(CommonUtil.generateRandomName());
		BrowserDriver.selectDropDownItem(userPageContainer.getSelectNameTitle(), "Mr.");
		userPageContainer.getSelectNameTitle().sendKeys(NameTitle);
//		userPageContainer.getSelectNameTitle().click();
		userPageContainer.getInsertFirstName().sendKeys(Fname);
		userPageContainer.getInsertLastName().sendKeys(Lname);
		userPageContainer.getInsertEmail().sendKeys(mail);
		return this;
	}
	public UserService insertPhoneNumber(String Title,String gender) {
		
		String num =Integer.toString(CommonUtil.generateRandomNumber());
		BrowserDriver.selectDropDownItem(userPageContainer.getGetPhoneDropdown(), "Mobile");
		userPageContainer.getTxtPhoneNumber().sendKeys(num);
		userPageContainer.getInsertTitle().sendKeys(Title);
		BrowserDriver.selectDropDownItem(userPageContainer.getClickOnGender(), "Male");
		userPageContainer.getClickOnGender().sendKeys(gender);
		return this;
	}
	
	public UserService GeneratePassword(String pWord, String confirmpword ) throws InterruptedException {
		userPageContainer.getGeneratePassword().sendKeys(pWord);
		userPageContainer.getConfirmPassword().sendKeys(confirmpword);
		userPageContainer.getSavetheAccount().click();
		Thread.sleep(12000);
		
		log.info("userpage created succesfully");
		return this;
	}
	
	public UserService logoutAccount() {
		userPageContainer.getLogoutDropdown().click();
		userPageContainer.getClicklogout().click();
		return this;
	}
	
	
	   public static void init() {
		   userPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), UserPageContianer.class);
	   }
}
