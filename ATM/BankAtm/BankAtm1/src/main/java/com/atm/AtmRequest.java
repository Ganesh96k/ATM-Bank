
  package com.atm;
  
  import org.springframework.beans.factory.annotation.Autowired; 
  import org.springframework.stereotype.Controller; 
  import org.springframework.ui.ModelMap; 
  import org.springframework.web.bind.annotation.RequestMapping; 
  import org.springframework.web.bind.annotation.RequestMethod;
  import org.springframework.web.bind.annotation.SessionAttributes;
  
  @Controller                //declared this is controllar class
  @SessionAttributes("name") //given session attributed for access name 
  public class AtmRequest {
	  
  @Autowired                 
  AccountUpdate service;
  
  @RequestMapping(value = "/atm-req",method = RequestMethod.GET)
  public String showReq(ModelMap map) {
	  System.out.println("Atm-Request"); 
	  String name=(String) map.get("name");
	  map.put("acc", service.retriveAccount(name));
  return "chooseOp";
  }
 }
 