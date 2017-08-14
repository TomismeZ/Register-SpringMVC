package com.qingshixun.register;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private User user;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("RegisterAction----");
		User user = new User();
		user.setUsername("zhangsan");
		
//		System.out.println(user.toString());
		Map session=ActionContext.getContext().getSession();
		session.put("user", user);
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
