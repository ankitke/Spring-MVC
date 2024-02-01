package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.entity.User;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		
		return "home";
	}
	
	@RequestMapping("/register")
	public String signup() {
		
		return "register";
	}
	
	@RequestMapping(path="/createUser", method=RequestMethod.POST)
	public String registerUser(@ModelAttribute User user, @RequestParam("fullName") String fn) {
		
		System.out.println("Full Name: "+fn);
		
		System.out.println(user);
		return "register";
	}

}
