package com.mainproject.mutualfunds.MutualFundServer.restServices;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mainproject.mutualfunds.MutualFundServer.Pojos.User.User;
import com.mainproject.mutualfunds.MutualFundServer.validator.Validator;

@RestController
public class UserServices {
	
	@Autowired
	private Validator validator;
	
    @CrossOrigin(origins = "*")
	@PostMapping(path = "/login", consumes = "application/json")
	public Map<String, String> userLogin( @RequestBody User user) {
    	Map<String, String> hmap = new HashMap<>();
		try {
			if(validator.validateUserLogin(user))
				hmap.put("status", "Success");
			else 
				hmap.put("status", "Failure");
				return hmap;
		} catch(Exception e) {
			hmap.put("Result", "Failure");
			return hmap;

		} 
	}
}
