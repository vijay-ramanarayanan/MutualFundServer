package com.mainproject.mutualfunds.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mutualfunds")
public class Mutualfunds {

	@Id
	private String fundName;
	public String getFundName() {
		return fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getLaunchDate() {
		return launchDate;
	}
	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}
	public String getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}
	public float getMonthlyReturn() {
		return monthlyReturn;
	}
	public void setMonthlyReturn(float monthlyReturn) {
		this.monthlyReturn = monthlyReturn;
	}
	public float getCurrentNav() {
		return currentNav;
	}
	public void setCurrentNav(float currentNav) {
		this.currentNav = currentNav;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getFundClass() {
		return fundClass;
	}
	public void setFundClass(String fundClass) {
		this.fundClass = fundClass;
	}
	public float getOurScore() {
		return ourScore;
	}
	public void setOurScore(float ourScore) {
		this.ourScore = ourScore;
	}
	public float getAsset() {
		return asset;
	}
	public void setAsset(float asset) {
		this.asset = asset;
	}
	private String bank;
	private String email;
	private String website;
	private String launchDate;
	private String recommendation;
	private float monthlyReturn;
	private float currentNav;
	private int rating;
	private String fundClass;
	private float ourScore;
	private float asset;
	
	
	
}
