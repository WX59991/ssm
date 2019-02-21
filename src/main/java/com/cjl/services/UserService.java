package com.cjl.services;

import com.cjl.model.User;

import java.util.List;

/**
 * Created by Administrator on 2019/2/20.
 */
public interface UserService {

	public List<User> queryUser();
	public User findById(Long id);
	public List<User> findUser(User user);
	public List<User> findByIds(List<Long> ids);
	public void saveUser(User user);
	public void updateUser(String name,Long id);
	public void delete(Long id);

}
