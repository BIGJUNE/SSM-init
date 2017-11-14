package com.blog.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.domain.User;
import com.blog.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Resource
	private TestService service;
	
	@RequestMapping("/user")
	public String getUser(HttpServletRequest request,Model model) {
		User user = service.getUser("1");
		model.addAttribute("user", user);
		return "test";
	}
}
