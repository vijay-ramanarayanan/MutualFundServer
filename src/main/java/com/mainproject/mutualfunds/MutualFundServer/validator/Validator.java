package com.mainproject.mutualfunds.MutualFundServer.validator;

import org.springframework.stereotype.Component;

import com.mainproject.mutualfunds.MutualFundServer.Pojos.User.User;

@Component("validateuserinfo")
public class Validator {

	public boolean validateUserLogin(User user) {
		return (!(user.getEmail() == null || user.getPassword() == null)) ; 
	}	
}
