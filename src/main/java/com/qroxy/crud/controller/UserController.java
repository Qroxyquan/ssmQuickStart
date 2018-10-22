package com.qroxy.crud.controller;

import com.google.common.collect.Maps;
import com.mysql.jdbc.Security;
import com.qroxy.crud.bean.User;
import com.qroxy.crud.common.Const;
import com.qroxy.crud.common.ServerRespond;
import com.qroxy.crud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @desc：
 * @author: Qroxy
 * @QQ：1114031075
 * @时间: 2018/10/22-5:46 PM
 */
@Controller
public class UserController {

    @Autowired
    private IUserService iUserService;
    @RequestMapping("login.do")
    @ResponseBody
    public ServerRespond<User> login(String username, String password, HttpSession session){


        ServerRespond<User> result = iUserService.login(username, password);
        if (result.isSuccess()) {
            session.setAttribute(Const.CURRENT_USER, result.getData());
        }
        return result;
    }
}
