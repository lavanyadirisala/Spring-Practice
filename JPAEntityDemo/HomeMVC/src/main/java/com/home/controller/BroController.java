package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//this is same as @component where a object is created for Momcontroller in container
@Controller
public class BroController {
	@ResponseBody
	@RequestMapping("/Bicycle")
	public String givebicylce() {
		return "okay I am in rest....I will give bicylce";
	}

}
