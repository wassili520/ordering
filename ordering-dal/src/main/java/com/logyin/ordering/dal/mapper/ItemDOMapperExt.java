package com.logyin.ordering.dal.mapper;

import java.util.List;

import com.logyin.ordering.dal.model.ItemDO;

public interface ItemDOMapperExt {
	List<ItemDO> queryItem(ItemDO itemDO);
}