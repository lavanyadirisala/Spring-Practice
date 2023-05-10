package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//this is same as @component where a object is created for Momcontroller in container
@Controller
@RequestMapping("/sister")
public class SisterController {
	@ResponseBody
	@RequestMapping("/makeup")
	public String givemakeup() {
		return "lipstick or foundation... anyway...I will give makeup";
	}
	
	
	@ResponseBody
	@RequestMapping("/books")
	public String lendbooks() {
		return "Ok I will lend you my old books";
	}
}
