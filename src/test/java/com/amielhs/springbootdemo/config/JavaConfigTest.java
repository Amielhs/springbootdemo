package com.amielhs.springbootdemo.config;

import com.amielhs.springbootdemo.model.Printer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaConfigTest {
    private AnnotationConfigApplicationContext context = null;

    @Before
    public void setUp() throws Exception {
        context = new AnnotationConfigApplicationContext(JavaConfig.class);
    }

    @After
    public void tearDown() throws Exception {
        context.close();
    }

    @Test
    public void printer() {
        Printer printer = context.getBean(Printer.class);
        printer.print();
    }
}