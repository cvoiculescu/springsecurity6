package com.eazybytes.model;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

@Getter
@Entity
@Table(name = "cards")
public class Cards {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	@GenericGenerator(name = "native")
	@Column(name = "card_id")
	private int cardId;

	@Column(name = "customer_id")
	private int customerId;

	@Column(name = "card_number")
	private String cardNumber;

	@Column(name = "card_type")
	private String cardType;

	@Column(name = "total_limit")
	private int totalLimit;

	@Column(name = "amount_used")
	private int amountUsed;

	@Column(name = "available_amount")
	private int availableAmount;

	@Column(name = "create_dt")
	private Date createDt;

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public void setTotalLimit(int totalLimit) {
		this.totalLimit = totalLimit;
	}

	public void setAmountUsed(int amountUsed) {
		this.amountUsed = amountUsed;
	}

	public void setAvailableAmount(int availableAmount) {
		this.availableAmount = availableAmount;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}
	
}
