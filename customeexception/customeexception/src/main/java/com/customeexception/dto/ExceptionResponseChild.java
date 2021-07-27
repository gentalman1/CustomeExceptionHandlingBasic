package com.customeexception.dto;

import java.util.Date;

public class ExceptionResponseChild {

	private String path;
	private String error;
	private Date timestamp = new Date();

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public ExceptionResponseChild(String path, String error) {
		super();
		this.path = path;
		this.error = error;
	}

}
