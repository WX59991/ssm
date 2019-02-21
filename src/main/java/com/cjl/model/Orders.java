package com.cjl.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/2/21.
 */
public class Orders implements Serializable {

	private Long id;
	private Long userid;

	private User user;

	public Long getId() {
		return id;
	}

	public Long getUserid() {
		return userid;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
