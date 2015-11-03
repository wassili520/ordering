package com.logyin.ordering.dal.mapper;

import com.logyin.ordering.dal.model.OrdersDO;

public interface OrdersDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrdersDO record);

    int insertSelective(OrdersDO record);

    OrdersDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrdersDO record);

    int updateByPrimaryKey(OrdersDO record);
}