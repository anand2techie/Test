package com.entiros.springbootrestapiprojects.oauth.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entiros.springbootrestapiprojects.oauth.model.Account;
import com.entiros.springbootrestapiprojects.oauth.model.HeritageCar;
import com.entiros.springbootrestapiprojects.oauth.repository.AcccountRepository;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	private AcccountRepository acccountRepository;

	@Autowired
	public void setAcccountRepository(AcccountRepository acccountRepository) {
		this.acccountRepository = acccountRepository;
	}

	public Iterable<Account> listAllAccounts() {
		return acccountRepository.findAll();
	}

	@Override
	public Account saveAccounts(Account account) {
		// TODO Auto-generated method stub
		return acccountRepository.save(account);
	}

}
