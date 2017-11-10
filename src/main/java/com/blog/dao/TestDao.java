package com.blog.dao;


import org.mybatis.spring.annotation.MapperScan;

import com.blog.domain.User;

@MapperScan
public interface TestDao {
	
	public User getUser(String id);
}
