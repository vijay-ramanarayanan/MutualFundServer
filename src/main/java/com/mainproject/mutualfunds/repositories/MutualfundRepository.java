package com.mainproject.mutualfunds.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mainproject.mutualfunds.entities.Mutualfunds;

@Repository
public interface MutualfundRepository extends JpaRepository<Mutualfunds, String>  {
	
	@Query("select m from Mutualfunds m where m.bank =?1")
	public List<Mutualfunds> findByBank(String bankName);
}
