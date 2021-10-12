package com.vn.Controller;

	
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Login {
	
	@GetMapping("/")
	public String trangChu() {
		return "/hello";
	}
	
	@GetMapping("/notlogin")
	public String notLoginWithGG() {
		return "chưa đăng nhập";
	}
	
	@GetMapping("/login")
	public String loginWithGG() {
		return "/hello";
	}
	
	@GetMapping("/login/success")
	public String home(OAuth2AuthenticationToken oauth) {
		String name = oauth.getPrincipal().getAttribute("name");
		String email = oauth.getPrincipal().getAttribute("email");
		return "Hello " + name + " And " +  " Email" + email;
	}
	
	
	
	
}
