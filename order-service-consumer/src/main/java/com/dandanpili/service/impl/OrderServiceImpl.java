package com.dandanpili.service.impl;

import com.dandanpili.pojo.UserAddress;
import com.dandanpili.service.OrderService;
import com.dandanpili.service.UserService;

import java.util.List;

/**
 * @author shaoruilin
 * @create 2021-03-02-23:05
 */

/**
 * 1、将服务提供者注册到注册中心（暴露服务）
 *      1）、导入dubbo依赖（2.6.2）/ 操作zookeeper的客户端（curator)
 *      2）、配置服务提供者
 * 2、让服务消费者去注册中心订阅服务提供者的服务地址
 */
public class OrderServiceImpl implements OrderService {

    private UserService userService;
    @Override
    public void initOrder(String userId) {
        //1.查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        System.out.println(addressList);
    }
}
