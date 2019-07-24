package com.amielhs.springbootdemo.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Printer {

    @Autowired
    private ColorInk ink;

    public void print(){
        ink.getColor();
    }

    public void init(){
        System.out.println("初始化");
    }

    public void destroy(){
        System.out.println("销毁");
    }
}
