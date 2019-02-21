package com.cjl.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/2/20.
 */
public class User implements Serializable {
	private Long userid;
	private String username;
	private String userage;


	public Long getUserid() {
		return userid;
	}

	public String getUser_name() {
		return username;
	}

	public String getUserage() {
		return userage;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUserage(String userage) {
		this.userage = userage;
	}

	@Override
	public String toString() {
		return "User{" +
				"userid=" + userid +
				", username='" + username + '\'' +
				", userage='" + userage + '\'' +
				'}';
	}
}
