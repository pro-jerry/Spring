package com.springMVC.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class TestController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {  
        System.err.println("===========TestController");  
        return new ModelAndView("test");  
    }  
}
