package com.cjl.services.Impl;

import com.cjl.mapper.UserMapper;
import com.cjl.model.User;
import com.cjl.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/2/20.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	public List<User> queryUser() {
		System.out.println("UserServiceImpl queryUser");
		return userMapper.queryUser();
	}

	public User findById(Long id){
		return userMapper.findById(id);
	}
	public List<User> findUser(User user){
		return userMapper.findUser(user);
	}
	public List<User> findByIds(List<Long> ids){
		return userMapper.findByIds(ids);
	}
	public void saveUser(User user){
		userMapper.saveUser(user);
	}
	public void updateUser(String name,Long id){
		userMapper.updateUser(name,id);
	}
	public void delete(Long id){
		userMapper.delete(id);
	}
}
