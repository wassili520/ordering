package com.logyin.ordering.dal.mapper;

import com.logyin.ordering.dal.model.UsersDO;

public interface UsersDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UsersDO record);

    int insertSelective(UsersDO record);

    UsersDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UsersDO record);

    int updateByPrimaryKey(UsersDO record);
}