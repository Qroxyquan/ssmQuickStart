package cn.qroxy.controller;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @desc：页面测试
 * @author: Qroxy
 * @QQ：1114031075
 * @时间: 2018/10/19-9:20 PM
 */


@Controller
public class HelloController {

    @ResponseBody
//    规定字符串返回
    @RequestMapping("/info.do")
    public Map<String,String> info(){

//        return "<h2>hello World2</h2>";
        Map result=Maps.newHashMap();
        result.put("姓名","qroxy");
        result.put("年龄","22");
        return result;
    }


    @RequestMapping("/hello.do")

    public String HelloWorld(){


        return "index";
    }
}
