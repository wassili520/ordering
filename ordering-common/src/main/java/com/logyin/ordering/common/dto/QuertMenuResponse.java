package com.logyin.ordering.common.dto;

import java.util.List;

import com.logyin.ordering.dal.model.MenuDO;

public class QuertMenuResponse extends BaseResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4699738486840453903L;
	private Integer recordCount;
	private List<MenuDO> result;

	public Integer getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;

	}

	public List<MenuDO> getResult() {
		return result;
	}

	public void setResult(List<MenuDO> result) {
		this.result = result;
	}

}
