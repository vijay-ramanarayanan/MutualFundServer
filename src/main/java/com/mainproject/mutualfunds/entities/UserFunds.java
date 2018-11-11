package com.mainproject.mutualfunds.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserFunds")

public class UserFunds {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFundName() {
		return fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	public int getAmountInvested() {
		return amountInvested;
	}
	public void setAmountInvested(int amountInvested) {
		this.amountInvested = amountInvested;
	}
	private String email;
	private String fundName;
	private int amountInvested;
	
	
	
}
