package com.qroxy.crud.service.impl;

import com.qroxy.crud.bean.User;
import com.qroxy.crud.common.ServerRespond;
import com.qroxy.crud.dao.UserMapper;
import com.qroxy.crud.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @desc：
 * @author: Qroxy
 * @QQ：1114031075
 * @时间: 2018/10/22-5:49 PM
 */
@Service("iUserService")
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public ServerRespond<User> login(String username, String password) {

        User user = userMapper.selectByUserAndPassword(username, password);
        if (user == null) {
            return ServerRespond.createByErrorMessage("密码错误");
        }
        user.setPassword(StringUtils.EMPTY);
        return ServerRespond.createBySuccess("登录成功", user);

    }
}
