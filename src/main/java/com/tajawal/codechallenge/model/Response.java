package com.tajawal.codechallenge.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Response {
	
	String resultCode;
	String message;
	String valid;
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getValid() {
		return valid;
	}
	public void setValid(String valid) {
		this.valid = valid;
	}
	public Response(String resultCode, String message, String valid) {
		super();
		this.resultCode = resultCode;
		this.message = message;
		this.valid = valid;
	}
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
