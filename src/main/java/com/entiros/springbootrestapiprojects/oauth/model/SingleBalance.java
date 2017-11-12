package com.entiros.springbootrestapiprojects.oauth.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.Valid;

/**
 * SingleBalance
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-11T03:55:25.506Z")
@Entity
public class SingleBalance {
	@Id
	private String id = null;
	
	 public SingleBalance id(String id) {
		    this.id = id;
		    return this;
		  }
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@JsonProperty("amount")
	@OneToOne(cascade=CascadeType.PERSIST)
	private Amount amount = null;

	@JsonProperty("last_action_date_time")
	private DateTime lastActionDateTime = null;

	@JsonProperty("date")
	private LocalDate date = null;

	public SingleBalance amount(Amount amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Get amount
	 * 
	 * @return amount
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public SingleBalance lastActionDateTime(DateTime lastActionDateTime) {
		this.lastActionDateTime = lastActionDateTime;
		return this;
	}

	/**
	 * Get lastActionDateTime
	 * 
	 * @return lastActionDateTime
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public DateTime getLastActionDateTime() {
		return lastActionDateTime;
	}

	public void setLastActionDateTime(DateTime lastActionDateTime) {
		this.lastActionDateTime = lastActionDateTime;
	}

	public SingleBalance date(LocalDate date) {
		this.date = date;
		return this;
	}

	/**
	 * Get date
	 * 
	 * @return date
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SingleBalance singleBalance = (SingleBalance) o;
		return Objects.equals(this.amount, singleBalance.amount)
				&& Objects.equals(this.lastActionDateTime, singleBalance.lastActionDateTime)
				&& Objects.equals(this.date, singleBalance.date);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, lastActionDateTime, date);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SingleBalance {\n");

		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    lastActionDateTime: ").append(toIndentedString(lastActionDateTime)).append("\n");
		sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
