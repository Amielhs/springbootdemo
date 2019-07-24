package com.amielhs.springbootdemo.controller;

import com.amielhs.springbootdemo.service.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/dev")
public class DevUserController {

    @Autowired
    private DevUserService devUserService;


    /**
     * @Description:做登录跳转
     * @param: [devCode, devPassword, request, session]
     * @return: java.lang.String
     * @Date: 2019-07-18
     */
    @RequestMapping(value = "/dologin")
    @ResponseBody
    public Object dologin(@RequestParam String devCode,
                          @RequestParam String devPassword) {
        //调用service方法，进行用户匹配
        return devUserService.login(devCode, devPassword);
    }

}
