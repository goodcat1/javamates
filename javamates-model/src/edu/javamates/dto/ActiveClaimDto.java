package edu.javamates.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * DTO for transfer table of user's active claims
 * 
 * @author Leonid Shitov 16.05.2013
 * 
 */
public class ActiveClaimDto implements Serializable {
	private static final long serialVersionUID = 2684493045996796824L;

	/**
	 * Claim identificator
	 */
	private Long id;
	/**
	 * Datetime of claim creation
	 */
	private Date createDate;
	/**
	 * Claim amount
	 */
	private BigDecimal amount;
	/**
	 * Claim rate
	 */
	private BigDecimal rate;
	/**
	 * Claim period, in months
	 */
	private int period;
	/**
	 * Presentation of claim state
	 */
	private String state;
	/**
	 * Presentation of claim purpose
	 */
	private String purpose;
	/**
	 * Description
	 */
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ActiveClaimDto [id=" + id + ", createDate=" + createDate
				+ ", amount=" + amount + ", rate=" + rate + ", period="
				+ period + ", state=" + state + ", purpose=" + purpose
				+ ", description=" + description + "]";
	}

}
