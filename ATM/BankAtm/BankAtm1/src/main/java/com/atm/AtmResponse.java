package com.atm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name") 
public class AtmResponse {
	
	
	@RequestMapping(value = "/check1",method = RequestMethod.GET)
	public String showLogin(ModelMap map) {
		System.out.println("in login");
		return"thankyou";
	}
	
	@RequestMapping(value = "/check1",method = RequestMethod.POST)
	  public String showReq1(ModelMap map1,@RequestParam(required=false,name="radioName") String user) {
		System.out.println("In AtmResponse");
		System.out.println(user);
		map1.addAttribute("user", user);
		
		switch(user) {
		case "Withdraw":
			System.out.println("****Withdraw");
			return "withdraw";
			//break;
		case "Deposite":
			System.out.println("***Deposite");
			return "deposite";
		case "Mini":
			System.out.println("***Mini");
			return "miniStatement";
		case "Enq":
			System.out.println("***inquiry");
			return "inquiry";
		case "Exit":
			System.out.println("*Exit");
			return "thankyou";
			//break;
		}
		  return "atm2";
	  }
}
