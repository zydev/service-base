package com.service.base.dao;

import java.util.List;

import com.service.base.entity.UserEntity;

public interface UserDao {

    public int deleteByPrimaryKey(Long id);

    public int insertSelective(UserEntity record);

    public UserEntity selectByPrimaryKey(Long id);

    public int updateByPrimaryKeySelective(UserEntity record);
    
    public List<UserEntity> selectUsers();

}