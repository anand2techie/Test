package com.entiros.springbootrestapiprojects.oauth.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.entiros.springbootrestapiprojects.oauth.model.Account;
import com.entiros.springbootrestapiprojects.oauth.model.Amount;
import com.entiros.springbootrestapiprojects.oauth.model.Balances;
import com.entiros.springbootrestapiprojects.oauth.model.HeritageCar;
import com.entiros.springbootrestapiprojects.oauth.model.SingleBalance;
import com.entiros.springbootrestapiprojects.oauth.repository.AcccountRepository;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	private AcccountRepository acccountRepository;

	@Autowired
	public void setAcccountRepository(AcccountRepository acccountRepository) {
		this.acccountRepository = acccountRepository;
	}

	public Iterable<Account> listAllAccounts(boolean isStaticData, String withBalance) {

		if (isStaticData) {
			//list creation
			List<Account> accountsList = new ArrayList<Account>();
			
			//list's misc. data
			Account account1 = setMiscData();

			//condition to check based on withBalance
			if (withBalance.equals("true")) {
				Balances balances = setBalances();
				/*
				 * balances.setAuthorised(authorised);
				 * balances.setClosingBooked(closingBooked);
				 * balances.setExpected(expected);
				 * balances.setInterimAvailable(interimAvailable);
				 * balances.setOpeningBooked(openingBooked);
				 */
				account1.setBalances(balances);
			}
			accountsList.add(account1);
			return accountsList;
		} else {
			return acccountRepository.findAll();
		}
	}

	private Account setMiscData() {
		Account account1 = new Account();
		account1.setBic("ENTISEIG");
		account1.setAccountType("Main account");
		//account1.setBban("");
		account1.setCurrency("SEK");
		account1.setIban("SE0000000000001234567890");
		//account1.setMsisdn("");
		//account1.setName("");
		//account1.setPan("");
		account1.setId("54fbbfb6-c314-11e7-abc4-cec278b6b50a");
		return account1;
	}

	private Balances setBalances() {
		Balances balances = new Balances();

		SingleBalance booked = new SingleBalance();
		Amount amount = new Amount();
		Integer content = new Integer(1000);
		amount.setContent(content);
		amount.setCurrency("EUR");
		amount.setId("1");

		booked.setAmount(amount);
		LocalDate date = new LocalDate();
		booked.setDate(date);
		booked.setId("1");
		DateTime lastActionDateTime = new DateTime(1510456290586l);
		booked.setLastActionDateTime(lastActionDateTime);

		SingleBalance authorised = new SingleBalance();
		SingleBalance closingBooked = new SingleBalance();
		SingleBalance expected = new SingleBalance();
		SingleBalance interimAvailable = new SingleBalance();
		SingleBalance openingBooked = new SingleBalance();

		balances.setBooked(booked);
		return balances;
	}

	@Override
	public Account saveAccounts(Account account) {
		// TODO Auto-generated method stub
		return acccountRepository.save(account);
	}

}
