package com.ssh.dao;

import com.ssh.entity.UserInfo;

public class UserInfoDao extends BaseDao{
	public boolean addUser(UserInfo user){
		return addObject(user);
	}
}
