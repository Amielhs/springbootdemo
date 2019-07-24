package com.amielhs.springbootdemo.config;

import com.amielhs.springbootdemo.model.ColorInk;
import com.amielhs.springbootdemo.model.Printer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public ColorInk colorInk(){
        return new ColorInk();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    /*@Scope("prototype")*/
    public Printer printer(){
        Printer printer = new Printer();
        return printer;
    }
}
