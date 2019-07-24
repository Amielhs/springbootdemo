package com.amielhs.springbootdemo.service.impl;

import com.amielhs.springbootdemo.dao.DevUserMapper;
import com.amielhs.springbootdemo.pojo.DevUser;
import com.amielhs.springbootdemo.service.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("devUserService")
@Transactional
public class DevUserServiceImpl implements DevUserService {

    @Autowired
    private DevUserMapper devUserMapper;
    /**
     * @Description:验证登录
     * @param: [devCode, password]
     * @return: com.amielhs.appsys.pojo.DevUser
     * @Date: 2019-07-18
     */
    @Override
    public DevUser login(String devCode, String password) {
        DevUser devUser = null;
        devUser = devUserMapper.getLoginUser(devCode);
        if (devUser!=null){
            if (!devUser.getDevPassword().equals(password)){
                devUser = null;
            }
        }
        return devUser;
    }
}
