package com.adi.model.transaction;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {

	private String transactionId;

	private String clientId;

	private String securityId;

	private TransactionType transactionType;

	private Date transactionDate;

	private Double marketValue;

	private boolean priorityFlag;
	
	private int processingfee;
	
	private String dummyDate;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getSecurityId() {
		return securityId;
	}

	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Double getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(Double marketValue) {
		this.marketValue = marketValue;
	}

	public boolean isPriorityFlag() {
		return priorityFlag;
	}

	public void setPriorityFlag(boolean priorityFlag) {
		this.priorityFlag = priorityFlag;
	}

	public int getProcessingfee() {
		return processingfee;
	}

	public void setProcessingfee(int processingfee) {
		this.processingfee = processingfee;
	}

	public String getDummyDate() {
		return dummyDate;
	}

	public void setDummyDate(String dummyDate) {
		this.dummyDate = dummyDate;
	}

}
