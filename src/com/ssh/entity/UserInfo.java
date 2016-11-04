package com.ssh.entity;

public class UserInfo {
	private String uno ;
	
	private String uname ;
	
	private int uage ;

	public UserInfo() {
		super();
	}

	public UserInfo(String uno, String uname, int uage) {
		super();
		this.uno = uno;
		this.uname = uname;
		this.uage = uage;
	}

	public String getUno() {
		return uno;
	}

	public void setUno(String uno) {
		this.uno = uno;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getUage() {
		return uage;
	}

	public void setUage(int uage) {
		this.uage = uage;
	}
}
