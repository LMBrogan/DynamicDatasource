package com.dailywear.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailywear.entity.User;
import com.dailywear.mapper.IUserMapper;
import com.dailywear.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private IUserMapper userMapper;

	@Override
	public List<User> queryUserData() {
		return userMapper.queryUserData();
	}
	
}
