package com.codechallenge.spring.data.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codechallenge.spring.data.domain.User;
import com.codechallenge.spring.data.service.UserManagementService;
import com.tajawal.codechallenge.model.Response;

@RestController
@RequestMapping(value = "/useradmin")
public class UserManagementController {

	@Autowired
	private UserManagementService userManagementService;

	/*
	 * Make an API that generates a verification code for a user and store this code
	 * in a database
	 */
	@RequestMapping(value = "/verification_code/{id}", produces = { "application/json", "application/xml" })
	public Response generateVerficationCode(@PathVariable String id) {
		userManagementService.generatePin(id);
		return new Response("1", "Successful", "");
	}

	/*
	 * Make an API that generates a verification code for a user and store this code
	 * in a database
	 */
	@RequestMapping(value = "/verification_code/{id}/{code}", produces = { "application/json", "application/xml" })
	public Response validateCodebyUserID(@PathVariable String id, @PathVariable String code) {
		return userManagementService.validatePin(id, code);
	}

	@RequestMapping(value = "/")
	public List<User> getAllUsers() {
		return userManagementService.findAll();
	}
}
