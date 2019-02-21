package com.cjl.controller;

import com.cjl.mapper.UserMapper;
import com.cjl.model.User;
import com.cjl.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/2/20.
 */
@Controller
@RequestMapping("user")
public class UserContorller {

	@Resource
	private UserService userService;

	@RequestMapping(value = "/find.do", method = RequestMethod.GET)
	public ModelAndView getUser()
	{
		ModelAndView modelAndView=new ModelAndView();
		List<User> user = userService.queryUser();
		modelAndView.addObject("msg","find"+user.toString());
		modelAndView.setViewName("data");
		return modelAndView;
	}

	@RequestMapping(value = "/findById.do", method = RequestMethod.GET)
	public ModelAndView findById(Long id){
		ModelAndView modelAndView=new ModelAndView();
		User user = userService.findById(id);
		modelAndView.addObject("msg",user.toString());
		modelAndView.setViewName("/user/find.do");
		return modelAndView;
	}
	@RequestMapping(value = "/findUser.do", method = RequestMethod.POST)
	public ModelAndView findUser(User user){
		ModelAndView modelAndView=new ModelAndView();
		List<User> users = userService.findUser(user);
		modelAndView.addObject("msg",users.toString());
		modelAndView.setViewName("data");
		return modelAndView;
	}

	@RequestMapping(value = "/findByIds.do", method = RequestMethod.GET)
	public ModelAndView findByIds(){
		List<Long> ids=new ArrayList<>();
		ids.add(1L);
		ids.add(2L);
		ModelAndView modelAndView=new ModelAndView();
		List<User> users = userService.findByIds(ids);
		modelAndView.addObject("msg",users.toString());
		modelAndView.setViewName("data");
		return modelAndView;
	}
	@RequestMapping(value = "/save.do", method = RequestMethod.POST)
	public String saveUser(User user){
		userService.saveUser(user);
		return "success";

	}
	@RequestMapping(value = "/update.do", method = RequestMethod.POST)
	public String updateUser(String name,Long id){
		userService.updateUser(name,id);
		return "success";
	}
	@RequestMapping(value = "/delete.do", method = RequestMethod.GET)
	public String delete(Long id){
		userService.delete(2L);
		return "success";
	}


	@RequestMapping(value = "/error.do", method = RequestMethod.GET)
	public String test(){
		return "success";
	}

}
