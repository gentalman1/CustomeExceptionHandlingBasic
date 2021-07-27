package com.customeexception.dto;

import org.springframework.http.HttpStatus;

/**
 * This is common response for all
 * @author Purv Patel
 *
 */
public class ResponseDTO {

	private Object body;
	private String message;
	private HttpStatus status;

	public ResponseDTO(Object body, String message, HttpStatus status) {
		super();
		this.body = body;
		this.message = message;
		this.status = status;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

}
