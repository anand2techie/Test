package com.entiros.springbootrestapiprojects.oauth.service;

import com.entiros.springbootrestapiprojects.oauth.model.Account;

public interface AccountService {

	Iterable<Account> listAllAccounts();

	Account saveAccounts(Account account);
}
