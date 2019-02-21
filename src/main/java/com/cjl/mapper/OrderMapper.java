package com.cjl.mapper;

import com.cjl.model.Orders;
import com.cjl.model.User;

import java.util.List;

/**
 * Created by Administrator on 2019/2/20.
 */
public interface OrderMapper {

	public Orders findOrdersUserLazyLoading();

}
