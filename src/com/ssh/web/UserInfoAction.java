package com.ssh.web;

import com.ssh.entity.UserInfo;
import com.ssh.service.UserInfoService;

public class UserInfoAction {
	private UserInfoService userInfoService;

	private UserInfo user ;
	
	public String addUser(){
		boolean bl = userInfoService.addUser(user);
		String result = "welcome";
		if(!bl){
			 result="error";
		}
		return result;
	}
	
	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}
}
