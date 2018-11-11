package com.mainproject.mutualfunds.database.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mainproject.mutualfunds.entities.User;
import com.mainproject.mutualfunds.repositories.UserRepository;

@Component("userInfoService")
public class UserInfoService  {
	
	@Autowired
	private UserRepository userRepository;
	
	public User registerUser(User newUser) {
		
		User user = userRepository.findByEmail(newUser.getEmail());
		if(user == null) {
			userRepository.save(newUser);
			return newUser;
		} else {
			return null;
		}
	}
	
	public User findUser(User logInUser) {
		User user = userRepository.findByEmail(logInUser.getEmail());
		return user;
	}
}
