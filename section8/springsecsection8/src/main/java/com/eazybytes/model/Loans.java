package com.eazybytes.model;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

@Getter
@Entity
@Table(name="loans")
public class Loans {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	@GenericGenerator(name = "native")
	@Column(name = "loan_number")
	private int loanNumber;
	
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name="start_dt")
	private Date startDt;
	
	@Column(name = "loan_type")
	private String loanType;
	
	@Column(name = "total_loan")
	private int totalLoan;
	
	@Column(name = "amount_paid")
	private int amountPaid;
	
	@Column(name = "outstanding_amount")
	private int outstandingAmount;
	
	@Column(name = "create_dt")
	private String createDt;

	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public void setTotalLoan(int totalLoan) {
		this.totalLoan = totalLoan;
	}

	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}

	public void setOutstandingAmount(int outstandingAmount) {
		this.outstandingAmount = outstandingAmount;
	}

	public void setCreateDt(String createDt) {
		this.createDt = createDt;
	}
	
}
