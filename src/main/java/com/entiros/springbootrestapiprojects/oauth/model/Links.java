package com.entiros.springbootrestapiprojects.oauth.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
/**
 * Links
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-11T03:55:25.506Z")
@Entity
public class Links  implements Serializable {
	
  /**
	 * 
	 */
	private static final long serialVersionUID = 740090674701760884L;

@Id
  @JsonProperty("redirect")
  private String redirect = null;

  @JsonProperty("update_psu_identification")
  private String updatePsuIdentification = null;

  @JsonProperty("update_psu_authentication")
  private String updatePsuAuthentication = null;

  @JsonProperty("select_authentication_method")
  private String selectAuthenticationMethod = null;

  @JsonProperty("authorise_ transaction")
  private String authoriseTransaction = null;

  @JsonProperty("self")
  private String self = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("account-link")
  private String accountLink = null;

  @JsonProperty("balances")
  private String balances = null;

  @JsonProperty("transactions")
  private String transactions = null;

  @JsonProperty("first_page_link")
  private String firstPageLink = null;

  @JsonProperty("second_page_link")
  private String secondPageLink = null;

  @JsonProperty("current_page_link")
  private String currentPageLink = null;

  @JsonProperty("last_page_link")
  private String lastPageLink = null;

  public Links redirect(String redirect) {
    this.redirect = redirect;
    return this;
  }

   /**
   * A link to an ASPSP site where SCA is performed within the Redirect SCA approach.
   * @return redirect
  **/
  @ApiModelProperty(value = "A link to an ASPSP site where SCA is performed within the Redirect SCA approach.")


  public String getRedirect() {
    return redirect;
  }

  public void setRedirect(String redirect) {
    this.redirect = redirect;
  }

  public Links updatePsuIdentification(String updatePsuIdentification) {
    this.updatePsuIdentification = updatePsuIdentification;
    return this;
  }

   /**
   * The link to the payment initiation or account information resource, which needs to be updated by the psu identification if not delivered yet.
   * @return updatePsuIdentification
  **/
  @ApiModelProperty(value = "The link to the payment initiation or account information resource, which needs to be updated by the psu identification if not delivered yet.")


  public String getUpdatePsuIdentification() {
    return updatePsuIdentification;
  }

  public void setUpdatePsuIdentification(String updatePsuIdentification) {
    this.updatePsuIdentification = updatePsuIdentification;
  }

  public Links updatePsuAuthentication(String updatePsuAuthentication) {
    this.updatePsuAuthentication = updatePsuAuthentication;
    return this;
  }

   /**
   * The link to the payment initiation or account information resource, which needs to be updated by a psu password and eventually the psu identification if not delivered yet.
   * @return updatePsuAuthentication
  **/
  @ApiModelProperty(value = "The link to the payment initiation or account information resource, which needs to be updated by a psu password and eventually the psu identification if not delivered yet.")


  public String getUpdatePsuAuthentication() {
    return updatePsuAuthentication;
  }

  public void setUpdatePsuAuthentication(String updatePsuAuthentication) {
    this.updatePsuAuthentication = updatePsuAuthentication;
  }

  public Links selectAuthenticationMethod(String selectAuthenticationMethod) {
    this.selectAuthenticationMethod = selectAuthenticationMethod;
    return this;
  }

   /**
   * This is a link to a resource, where the TPP can select the applicable second factor authentication methods for the PSU, if there were several available authentication methods.
   * @return selectAuthenticationMethod
  **/
  @ApiModelProperty(value = "This is a link to a resource, where the TPP can select the applicable second factor authentication methods for the PSU, if there were several available authentication methods.")


  public String getSelectAuthenticationMethod() {
    return selectAuthenticationMethod;
  }

  public void setSelectAuthenticationMethod(String selectAuthenticationMethod) {
    this.selectAuthenticationMethod = selectAuthenticationMethod;
  }

  public Links authoriseTransaction(String authoriseTransaction) {
    this.authoriseTransaction = authoriseTransaction;
    return this;
  }

   /**
   * The link to the payment initiation or consent resource, where the “Transaction Authorization”Request“ is sent to. This is the link to the resource which will authorize the payment or the consent by checking the SCA authentication data within the Embedded SCA approach.
   * @return authoriseTransaction
  **/
  @ApiModelProperty(value = "The link to the payment initiation or consent resource, where the “Transaction Authorization”Request“ is sent to. This is the link to the resource which will authorize the payment or the consent by checking the SCA authentication data within the Embedded SCA approach.")


  public String getAuthoriseTransaction() {
    return authoriseTransaction;
  }

  public void setAuthoriseTransaction(String authoriseTransaction) {
    this.authoriseTransaction = authoriseTransaction;
  }

  public Links self(String self) {
    this.self = self;
    return this;
  }

   /**
   * The link to the payment initiation resource created by the request itself. This link can be used later to retrieve the transaction status of the payment initiation.
   * @return self
  **/
  @ApiModelProperty(value = "The link to the payment initiation resource created by the request itself. This link can be used later to retrieve the transaction status of the payment initiation.")


  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public Links status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Links accountLink(String accountLink) {
    this.accountLink = accountLink;
    return this;
  }

   /**
   * Get accountLink
   * @return accountLink
  **/
  @ApiModelProperty(value = "")


  public String getAccountLink() {
    return accountLink;
  }

  public void setAccountLink(String accountLink) {
    this.accountLink = accountLink;
  }

  public Links balances(String balances) {
    this.balances = balances;
    return this;
  }

   /**
   * A link to the resource providing the balance of a dedicated account.
   * @return balances
  **/
  @ApiModelProperty(value = "A link to the resource providing the balance of a dedicated account.")


  public String getBalances() {
    return balances;
  }

  public void setBalances(String balances) {
    this.balances = balances;
  }

  public Links transactions(String transactions) {
    this.transactions = transactions;
    return this;
  }

   /**
   * A link to the resource providing the transaction history of a dediated amount.
   * @return transactions
  **/
  @ApiModelProperty(value = "A link to the resource providing the transaction history of a dediated amount.")


  public String getTransactions() {
    return transactions;
  }

  public void setTransactions(String transactions) {
    this.transactions = transactions;
  }

  public Links firstPageLink(String firstPageLink) {
    this.firstPageLink = firstPageLink;
    return this;
  }

   /**
   * Navigation link for account reports.
   * @return firstPageLink
  **/
  @ApiModelProperty(value = "Navigation link for account reports.")


  public String getFirstPageLink() {
    return firstPageLink;
  }

  public void setFirstPageLink(String firstPageLink) {
    this.firstPageLink = firstPageLink;
  }

  public Links secondPageLink(String secondPageLink) {
    this.secondPageLink = secondPageLink;
    return this;
  }

   /**
   * Navigation link for account reports.
   * @return secondPageLink
  **/
  @ApiModelProperty(value = "Navigation link for account reports.")


  public String getSecondPageLink() {
    return secondPageLink;
  }

  public void setSecondPageLink(String secondPageLink) {
    this.secondPageLink = secondPageLink;
  }

  public Links currentPageLink(String currentPageLink) {
    this.currentPageLink = currentPageLink;
    return this;
  }

   /**
   * Navigation link for account reports.
   * @return currentPageLink
  **/
  @ApiModelProperty(value = "Navigation link for account reports.")


  public String getCurrentPageLink() {
    return currentPageLink;
  }

  public void setCurrentPageLink(String currentPageLink) {
    this.currentPageLink = currentPageLink;
  }

  public Links lastPageLink(String lastPageLink) {
    this.lastPageLink = lastPageLink;
    return this;
  }

   /**
   * Navigation link for account reports.
   * @return lastPageLink
  **/
  @ApiModelProperty(value = "Navigation link for account reports.")


  public String getLastPageLink() {
    return lastPageLink;
  }

  public void setLastPageLink(String lastPageLink) {
    this.lastPageLink = lastPageLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Links links = (Links) o;
    return Objects.equals(this.redirect, links.redirect) &&
        Objects.equals(this.updatePsuIdentification, links.updatePsuIdentification) &&
        Objects.equals(this.updatePsuAuthentication, links.updatePsuAuthentication) &&
        Objects.equals(this.selectAuthenticationMethod, links.selectAuthenticationMethod) &&
        Objects.equals(this.authoriseTransaction, links.authoriseTransaction) &&
        Objects.equals(this.self, links.self) &&
        Objects.equals(this.status, links.status) &&
        Objects.equals(this.accountLink, links.accountLink) &&
        Objects.equals(this.balances, links.balances) &&
        Objects.equals(this.transactions, links.transactions) &&
        Objects.equals(this.firstPageLink, links.firstPageLink) &&
        Objects.equals(this.secondPageLink, links.secondPageLink) &&
        Objects.equals(this.currentPageLink, links.currentPageLink) &&
        Objects.equals(this.lastPageLink, links.lastPageLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirect, updatePsuIdentification, updatePsuAuthentication, selectAuthenticationMethod, authoriseTransaction, self, status, accountLink, balances, transactions, firstPageLink, secondPageLink, currentPageLink, lastPageLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
    sb.append("    updatePsuIdentification: ").append(toIndentedString(updatePsuIdentification)).append("\n");
    sb.append("    updatePsuAuthentication: ").append(toIndentedString(updatePsuAuthentication)).append("\n");
    sb.append("    selectAuthenticationMethod: ").append(toIndentedString(selectAuthenticationMethod)).append("\n");
    sb.append("    authoriseTransaction: ").append(toIndentedString(authoriseTransaction)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    accountLink: ").append(toIndentedString(accountLink)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    firstPageLink: ").append(toIndentedString(firstPageLink)).append("\n");
    sb.append("    secondPageLink: ").append(toIndentedString(secondPageLink)).append("\n");
    sb.append("    currentPageLink: ").append(toIndentedString(currentPageLink)).append("\n");
    sb.append("    lastPageLink: ").append(toIndentedString(lastPageLink)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

