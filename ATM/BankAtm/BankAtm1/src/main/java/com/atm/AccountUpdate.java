package com.atm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

@Service
@SessionAttributes("name")
public class AccountUpdate {
	//we created a list and stored data into it.
	//ID, PASSWORD, NAME,  BALANCE,  DATE
	//We can retrive data 
	
	private static List<Account> acc=new ArrayList<Account>();  //created object of account
	private static int accCount=0;                              //manually declared count.
	
	//new data added in object.
	static {
		acc.add(new Account(101,8080,"Ganesh",1000.00,new Date()));
		acc.add(new Account(102,8181,"veer",2000.00,new Date()));
		acc.add(new Account(103,8282,"seed",3000.00,new Date()));
		acc.add(new Account(104,9090,"Vijay",30000.00,new Date()));
	}
	//this will check if login is valid or not
	public static List<Account> retriveAccount(String name){
		System.out.println("in retive ac");
		System.out.println(name);
		System.out.println(acc.get(1).getPassword());
		List<Account> filteredAc1=new ArrayList<Account>();
		for(Account account:acc) {
			System.out.println("retriveAccount");
			System.out.println(account.getName());
			accCount++;
			System.out.println(accCount);
			if(account.getName()==name) {
				filteredAc1.add(account); 
				System.out.println("retrive111111");
				System.out.println(account);
				
			}
			
		}
		return filteredAc1;
	}
	
	public static List<Account> retrivepassword(int password){
		List<Account> filteredAc=new ArrayList<Account>();
		for(Account account:acc) {
			if(account.getPassword()==(password)) {
				filteredAc.add(account);
			}
		}
		return filteredAc;
	}
	
	public static void getinfo() {

	}

}
