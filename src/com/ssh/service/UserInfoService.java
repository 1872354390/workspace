package com.ssh.service;

import com.ssh.dao.UserInfoDao;
import com.ssh.entity.UserInfo;

public class UserInfoService {
	private UserInfoDao userInfoDao;

	public boolean addUser(UserInfo user){
		return userInfoDao.addUser(user);
	}
	
	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}
	
	
}
