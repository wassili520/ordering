package com.logyin.ordering.dal.mapper;

import com.logyin.ordering.dal.model.MenuDO;

public interface MenuDOMapper {
	int deleteByPrimaryKey(Integer menuId);

	int insert(MenuDO record);

	int insertSelective(MenuDO record);

	MenuDO selectByPrimaryKey(Integer menuId);

	int updateByPrimaryKeySelective(MenuDO record);

	int updateByPrimaryKey(MenuDO record);

}