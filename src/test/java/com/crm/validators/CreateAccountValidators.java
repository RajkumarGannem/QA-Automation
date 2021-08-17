package com.crm.validators;

import java.util.List;

import org.testng.Assert;

import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.AccountService;


public class CreateAccountValidators {
	
	CrmLoginData crmLoginData = CrmTestData.getTestData();
	List<LoginData>    appData = 	crmLoginData.getCrmlogindata();
	
	
	public void ValidateAccountName(AccountService accountService) {
		String insertedAccountName = appData.get(0).getAccountName();
		
		String accountName = accountService.getCreatedACcountName();
		
		Assert.assertEquals(accountName, insertedAccountName);
	}
	
	public void validateBillingAddress(AccountService accountService) {
		String xmlStreet = appData.get(0).getBillingStreet();
		String xmlState = appData.get(0).getBillingState();
		String xmlCity = appData.get(0).getBillingcity();
		String xmlCountry = appData.get(0).getBillingcountry();
		String xmlZip = appData.get(0).getPostalcode();
		
		String billingAddress = accountService.getBillAddressFromWebPage();
		
		String line[] = billingAddress.split("\\r?\\n");
//		System.out.println(line[0]);
//		System.out.println(line[1]);
//		System.out.println(line[2]);
		String[] lineIn = line[1].split(" ");
//		System.out.println(line[0]);
//		System.out.println(line[1]);
//		System.out.println(line[2]);
		
		String removeComm = lineIn[0].replace(",", "");
	//	System.out.println(removeComm);
		Assert.assertEquals(xmlStreet, line[0]);
		Assert.assertEquals(xmlState, lineIn[1]);
		Assert.assertEquals(xmlCity, removeComm);
		Assert.assertEquals(xmlZip, lineIn[2]);
		Assert.assertEquals(xmlCountry, line[2]);

	}
	
	/*public void validateShippingAddress(AccountService accountService) {
		String xmlStreet = appData.get(0).getShippingStreet();
		String xmlState = appData.get(0).getShippingState();
		String xmlCity = appData.get(0).getShippingCity();
		String xmlCountry = appData.get(0).getShippingCountry();
		String xmlZip = appData.get(0).getZipcode();
		
		String shippingAddress = accountService.getShipAddressFromWebPage();
		
		String line[] = shippingAddress.split("\\r?\\n");
//		System.out.println(line[0]);
//		System.out.println(line[1]);
//		System.out.println(line[2]);
		String[] lineIn = line[1].split(" ");
		
//		System.out.println(line[1]);
//		System.out.println(line[2]);
		
		String removeComm = lineIn[0].replace(",", "");
		System.out.println(removeComm);
		Assert.assertEquals(xmlStreet, line[0]);
		Assert.assertEquals(xmlState, line[1]);
		Assert.assertEquals(xmlCity, removeComm);
		Assert.assertEquals(xmlCountry, line[2]);
		Assert.assertEquals(xmlZip, line[2]);
		
				
	}
	
/*	public void ValidAccountName(AccountService accountService) {
		String insertedAccountName = "rajkumar";
		
		String accountName = accountService.getCreatedACcountName();
		
          Assert.assertEquals(accountName, insertedAccountName);
		
  	}    
 
	public void ValidBillingAddress(AccountService accountService ) {
		String insertedBiillingStreet = "johns";
	
		
		String billingStreet  = accountService.getCreatedBillingStreet();
		
		Assert.assertEquals(insertedBiillingStreet, billingStreet);
		
	}   
	
	public void ValidBillingAddress1(AccountService accountService) {
		String insertedBillingState = "karna";
		String billingState = accountService.getCreatedBillingState();
		
		Assert.assertEquals(insertedBillingState, billingState);
		
	}
	public void ValidBillingCity(AccountService accountService) {
		String insertedBillingCity = "nellore";
		String billingCity = accountService.getCreatedBillingCity();
		Assert.assertEquals(billingCity, insertedBillingCity);
	}
	
	public void ValidBillingCountry(AccountService accountService) {
		String insertedBillingCountry = "ausralia";
		String billingCountry =accountService.getCreatedBillingCountry();
		Assert.assertEquals(billingCountry, insertedBillingCountry);
	}    */
	
	
}
