package com.sit.jichen.Test;

import com.sit.jichen.Book;
import com.sit.jichen.User;
import com.sit.jichen.Orders;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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


    @Test
    public void testBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book.toString());
    }

    @Test
    public void testOrder() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Orders order = context.getBean("orders", Orders.class);
        System.out.println(order.toString());
    }
}
