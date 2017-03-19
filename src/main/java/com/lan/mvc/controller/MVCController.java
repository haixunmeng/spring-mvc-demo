package com.lan.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lan.mvc.service.MVCService;

@Controller
public class MVCController {
	
	@Autowired
	private MVCService MVCService;

	@RequestMapping(value = "/mvc", method = RequestMethod.GET)
	public @ResponseBody String jta(){
		return MVCService.mvc();
	}
	
}
