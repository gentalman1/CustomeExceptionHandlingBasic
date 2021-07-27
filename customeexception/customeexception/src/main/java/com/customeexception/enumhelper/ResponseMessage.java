package com.customeexception.enumhelper;

public enum ResponseMessage {

	DATA_ADD_SUCCESSFULLY("Data Add Successfully!!"), DATA_OBTAINED_SUCCESSFULLY("Data Obtained Successfully!!");

	private String message;

	public String getMessage() {
		return message;
	}

	ResponseMessage(String responseMessage) {
		this.message = responseMessage;
	}

}
