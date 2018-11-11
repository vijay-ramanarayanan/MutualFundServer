package com.mainproject.mutualfunds.restServices;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mainproject.mutualfunds.database.services.UserFundInfoService;
import com.mainproject.mutualfunds.database.services.UserInfoService;
import com.mainproject.mutualfunds.entities.User;
import com.mainproject.mutualfunds.entities.UserFunds;

@RestController
public class UserRestService {
	
	
	@Autowired
	private UserInfoService userInfoService; 
	
	@Autowired
	private UserFundInfoService userFundInfoService;
	
	
    @CrossOrigin(origins = "*")
	@PostMapping(path = "/register", consumes = "application/json", produces = "application/json")
	public User userRegister( @RequestBody User user) {
		try {
			return userInfoService.registerUser(user);
		} catch(Exception e) {
			return null;
		} 
	}
    
    @CrossOrigin(origins = "*")
	@PostMapping(path = "/login", consumes = "application/json", produces = "application/json")
	public Map<String, String> userLogin( @RequestBody User logInUser) {
    	Map<String, String> hashMap = new HashMap<>();
		try {
			User user = userInfoService.findUser(logInUser);

			if(user.getPassword() .equals(logInUser.getPassword())) {
				hashMap.put("email", user.getEmail());
				hashMap.put("firstName", user.getFirstName());
				hashMap.put("lastName", user.getLastName());
				return hashMap;
			} else {
				return null;
			}
		} catch(Exception e) {
			return null;
		} 
	}
    
    @CrossOrigin(origins = "*")
	@PostMapping(path = "/myMutualFunds", consumes = "application/json", produces = "application/json")
	public List<UserFunds> getUserMutualFunds(@RequestBody UserFunds user) {
		try {
			return userFundInfoService.getUserMutualFunds(user.getEmail());
		} catch(Exception e) {
			return null;
		} 
	}
}
