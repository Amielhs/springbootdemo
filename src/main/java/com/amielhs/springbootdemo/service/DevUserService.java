package com.amielhs.springbootdemo.service;


import com.amielhs.springbootdemo.pojo.DevUser;

public interface DevUserService {

    /**
     * @Description:验证登录
     * @param: [devCode, password]
     * @return: com.amielhs.appsys.pojo.DevUser
     * @Date: 2019-07-18
     */
    public DevUser login(String devCode, String password);
}
