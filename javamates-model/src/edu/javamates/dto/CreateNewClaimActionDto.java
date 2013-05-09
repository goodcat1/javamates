package edu.javamates.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CreateNewClaimActionDto implements Serializable {
	private static final long serialVersionUID = 5776874272259625439L;

	private BigDecimal amount;
	private Integer period;
	private BigDecimal rate;
	private Long purpose;
	private Date createDate;
	private Long statusId;
	private String description;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Integer getPeriod() {
		return period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public Long getPurpose() {
		return purpose;
	}

	public void setPurpose(Long purpose) {
		this.purpose = purpose;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "CreateNewClaimActionDto [amount=" + amount + ", period="
				+ period + ", rate=" + rate + ", purpose=" + purpose
				+ ", createDate=" + createDate + ", statusId=" + statusId
				+ ", description=" + description + "]";
	}

}
