package com.springmvc.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {

		String hello="hello";
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("1", "0001");
		map.put("2", "0001");
		map.put("3", "0001");
		return new ModelAndView("/welcome","result",map);
	}

	
}
