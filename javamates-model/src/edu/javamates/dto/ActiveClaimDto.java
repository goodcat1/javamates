package edu.javamates.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ActiveClaimDto implements Serializable {
	private static final long serialVersionUID = 2684493045996796824L;

	private Long id;
	private Date createDate;
	private BigDecimal amount;
	private BigDecimal rate;
	private int period;
	private String state;
	private String purpose;
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
