package com.logyin.ordering.common.dto;

import java.io.Serializable;

public class BaseRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1498663606879822521L;
	private String clientId;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
}
