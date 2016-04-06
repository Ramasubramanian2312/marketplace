package com.marketplace.mvc.database.dao;

import com.marketplace.mvc.database.service.CustomerService;
import com.marketplace.mvc.database.service.CustomerServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rchandrasekar on 4/5/2016.
 */
public class Test {
    public static void main(String args[])
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        CustomerService customerService = (CustomerServiceImpl) context.getBean("customerService");
        customerService.registerCustomer("anup123", "Anup", "MS", "anup@123.com");
    }
}
