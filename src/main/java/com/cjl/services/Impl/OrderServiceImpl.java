package com.cjl.services.Impl;

import com.cjl.mapper.OrderMapper;
import com.cjl.mapper.UserMapper;
import com.cjl.model.Orders;
import com.cjl.model.User;
import com.cjl.services.OrderService;
import com.cjl.services.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/2/20.
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Resource
	private OrderMapper orderMapper;

	public Orders findOrdersUserLazyLoading() {
		return orderMapper.findOrdersUserLazyLoading();
	}
}
