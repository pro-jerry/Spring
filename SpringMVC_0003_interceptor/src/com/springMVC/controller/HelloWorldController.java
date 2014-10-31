package com.springMVC.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldController extends AbstractController {

	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {

		//1.收集参数，验证参数
				//2.绑定参数到命令对象
				//3.将命令参数传到业务对象进行业务处理
				//4.选择下一个页面
				
				ModelAndView mv = new ModelAndView();
				//添加模型数据，可以使任意的POJO对象
				mv.addObject("message","hello world");
				//设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
				mv.setViewName("hello");
				return mv;
	}

	
}