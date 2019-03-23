package com.codechallenge.spring.data.service;

import java.util.List;

import com.codechallenge.spring.data.domain.User;
import com.tajawal.codechallenge.model.Response;

public interface UserManagementService {

	
	public List<User> findAll();
	
	public Response generatePin(String userID);
	
	public Response validatePin(String userId,String pin);
	
	
	
}
