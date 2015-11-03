package com.logyin.ordering.common.dto;

public class QuertItemRequest extends BaseRequest {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1909675292447726429L;
	private Integer menuId;
	private Integer itemType;

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public Integer getItemType() {
		return itemType;
	}

	public void setItemType(Integer itemType) {
		this.itemType = itemType;
	}
}
