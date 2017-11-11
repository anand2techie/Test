package com.entiros.springbootrestapiprojects.oauth.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.Valid;

/**
 * Balances
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-11T03:55:25.506Z")
@Entity
public class Balances {

	@Id
	private String id = null;
	
	  public Balances id(String id) {
		    this.id = id;
		    return this;
		  }
	  
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("booked")
	@OneToOne
	private SingleBalance booked = null;

	@JsonProperty("expected")
	@OneToOne
	private SingleBalance expected = null;

	@JsonProperty("authorised")
	@OneToOne
	private SingleBalance authorised = null;

	@JsonProperty("opening_booked")
	@OneToOne
	private SingleBalance openingBooked = null;

	@JsonProperty("closing_booked")
	@OneToOne
	private SingleBalance closingBooked = null;

	@JsonProperty("interim_available")
	@OneToOne
	private SingleBalance interimAvailable = null;

	public Balances booked(SingleBalance booked) {
		this.booked = booked;
		return this;
	}

	/**
	 * Last known book balance of the account.
	 * 
	 * @return booked
	 **/
	@ApiModelProperty(value = "Last known book balance of the account.")

	@Valid

	public SingleBalance getBooked() {
		return booked;
	}

	public void setBooked(SingleBalance booked) {
		this.booked = booked;
	}

	public Balances expected(SingleBalance expected) {
		this.expected = expected;
		return this;
	}

	/**
	 * Balance composed of booked entries and pending items known at the time of
	 * calculation, which projects the end of day balance if everything is
	 * booked on the account and no other entry is posted.
	 * 
	 * @return expected
	 **/
	@ApiModelProperty(value = "Balance composed of booked entries and pending items known at the time of calculation, which projects the end of day balance if everything is booked on the account and no other entry is posted.")

	@Valid

	public SingleBalance getExpected() {
		return expected;
	}

	public void setExpected(SingleBalance expected) {
		this.expected = expected;
	}

	public Balances authorised(SingleBalance authorised) {
		this.authorised = authorised;
		return this;
	}

	/**
	 * The expected balance together with the value of a pre-approved credit
	 * line the ASPSP makes permanently available to the user.
	 * 
	 * @return authorised
	 **/
	@ApiModelProperty(value = "The expected balance together with the value of a pre-approved credit line the ASPSP makes permanently available to the user.")

	@Valid

	public SingleBalance getAuthorised() {
		return authorised;
	}

	public void setAuthorised(SingleBalance authorised) {
		this.authorised = authorised;
	}

	public Balances openingBooked(SingleBalance openingBooked) {
		this.openingBooked = openingBooked;
		return this;
	}

	/**
	 * Book balance of the account at the beginning of the account reporting
	 * period. It always equals the closing book balance from the previous
	 * report.
	 * 
	 * @return openingBooked
	 **/
	@ApiModelProperty(value = "Book balance of the account at the beginning of the account reporting period. It always equals the closing book balance from the previous report.")

	@Valid

	public SingleBalance getOpeningBooked() {
		return openingBooked;
	}

	public void setOpeningBooked(SingleBalance openingBooked) {
		this.openingBooked = openingBooked;
	}

	public Balances closingBooked(SingleBalance closingBooked) {
		this.closingBooked = closingBooked;
		return this;
	}

	/**
	 * Balance of the account at the end of the pre-agreed account reporting
	 * period. It is the sum of the opening booked balance at the beginning of
	 * the period and all entries booked to the account during the preagreed
	 * account reporting period.
	 * 
	 * @return closingBooked
	 **/
	@ApiModelProperty(value = "Balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the preagreed account reporting period.")

	@Valid

	public SingleBalance getClosingBooked() {
		return closingBooked;
	}

	public void setClosingBooked(SingleBalance closingBooked) {
		this.closingBooked = closingBooked;
	}

	public Balances interimAvailable(SingleBalance interimAvailable) {
		this.interimAvailable = interimAvailable;
		return this;
	}

	/**
	 * Available balance calculated in the course of the account ’ervicer's
	 * business day, at the time specified, and subject to further changes
	 * during the business day. The interim balance is calculated on the basis
	 * of booked credit and debit items during the calculation time/period
	 * specified.
	 * 
	 * @return interimAvailable
	 **/
	@ApiModelProperty(value = "Available balance calculated in the course of the account ’ervicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.")

	@Valid

	public SingleBalance getInterimAvailable() {
		return interimAvailable;
	}

	public void setInterimAvailable(SingleBalance interimAvailable) {
		this.interimAvailable = interimAvailable;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Balances balances = (Balances) o;
		return Objects.equals(this.booked, balances.booked) && Objects.equals(this.expected, balances.expected)
				&& Objects.equals(this.authorised, balances.authorised)
				&& Objects.equals(this.openingBooked, balances.openingBooked)
				&& Objects.equals(this.closingBooked, balances.closingBooked)
				&& Objects.equals(this.interimAvailable, balances.interimAvailable);
	}

	@Override
	public int hashCode() {
		return Objects.hash(booked, expected, authorised, openingBooked, closingBooked, interimAvailable);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Balances {\n");

		sb.append("    booked: ").append(toIndentedString(booked)).append("\n");
		sb.append("    expected: ").append(toIndentedString(expected)).append("\n");
		sb.append("    authorised: ").append(toIndentedString(authorised)).append("\n");
		sb.append("    openingBooked: ").append(toIndentedString(openingBooked)).append("\n");
		sb.append("    closingBooked: ").append(toIndentedString(closingBooked)).append("\n");
		sb.append("    interimAvailable: ").append(toIndentedString(interimAvailable)).append("\n");
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
