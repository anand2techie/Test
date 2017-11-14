package com.entiros.springbootrestapiprojects.oauth.controller;

import java.util.Iterator;
import java.util.UUID;

import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entiros.springbootrestapiprojects.oauth.model.Account;
import com.entiros.springbootrestapiprojects.oauth.model.HeritageCar;
import com.entiros.springbootrestapiprojects.oauth.service.AccountService;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-11T03:55:25.506Z")

@RestController
public class AccountsApiController implements AccountsApi {

	@Autowired
	private AccountService accountService;
	
	@Value("${isStatic}")
    private String isStatic;


	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	public Account accountsAccountIdGet(
			@ApiParam(value = "Account ID", required = true) @PathVariable("account-id") String accountId,
			@NotNull @ApiParam(value = "Including the balance od the account.", required = true, allowableValues = "true, false") @RequestParam(value = "with-balance", required = true) String withBalance,
			@ApiParam(value = "ID of the transaction as determined by the initiating party. In case of a once off read data request, this Process-ID equals the Process-ID of the corresponding Account Information Consent Request.", required = true) @RequestHeader(value = "Process-ID", required = true) UUID processID,
			@ApiParam(value = "", required = true) @RequestHeader(value = "Request-ID", required = true) UUID requestID,
			@ApiParam(value = "Standard https header element for Date and Time.", required = false) @RequestHeader(value = "date", required = false) String date,
			@ApiParam(value = "") @RequestHeader(value = "Consent-ID", required = false) String consentID,
			@ApiParam(value = "To be used, if no OAuth Pre-Step was performed.") @RequestHeader(value = "PSU-ID", required = false) String PSU_ID,
			@ApiParam(value = "Is contained only, if the optional OAuth PreStep was performed.") @RequestHeader(value = "Authorization Bearer", required = false) String authorizationBearer) {
		// do some magic!
		// do some magic!
				Account account=accountService.getAccountById(accountId, isStatic, withBalance);
				
				if(withBalance.equalsIgnoreCase("true"))
				{
					return account;
				}
				else
				{
					return markBalanceOfAnAccountAsNull(account);
				}
	}

	public ResponseEntity<Void> accountsAccountIdTransactionsGet(
			@ApiParam(value = "Account ID", required = true) @PathVariable("account-id") Integer accountId) {
		// do some magic!
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	public ResponseEntity<Void> accountsAccountIdTransactionsTransactionIdGet(
			@ApiParam(value = "Account ID", required = true) @PathVariable("account-id") Integer accountId,
			@ApiParam(value = "Transaction ID", required = true) @PathVariable("transaction-id") Integer transactionId) {
		// do some magic!
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	public Iterable<Account> accountsGet(
			@NotNull @ApiParam(value = "Including the balance od the account.", required = true, allowableValues = "true, false") @RequestParam(value = "with-balance", required = true) String withBalance,
			@ApiParam(value = "ID of the transaction as determined by the initiating party.", required = true) @RequestHeader(value = "Process-ID", required = true) UUID processID,
			@ApiParam(value = "", required = true) @RequestHeader(value = "Request-ID", required = true) UUID requestID,
			@ApiParam(value = "it is indicated that a PSU has directly asked this account access in real-time. The PSU then might be involved in an additional consent process, if the given consent is not any more sufficient.") @RequestParam(value = "psu-involved", required = false) String psuInvolved,
			@ApiParam(value = "Shall be contained if “Establish Consent Transaction” was performed via this API before.") @RequestHeader(value = "Consent-ID", required = false) String consentID,
			@ApiParam(value = "To be used, if no OAuth Pre-Step was performed.") @RequestHeader(value = "PSU-ID", required = false) String PSU_ID,
			@ApiParam(value = "Is contained only, if the optional OAuth PreStep was performed.") @RequestHeader(value = "Authorization Bearer", required = false) String authorizationBearer) {
		// do some magic!
		Iterable<Account> accountsList=accountService.listAllAccounts(isStatic,withBalance);
		
		if(withBalance.equalsIgnoreCase("true"))
		{
			return accountsList;
		}
		else
		{
			return markBalanceOfAllAccountsAsNull(accountsList);
		}
	}

	private Iterable<Account> markBalanceOfAllAccountsAsNull(Iterable<Account> accountsList) {
		// TODO Auto-generated method stub
		Iterator<Account> accountsListItr=accountsList.iterator();
		while(accountsListItr.hasNext())
		{
			Account account=accountsListItr.next();
			account.setBalances(null);
		}
		return accountsList;
	}

	private Account markBalanceOfAnAccountAsNull(Account account) {
		if(account!=null)
		{
		account.setBalances(null);
		}
		return account;
	}

	
	public ResponseEntity saveAccount(@RequestBody Account account) {
		accountService.saveAccounts(account);
		return new ResponseEntity("Heritage Car saved successfully", HttpStatus.OK);
	}

}
