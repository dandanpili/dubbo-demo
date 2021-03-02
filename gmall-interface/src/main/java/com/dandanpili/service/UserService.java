package com.dandanpili.service;

import com.dandanpili.pojo.UserAddress;

import java.util.List;

/**
 * @author shaoruilin
 * @create 2021-03-02-22:48
 */
public interface UserService {

    /**
     * 按照用户安迪返回收货地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);
}
