package com.logyin.ordering.common.dto;

import java.io.Serializable;

public class BaseResponse implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3215957927439206976L;
	private String code;
	private String message;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
