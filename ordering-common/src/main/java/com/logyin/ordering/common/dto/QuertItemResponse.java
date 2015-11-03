package com.logyin.ordering.common.dto;

import java.util.List;

import com.logyin.ordering.dal.model.ItemDO;

public class QuertItemResponse extends BaseResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4687941659491365368L;
	private Integer recordCount;
	private List<ItemDO> result;

	public Integer getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}

	public List<ItemDO> getResult() {
		return result;
	}

	public void setResult(List<ItemDO> result) {
		this.result = result;
	}

}
