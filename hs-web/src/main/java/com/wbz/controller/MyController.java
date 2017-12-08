package com.wbz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping(value="/myController")
public class MyController {
	@RequestMapping("/forexample")
	public String forExample(){
		System.out.println("this is an example!!!");
		return "index";
	}
}
