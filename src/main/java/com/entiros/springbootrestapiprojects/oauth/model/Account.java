package com.entiros.springbootrestapiprojects.oauth.model;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.Valid;
/**
 * Account
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-11T03:55:25.506Z")
@Entity
public class Account  implements Serializable {
  /**
	 * 
	 */
	private static final long serialVersionUID = 7434282649038801804L;

@JsonProperty("id")
  @Id
  private String id = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("bban")
  private String bban = null;

  @JsonProperty("pan")
  private String pan = null;

  @JsonProperty("msisdn")
  private String msisdn = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("account_type")
  private String accountType = null;

  @JsonProperty("bic")
  private String bic = null;

  @JsonProperty("balances")
  @OneToOne(cascade=CascadeType.PERSIST)
  private Balances balances = null;

  @JsonProperty("currency")
  private String currency = null;
/*
  @JsonProperty("links")
  @OneToOne(cascade=CascadeType.PERSIST)
  private Links links = null;*/

  public Account id(String id) {
    this.id = id;
    return this;
  }

   /**
   * This is the data element to be used in the path when retrieving data from a dedicated account.
   * @return id
  **/
  @ApiModelProperty(value = "This is the data element to be used in the path when retrieving data from a dedicated account.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Account iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * This data element can be used in the body of the Consent Request Message for retrieving account access consent from this payment account.
   * @return iban
  **/
  @ApiModelProperty(value = "This data element can be used in the body of the Consent Request Message for retrieving account access consent from this payment account.")


  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public Account bban(String bban) {
    this.bban = bban;
    return this;
  }

   /**
   * This data element can be used in the body of the Consent Request Message for retrieving account access consent from this account. This data elements is used for payment accounts which have no IBAN.
   * @return bban
  **/
  @ApiModelProperty(value = "This data element can be used in the body of the Consent Request Message for retrieving account access consent from this account. This data elements is used for payment accounts which have no IBAN.")


  public String getBban() {
    return bban;
  }

  public void setBban(String bban) {
    this.bban = bban;
  }

  public Account pan(String pan) {
    this.pan = pan;
    return this;
  }

   /**
   * Primary Account Number (PAN) of a card, can be tokenized by the ASPSP due to PCI DSS requirements. This data element can be used in the body of the Consent Request Message for retrieving account access consent from this card.
   * @return pan
  **/
  @ApiModelProperty(value = "Primary Account Number (PAN) of a card, can be tokenized by the ASPSP due to PCI DSS requirements. This data element can be used in the body of the Consent Request Message for retrieving account access consent from this card.")


  public String getPan() {
    return pan;
  }

  public void setPan(String pan) {
    this.pan = pan;
  }

  public Account msisdn(String msisdn) {
    this.msisdn = msisdn;
    return this;
  }

   /**
   * An alias to access a payment account via a registered mobile phone number. This alias might be needed e.g. in the payment initiation service. The support of this alias must be explicitly documented by the ASPSP for the corresponding API Calls.
   * @return msisdn
  **/
  @ApiModelProperty(value = "An alias to access a payment account via a registered mobile phone number. This alias might be needed e.g. in the payment initiation service. The support of this alias must be explicitly documented by the ASPSP for the corresponding API Calls.")


  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public Account name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name given by the bank or the PSU in OnlineBanking.
   * @return name
  **/
  @ApiModelProperty(value = "Name given by the bank or the PSU in OnlineBanking.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Account accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Product Name of the Bank for this account
   * @return accountType
  **/
  @ApiModelProperty(value = "Product Name of the Bank for this account")


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public Account bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * The BIC associated to the account.
   * @return bic
  **/
  @ApiModelProperty(value = "The BIC associated to the account.")


  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public Account balances(Balances balances) {
    this.balances = balances;
    return this;
  }

   /**
   * Get balances
   * @return balances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Balances getBalances() {
    return balances;
  }

  public void setBalances(Balances balances) {
    this.balances = balances;
  }

  public Account currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * ISO 4217 code
   * @return currency
  **/
  @ApiModelProperty(value = "ISO 4217 code")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

/*  public Account links(Links links) {
    this.links = links;
    return this;
  }

   *//**
   * Links to the account, which can be directly used for retrieving account information from this dedicated account. Links to “balances” and/or “transactions”
   * @return links
  **//*
  @ApiModelProperty(value = "Links to the account, which can be directly used for retrieving account information from this dedicated account. Links to “balances” and/or “transactions”")

  @Valid

  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }
*/

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.iban, account.iban) &&
        Objects.equals(this.bban, account.bban) &&
        Objects.equals(this.pan, account.pan) &&
        Objects.equals(this.msisdn, account.msisdn) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.accountType, account.accountType) &&
        Objects.equals(this.bic, account.bic) &&
        Objects.equals(this.balances, account.balances) &&
        Objects.equals(this.currency, account.currency);
       // Objects.equals(this.links, account.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, iban, bban, pan, msisdn, name, accountType, bic, balances, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bban: ").append(toIndentedString(bban)).append("\n");
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    //sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

