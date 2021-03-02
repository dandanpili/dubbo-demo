package com.dandanpili.service.impl;

import com.dandanpili.pojo.UserAddress;
import com.dandanpili.service.OrderService;
import com.dandanpili.service.UserService;

import java.util.List;

/**
 * @author shaoruilin
 * @create 2021-03-02-23:05
 */
public class OrderServiceImpl implements OrderService {

    UserService userService;
    @Override
    public void initOrder(String userId) {
        //1.查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        System.out.println(addressList);
    }
}
