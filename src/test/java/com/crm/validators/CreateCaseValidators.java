package com.crm.validators;

import java.util.List;

import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.CaseService;

import junit.framework.Assert;

public class CreateCaseValidators {
	
	CrmLoginData crmLoginData = CrmTestData.getTestData();
	List<LoginData>    appData = 	crmLoginData.getCrmlogindata();
	
	
	
	public void validateAccountName(CaseService caseService) {
		String insertedCaseName = appData.get(0).getCaseName();
		
		
		String accountName = caseService.getNameFromWebpage();
		
		Assert.assertEquals(accountName, insertedCaseName);
	}

}
