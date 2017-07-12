package com.yjq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yjq.service.IUserService;

@Controller
@RequestMapping("/dubbo")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value ="/test", method = RequestMethod.GET)
	public void testDubbo(){
		userService.testQuery();
	}
}
