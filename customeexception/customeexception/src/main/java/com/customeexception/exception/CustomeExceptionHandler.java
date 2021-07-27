package com.customeexception.exception;

import org.springframework.http.HttpStatus;

/**
 * This is custome exception handler
 * @author Purv Patel
 *
 */
public class CustomeExceptionHandler extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final String message;
	private final HttpStatus statusCode;

	public CustomeExceptionHandler(String message, HttpStatus statusCode) {
		super();
		System.out.println("message :: "+message);
		System.out.println("statusCode :: "+statusCode);
		this.message = message;
		this.statusCode = statusCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public HttpStatus getStatusCode() {
		return statusCode;
	}

}
