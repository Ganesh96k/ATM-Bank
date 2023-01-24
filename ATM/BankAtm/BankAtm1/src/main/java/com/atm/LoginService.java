package com.atm;

import java.util.List;

import javax.print.DocFlavor.SERVICE_FORMATTED;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	@Autowired
	AccountUpdate service;
	
	static List<Account> nm1 = AccountUpdate.retriveAccount(getname());
	
	public boolean validateUser(String name, String pass) {
		//int pass1=nm1.get(0).getPassword();
		//System.out.println(pass1);
		System.out.println("In LoginService");
		System.out.println(AccountUpdate.retriveAccount(getname()));
		return name.equalsIgnoreCase("seed")&&pass.equalsIgnoreCase("seed");
	}
	
	public static String getname() {
		//String l3=nm1.getName("name");
		//System.out.println(l3);
		 //Account nm=nm1.get(2);
		//System.out.println(nm);
		return "";
	}

}
