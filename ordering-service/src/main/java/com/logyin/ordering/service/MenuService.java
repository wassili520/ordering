package com.logyin.ordering.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logyin.ordering.common.dto.QuertMenuRequest;
import com.logyin.ordering.common.dto.QuertMenuResponse;
import com.logyin.ordering.dal.mapper.MenuDOMapperExt;
import com.logyin.ordering.dal.model.MenuDO;

@Service("menuService")
public class MenuService {

	@Autowired
	private MenuDOMapperExt menuDOMapperExt;

	public QuertMenuResponse queryMenu(QuertMenuRequest req) {
		List<MenuDO> list = menuDOMapperExt.queryMenu();

		QuertMenuResponse response = new QuertMenuResponse();
		response.setResult(list);
		response.setRecordCount(list.size());
		return response;

	}
}
