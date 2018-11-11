package com.mainproject.mutualfunds.database.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mainproject.mutualfunds.entities.UserFunds;
import com.mainproject.mutualfunds.repositories.UserFundInfoRepository;

@Component("userFundInfoService")
public class UserFundInfoService {

	
	@Autowired
	private UserFundInfoRepository userFundInfoRepository;

	
	public List<UserFunds> getUserMutualFunds(String email) {
		return userFundInfoRepository.findByEmail(email);
	}
	
	public void updateUserFund(String email, String fundName, int amount) {
		UserFunds userFunds =  userFundInfoRepository.findByEmailAndFundName(email, fundName);
		if(userFunds !=null) {
			System.out.println("---------------REached this block----------------");
			System.out.println(userFunds.getEmail());

			userFunds.setAmountInvested(userFunds.getAmountInvested() + amount);
			userFundInfoRepository.save(userFunds);

		} else {
			System.out.println("---------------HERE----------------");
			userFunds = new UserFunds();
			userFunds.setEmail(email);
			userFunds.setFundName(fundName);
			userFunds.setAmountInvested(amount);
			userFundInfoRepository.save(userFunds);
			System.out.println("---------------UPDATED----------------");

		}
	}
}
