package com.mainproject.mutualfunds.database.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mainproject.mutualfunds.entities.Mutualfunds;
import com.mainproject.mutualfunds.repositories.MutualfundRepository;

@Component("mutualfundInfoService")
public class MutualFundInfoService {

	@Autowired
	private MutualfundRepository mutualfundRepository;
	
	public List<Mutualfunds> getMutualFunds(String bank) {
		bank = bank.replace('_',' ');
		return mutualfundRepository.findByBank(bank);
	}
	
}
