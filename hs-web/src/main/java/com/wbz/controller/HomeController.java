package com.wbz.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private static final Logger Logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/")
	public String index(){
		//Logger.info("这只是一条提示信息，用于表示log4j已经能都正常使用了=====================");
		return "index";
	}
}
