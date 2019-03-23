package com.codechallenge.spring.data.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.codechallenge.spring.data.domain.User;

public interface UserManagementQueryRepository extends Repository<User, Long> {
	@Query(value = "select u from User u where u.userID=:userID AND u.pin=:pin")
	List<User> validatePinByUserID(@Param("userID") String userID,@Param("pin") String pin);
	List<User> findAll();
}
