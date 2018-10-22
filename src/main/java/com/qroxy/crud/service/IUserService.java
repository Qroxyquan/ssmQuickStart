package com.qroxy.crud.service;


import com.qroxy.crud.bean.User;
import com.qroxy.crud.common.ServerRespond;

/**
 * @desc：
 * @author: Qroxy
 * @QQ：1114031075
 * @时间: 2018/10/22-5:48 PM
 */
public interface IUserService {
    public ServerRespond<User> login(String username, String password);
}
