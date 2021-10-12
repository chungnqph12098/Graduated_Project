package com.vn.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloControler {
	
	@RequestMapping("/")
	public String index() {
		return "Hello Spring";
	}
//	@RequestMapping("/hello")
//	public String index1(Model model) {
//		model.addAttribute("message", "Dự án tốt nghiệp");
//		return "hello";
//	}
}
