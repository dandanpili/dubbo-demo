package com.dandanpili.gmall.impl;


import com.dandanpili.pojo.UserAddress;
import com.dandanpili.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @author shaoruilin
 * @create 2021-03-02-22:49
 */
public class UserServiceImpl implements UserService {


    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "浙江省杭州市", "1", "弹弹霹雳", "15179437992", "Y");
        UserAddress address2 = new UserAddress(1, "江西省南昌市", "1", "邵瑞琳", "15179442392", "N");
        return Arrays.asList(address1, address2);
    }
}
