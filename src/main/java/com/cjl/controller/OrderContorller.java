package com.cjl.controller;

import com.cjl.model.Orders;
import com.cjl.model.User;
import com.cjl.services.Impl.OrderServiceImpl;
import com.cjl.services.UserService;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/2/20.
 */
@Controller
@RequestMapping("order")
public class OrderContorller {

	@Resource
	private OrderServiceImpl orderServiceImpl;

	@RequestMapping(value = "/find.do", method = RequestMethod.GET)
	public ModelAndView getUser()
	{
		ModelAndView modelAndView=new ModelAndView();
		Orders order = orderServiceImpl.findOrdersUserLazyLoading();
		modelAndView.addObject("msg","find"+order.getId());
		String username=order.getUser().getUser_name();
		username=order.getUser().getUser_name();
		//触发懒加载
//		modelAndView.addObject("msg","find"+order.getId()+","+order.getUser().getUser_name());
		modelAndView.setViewName("data");
		return modelAndView;
	}


}
