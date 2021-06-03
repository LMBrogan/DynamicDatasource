package com.dailywear.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dailywear.entity.User;

@Mapper
public interface IUserMapper {
	List<User> queryUserData();
}
