package com.marketplace.mvc.database.dao;

import com.marketplace.mvc.database.service.CustomerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rchandrasekar on 4/5/2016.
 */
public class Test {
    public static void main(String args[])
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        CustomerService customerService = (CustomerService) context.getBean("customerService");
        //customerService.registerCustomer("anu433", "AnupTe1st", "MS", "an1u3p@123.com");
        //System.out.println(customerService.isExistsUsername("rama2312"));
        //System.out.println(customerService.isExistsEmail("abc@123.com"));
    }
}
