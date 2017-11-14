package com.entiros.springbootrestapiprojects.oauth.service;

import com.entiros.springbootrestapiprojects.oauth.model.Account;

public interface AccountService {

	Iterable<Account> listAllAccounts(String isStaticData,String withBalance);

	Account saveAccounts(Account account);
	
	Account getAccountById(String accountId,String isStaticData,String withBalance);
}
