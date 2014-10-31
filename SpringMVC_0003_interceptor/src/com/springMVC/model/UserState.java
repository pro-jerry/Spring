package com.springMVC.model;

/**
 * 用户状态
 * @author Administrator2014-10-30下午1:19:50
 *
 */
public enum UserState {

	normal("正常状态"), blocked("锁定");
	
	private String desc;
	private UserState(String desc) {
		this.desc = desc;;
	}
	
	public String getDesc() {
		return desc;
	}
	
	@Override
	public String toString() {
		return this.desc;
	}
	
}
