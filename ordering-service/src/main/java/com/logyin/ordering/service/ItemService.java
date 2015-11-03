package com.logyin.ordering.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logyin.ordering.common.dto.QuertItemRequest;
import com.logyin.ordering.common.dto.QuertItemResponse;
import com.logyin.ordering.dal.mapper.ItemDOMapperExt;
import com.logyin.ordering.dal.model.ItemDO;

@Service("itemService")
public class ItemService {
	@Autowired
	private ItemDOMapperExt itemDOMapperExt;

	public QuertItemResponse queryItem(QuertItemRequest req) {
		ItemDO itemDO = new ItemDO();
		itemDO.setMenuId(req.getMenuId());
		itemDO.setItemType(req.getItemType());
		List<ItemDO> list = itemDOMapperExt.queryItem(itemDO);

		QuertItemResponse response = new QuertItemResponse();
		response.setResult(list);
		response.setRecordCount(list.size());
		return response;

	}
}
