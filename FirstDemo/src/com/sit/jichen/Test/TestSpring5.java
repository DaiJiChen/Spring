package com.sit.jichen.Test;

import com.sit.jichen.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class TestSpring5 {

    @Test
    public void testAdd() {
        //1. load spring config file
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2. get created object
        User user = context.getBean("user", User.class);

        System.out.println(user);

        user.add();
    }
}
