package com.mainproject.mutualfunds.restServices;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mainproject.mutualfunds.database.services.MutualFundInfoService;
import com.mainproject.mutualfunds.database.services.UserFundInfoService;
import com.mainproject.mutualfunds.entities.Mutualfunds;
import com.mainproject.mutualfunds.entities.UserFunds;

@RestController
public class MutualFundServices {

	@Autowired
	private MutualFundInfoService mutualFundInfoService;
	
	@Autowired
	private UserFundInfoService userFundInfoService;
	
    @CrossOrigin(origins = "*")
	@GetMapping(path = "/mutual-funds/{fundName}", produces = "application/json")
    public List<Mutualfunds> getMutualFundInfo(@PathVariable String fundName) {
    	return mutualFundInfoService.getMutualFunds(fundName);
    }
    
    
	
    @CrossOrigin(origins = "*")
	@PostMapping(path = "/add-fund", consumes = "application/json", produces = "application/json")
	public Map<String, String> userRegister( @RequestBody UserFunds userFunds) {
    	Map<String, String> hmap = new HashMap<>();
		try {
			hmap.put("Status", "Success");
			userFundInfoService.updateUserFund(userFunds.getEmail(), userFunds.getFundName(), userFunds.getAmountInvested());
			return hmap;
		} catch(Exception e) {
			return null;
		} 
	}

    

}
