package com.castis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping(value="/post")
	public String post(Model model){
		return "postTest_Information";
	}
	
	
}
