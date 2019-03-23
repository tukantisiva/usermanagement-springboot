package com.codechallenge.spring.data.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import com.tajawal.codechallenge.model.Response;

public class UserManagementControllerTest {

	@InjectMocks
	UserManagementController userManagementController;
	Response res=null;
	@Before
    public void before() {
        System.out.println("Before");
        
        res.setMessage("Successfull");
        res.setResultCode("1");
        res.setValid("true");
    }
	
	@Test
	public void testGenerateVerficationCode() {
		fail("Not yet implemented");
		
		  assertEquals(res,userManagementController.generateVerficationCode("441652"));	}

	@Test
	public void testValidateCodebyUserID() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllUsers() {
		fail("Not yet implemented");
	}

}
