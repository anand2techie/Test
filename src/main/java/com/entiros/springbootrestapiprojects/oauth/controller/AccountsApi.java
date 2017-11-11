/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.entiros.springbootrestapiprojects.oauth.controller;

import java.util.UUID;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.entiros.springbootrestapiprojects.oauth.model.Account;
import com.entiros.springbootrestapiprojects.oauth.model.ErrorModel;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-11T03:55:25.506Z")

@Api(value = "accounts", description = "the accounts API")
public interface AccountsApi {

    @ApiOperation(value = "Account resource", notes = "Reads the balance of a given account if the additional parameter “with-balance” is added, otherwise just gives detailed information about the addressed account.", response = Void.class, authorizations = {
        @Authorization(value = "APIKeyQueryParam")
    }, tags={ "account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorModel.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorModel.class) })
    
    @RequestMapping(value = "/accounts/{account-id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Void> accountsAccountIdGet(@ApiParam(value = "Account ID",required=true ) @PathVariable("account-id") Integer accountId, @NotNull@ApiParam(value = "Including the balance od the account.", required = true, allowableValues = "true, false") @RequestParam(value = "with-balance", required = true) String withBalance,@ApiParam(value = "ID of the transaction as determined by the initiating party. In case of a once off read data request, this Process-ID equals the Process-ID of the corresponding Account Information Consent Request." ,required=true) @RequestHeader(value="Process-ID", required=true) UUID processID,@ApiParam(value = "" ,required=true) @RequestHeader(value="Request-ID", required=true) UUID requestID,@ApiParam(value = "Standard https header element for Date and Time." ,required=true) @RequestHeader(value="date", required=true) String date,@ApiParam(value = "" ) @RequestHeader(value="Consent-ID", required=false) String consentID,@ApiParam(value = "To be used, if no OAuth Pre-Step was performed." ) @RequestHeader(value="PSU-ID", required=false) String PSU_ID,@ApiParam(value = "Is contained only, if the optional OAuth PreStep was performed." ) @RequestHeader(value="Authorization Bearer", required=false) String authorizationBearer);


    @ApiOperation(value = "Account resource", notes = "Reads a transaction list For a given account, additional parameters are e.g. the attributes “date_from” and “date_to”. If the attribute “withbalance” is used, the ASPSP will add balances to the transaction list. The latter might be provided by the ASPSP anyhow, if transaction lists without balances are not supported.", response = Void.class, authorizations = {
        @Authorization(value = "APIKeyQueryParam")
    }, tags={ "account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorModel.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorModel.class) })
    
    @RequestMapping(value = "/accounts/{account-id}/transactions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Void> accountsAccountIdTransactionsGet(@ApiParam(value = "Account ID",required=true ) @PathVariable("account-id") Integer accountId);


    @ApiOperation(value = "Account resource", notes = "Reads transaction details of an addressed transaction.", response = Void.class, authorizations = {
        @Authorization(value = "APIKeyQueryParam")
    }, tags={ "account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorModel.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorModel.class) })
    
    @RequestMapping(value = "/accounts/{account-id}/transactions/{transaction-id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Void> accountsAccountIdTransactionsTransactionIdGet(@ApiParam(value = "Account ID",required=true ) @PathVariable("account-id") Integer accountId,@ApiParam(value = "Transaction ID",required=true ) @PathVariable("transaction-id") Integer transactionId);


    @ApiOperation(value = "Account resource", notes = "Reads all available account ids, in addition with balance if the optional parameter “with-balance” is used in the method.", response = Account.class, authorizations = {
        @Authorization(value = "APIKeyQueryParam")
    }, tags={ "account", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorModel.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorModel.class) })
    
    @GetMapping(value = "/accounts")
    Iterable<Account> accountsGet( @NotNull@ApiParam(value = "Including the balance od the account.", required = true, allowableValues = "true, false") @RequestParam(value = "with-balance", required = true) String withBalance,@ApiParam(value = "ID of the transaction as determined by the initiating party." ,required=true) @RequestHeader(value="Process-ID", required=true) UUID processID,@ApiParam(value = "" ,required=true) @RequestHeader(value="Request-ID", required=true) UUID requestID,@ApiParam(value = "it is indicated that a PSU has directly asked this account access in real-time. The PSU then might be involved in an additional consent process, if the given consent is not any more sufficient.") @RequestParam(value = "psu-involved", required = false) String psuInvolved,@ApiParam(value = "Shall be contained if “Establish Consent Transaction” was performed via this API before." ) @RequestHeader(value="Consent-ID", required=false) String consentID,@ApiParam(value = "To be used, if no OAuth Pre-Step was performed." ) @RequestHeader(value="PSU-ID", required=false) String PSU_ID,@ApiParam(value = "Is contained only, if the optional OAuth PreStep was performed." ) @RequestHeader(value="Authorization Bearer", required=false) String authorizationBearer);

 // ----------Add a new Heritage Car to the Inventory-----------
 		@ApiOperation(value = "Add a new account")
 		@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully Added a new Heritage Car"),
 				@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
 				@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
 				@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
 		@PostMapping("/accountsSave")
 		public ResponseEntity saveAccount(@RequestBody Account account);
}