package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@ResponseBody
	@RequestMapping("/")
	public String all() {
		return "all simplilearn can access";
	}
	
	@ResponseBody
	@RequestMapping("/admin")
	public String admin() {
		return "hi admins";
	}
	
	@ResponseBody
	@RequestMapping("/user")
	public String user() {
		return "hi simplilearn users";
	}
	
}
