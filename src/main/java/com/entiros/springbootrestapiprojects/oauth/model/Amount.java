package com.entiros.springbootrestapiprojects.oauth.model;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Amount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-11T03:55:25.506Z")
@Entity
public class Amount implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6162512618317286867L;

	@Id
	private String id = null;

	public Amount id(String id) {
		this.id = id;
		return this;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("currency")
	private String currency = null;

	@JsonProperty("content")
	private Integer content = null;

	public Amount currency(String currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * ISO 4217 code
	 * 
	 * @return currency
	 **/
	@ApiModelProperty(value = "ISO 4217 code")

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Amount content(Integer content) {
		this.content = content;
		return this;
	}

	/**
	 * Get content
	 * 
	 * @return content
	 **/
	@ApiModelProperty(value = "")

	public Integer getContent() {
		return content;
	}

	public void setContent(Integer content) {
		this.content = content;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Amount amount = (Amount) o;
		return Objects.equals(this.currency, amount.currency) && Objects.equals(this.content, amount.content);
	}

	@Override
	public int hashCode() {
		return Objects.hash(currency, content);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Amount {\n");

		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
