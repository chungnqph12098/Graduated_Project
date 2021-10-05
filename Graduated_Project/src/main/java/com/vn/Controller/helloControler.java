package com.vn.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloControler {
	
	@RequestMapping("/")
	public String index() {
		return "Hello";
	}
}
