package com.amielhs.springbootdemo.dao;

import com.amielhs.springbootdemo.pojo.DevUser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE )
public class DevUserMapperTest {
    /*private AnnotationConfigApplicationContext context = null;*/
    @Autowired
    private DevUserMapper devUserMapper;

    @Before
    public void setUp() throws Exception {
        /*context = new AnnotationConfigApplicationContext(JavaConfig.class);*/
    }

    @After
    public void tearDown() throws Exception {
        /*context.close();*/
    }

    @Test
    public void getLoginUser() throws Exception{
        /*DevUserMapper devUserMapper = context.getBean(DevUserMapper.class);
        System.out.println(devUserMapper.getLoginUser("test001"));*/
        DevUser devUser = devUserMapper.getLoginUser("test001");
        System.out.println(devUser.getDevName());
    }
}