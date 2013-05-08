package edu.javamates.entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Claim
 * 
 */
@Entity
@Table(name = "CLAIM")
@NamedQueries({ @NamedQuery(name = "Claim.findByUserId", query = "SELECT OBJECT(c) FROM Claim c WHERE c.userId = :userId") })
public class Claim implements Serializable {
	private static final long serialVersionUID = 2358695393079505762L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "user_id")
	private Long userId;
	private BigDecimal amount;
	private Integer period;
	private BigDecimal rate;
	@Column(name = "purpose_id")
	private Long purposeId;
	@Column(name = "create_date")
	private Date createDate;
	@Column(name = "status_id")
	private Long statusId;
	private String description;

	public Claim() {
		super();
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public Long getPurposeId() {
		return this.purposeId;
	}

	public void setPurposeId(Long purposeId) {
		this.purposeId = purposeId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Claim [id=" + id + ", userId=" + userId + ", amount=" + amount
				+ ", period=" + period + ", rate=" + rate + ", purposeId="
				+ purposeId + ", createDate=" + createDate + ", statusId="
				+ statusId + ", description=" + description + "]";
	}

}
