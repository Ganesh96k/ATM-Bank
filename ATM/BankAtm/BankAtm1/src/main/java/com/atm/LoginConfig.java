package com.atm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
@SessionAttributes("name")
public class LoginConfig implements WebMvcConfigurer {

	@Autowired
	LoginService service;
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String showLogin(ModelMap map) {
		System.out.println("in loginConfig");
		return"login";
	}
	
	@RequestMapping(value = "/check",method = RequestMethod.POST)
	public String validateLogin(ModelMap model,@RequestParam String name,@RequestParam String pass) {
		boolean isValidUser=service.validateUser(name, pass);
		if(!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		model.put("name", name);
		model.put("pass", pass);
		System.out.println("loginConfig-login sucessful");
		return"welcome";
	}
	
	@RequestMapping(value = "/register",method = RequestMethod.GET)
	public String register(ModelMap map) {
		System.out.println("in loginConfig in register");
		return"register";
	}
	
	@RequestMapping(value = "/thankyou",method = RequestMethod.GET)
	public String thankyou(ModelMap map) {
		System.out.println("in loginConfig in thankyou");
		return"thankyou";
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/url1/**").addResourceLocations("/resources/");
		registry.addResourceHandler("/url2/**").addResourceLocations("/WEB-INF/");
		
	}
	
}
