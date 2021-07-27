package com.customeexception.dto;

/**
 * This is exception response dto
 * 
 * @author Purv Patel
 *
 */
public class ExceptionResponse {

	private Object data;
	private String message;
	private int statusCode;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public ExceptionResponse(Object data, String message, int statusCode) {
		super();
		this.data = data;
		this.message = message;
		this.statusCode = statusCode;
	}

}
