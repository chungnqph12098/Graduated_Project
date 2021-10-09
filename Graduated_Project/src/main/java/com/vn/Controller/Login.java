package com.vn.Controller;

	
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
	
	@GetMapping("/")
	public String trangChu() {
		return "Trang chủ";
	}
	
	@GetMapping("/notlogin")
	public String notLoginWithGG() {
		return "chưa đăng nhập";
	}
	
	@GetMapping("/login")
	public String loginWithGG() {
		return "đã đăng nhập";
	}
}
