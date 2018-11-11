package com.mainproject.mutualfunds.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mainproject.mutualfunds.entities.User;

//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, String> {
	public User findByEmail(String email) ;
}

