package com.blog.service;


import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.blog.dao.TestDao;
import com.blog.domain.User;

@Service
public class TestService{
	@Resource
	private TestDao testDao;
	
	public User getUser(String id) {
		return testDao.getUser("1");
	}
		
}
