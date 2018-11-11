package com.mainproject.mutualfunds.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mainproject.mutualfunds.entities.UserFunds;

@Repository
public interface UserFundInfoRepository  extends JpaRepository<UserFunds, String>{
	@Query("select m from UserFunds m where m.email =?1")
	public List<UserFunds> findByEmail(String email);

	@Query("select m from UserFunds m where m.email =?1 and m.fundName = ?2")
	public UserFunds findByEmailAndFundName(String email, String fundName);
}
