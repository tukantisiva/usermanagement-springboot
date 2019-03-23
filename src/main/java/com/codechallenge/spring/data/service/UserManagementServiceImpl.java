package com.codechallenge.spring.data.service;

import java.security.SecureRandom;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codechallenge.spring.data.domain.User;
import com.tajawal.codechallenge.model.Response;

@Service
@Transactional
public class UserManagementServiceImpl implements UserManagementService {

	@Autowired
	private UserManagmentRepository userManagmentRepository;

	@Autowired
	private UserManagementQueryRepository userManagementQueryRepository;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub

		return userManagementQueryRepository.findAll();
	}

	@Override
	public Response generatePin(String userID) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUserID(userID);

		user.setPin(getAlphaNumeric(6));

		userManagmentRepository.save(user);
		return null;
	}

	public String getAlphaNumeric(int len) {

		char[] ch = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();

		char[] c = new char[len];
		SecureRandom random = new SecureRandom();
		for (int i = 0; i < len; i++) {
			c[i] = ch[random.nextInt(ch.length)];
		}

		return new String(c);
	}

	@Override
	public Response validatePin(String userId, String pin) {
		//
		Response res = new Response();
		List<User> users = userManagementQueryRepository.validatePinByUserID(userId, pin);
		if (users.isEmpty()) {
			res.setResultCode("1");
			res.setValid("false");
		} else {
			res.setResultCode("1");
			res.setValid("true");

		}

		return res;
	}

}
