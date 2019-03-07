package com.codetest.animalfarm.model;

public class ApiResponse {
	private int httpStatus;
	private String message;
	private Object responseObj;
	
	public int getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(int httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getResponseObj() {
		return responseObj;
	}
	public void setResponseObj(Object responseObj) {
		this.responseObj = responseObj;
	}
	
	
}
