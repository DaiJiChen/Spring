package com.sit.jichen.Test;

import com.sit.jichen.bean.Employer;
import com.sit.jichen.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void testOuterBeanInject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = context.getBean("UserService", UserService.class);

        userService.add();
    }

    @Test
    public void testInnerBeanInject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        Employer employer = context.getBean("employer", Employer.class);

        employer.add();
    }
}
