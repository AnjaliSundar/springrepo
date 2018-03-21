package com.springboot.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymLeafController {
	
	@RequestMapping("/hey")
	public String welcome() {
		return "index";
		}
}
