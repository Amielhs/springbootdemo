package com.amielhs.springbootdemo.service;

import com.amielhs.springbootdemo.pojo.DevUser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DevUserServiceTest {

    /*private AnnotationConfigApplicationContext context =null;*/

    @Autowired
    private DevUserService devUserService;

    @Before
    public void setUp() throws Exception {
        /*context = new AnnotationConfigApplicationContext(JavaConfig.class);*/
    }

    @After
    public void tearDown() throws Exception {
        /*context.close();*/
    }

    @Test
    public void login() {
        DevUser devUser = devUserService.login("test001","123456");
        System.out.println(devUser.getDevName());
    }
}