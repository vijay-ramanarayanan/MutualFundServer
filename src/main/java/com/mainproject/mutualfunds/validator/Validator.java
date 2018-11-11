package com.mainproject.mutualfunds.validator;

import org.springframework.stereotype.Component;

import com.mainproject.mutualfunds.entities.User;


@Component("validateuserinfo")
public class Validator {

	public boolean validateUserLogin(User user) {
		//return (!(user.getEmail() == null || user.getPassword() == null)) ; 
		return true;
	}	
}
