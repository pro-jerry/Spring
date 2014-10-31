package com.springMVC.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.springMVC.model.DataBinderTestModel;
import com.springMVC.model.PhoneNumberModel;
import com.springMVC.web.controller.support.editor.PhoneNumberEditor;


@SuppressWarnings("deprecation")
public class DataBinderTestController extends AbstractCommandController{

	public DataBinderTestController() {  
        setCommandClass(DataBinderTestModel.class); //设置命令对象  
        setCommandName("dataBinderTest");//设置命令对象的名字  
    }  
	@Override
	protected ModelAndView handle(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, BindException arg3)
			throws Exception {

		//输出command对象看看是否绑定正确  
        System.out.println(arg2); 
        
		return new ModelAndView("bindAndValidate/success").addObject("dataBinderTest", arg2);  
	}
	
	 protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {  
	        super.initBinder(request, binder);  
	        //注册自定义的属性编辑器  
	        //1、日期  
	        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	        CustomDateEditor dateEditor = new CustomDateEditor(df, true);  
	        //表示如果命令对象有Date类型的属性，将使用该属性编辑器进行类型转换  
	        binder.registerCustomEditor(Date.class, dateEditor);  
	        //自定义的电话号码编辑器  
	        binder.registerCustomEditor(PhoneNumberModel.class, new PhoneNumberEditor());  
	    }  

}
