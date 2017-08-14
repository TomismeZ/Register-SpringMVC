package com.qingshixun.register;

import java.util.List;

public class User {
	private String username;
	private String password;
	private String confimPassword;
	private String email;
	private String sex;
	private String occupation;
	private List<String> hobby;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfimPassword() {
		return confimPassword;
	}

	public void setConfimPassword(String confimPassword) {
		this.confimPassword = confimPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public List<String> getHobby() {
		return hobby;
	}

	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", confimPassword=" + confimPassword
				+ ", email=" + email + ", sex=" + sex + ", occupation=" + occupation + ", hobby=" + hobby + "]";
	}

}
