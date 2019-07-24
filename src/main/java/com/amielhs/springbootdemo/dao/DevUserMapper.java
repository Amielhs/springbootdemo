package com.amielhs.springbootdemo.dao;

import com.amielhs.springbootdemo.pojo.DevUser;
import org.apache.ibatis.annotations.Param;


public interface DevUserMapper {

    /**
     * @Description:根据devCode获取用户记录
     * @param: [devCode]
     * @return: com.amielhs.appsys.pojo.DevUser
     * @Date: 2019-07-18
     */
    public DevUser getLoginUser(@Param("devCode") String devCode);
}
