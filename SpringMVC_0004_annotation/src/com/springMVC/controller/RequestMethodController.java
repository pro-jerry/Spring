package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/customers/**")
public class RequestMethodController {

	@RequestMapping(value="/create",method=RequestMethod.GET)
	public String showForm() {  
        System.out.println("===============GET");  
        return "customer/create";    
    }  
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String submit() {  
        System.out.println("================POST");  
        return "redirect:/success";          
    }  
}
