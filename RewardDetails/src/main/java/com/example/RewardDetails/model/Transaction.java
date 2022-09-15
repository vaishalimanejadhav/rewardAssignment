package com.example.RewardDetails.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table( name = "transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false, unique = true)
	private Long trasactionId;
	public Integer getcustomerId() {
		return customerId;
	}
	public void setcustomerId(Integer customerId) {
		this.customerId = customerId;
	}



	@JsonIgnore
	private Integer customerId;
	private Double amount;
	private String description;
	//@Temporal(TemporalType.DATE)

	private Date transactionDate;
	public Transaction() {
		super();
	}
	public Transaction(Long trasactionId, Integer customerId, Double total, String description, Date date) {
		super();
		this.trasactionId = trasactionId;
		this.customerId = customerId;
		this.amount = total;
		this.description = description;
		this.transactionDate = date;
	}

	
	
	public Double getAmount() {
		return amount;
	}
	public Long getTrasactionId() {
		return trasactionId;
	}
	public void setTrasactionId(Long trasactionId) {
		this.trasactionId = trasactionId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	
	@Override
	public String toString() {
		return String.format("MyTransaction [id=%s, customer=%s, total=%s, description=%s, saveDate=%s]", trasactionId, customerId,
				amount, description, transactionDate);
	}
	
}
