package com.marketplace.mvc.database.service;

import com.marketplace.mvc.database.dao.CustomerDao;
import com.marketplace.mvc.database.dao.CustomerDaoImpl;
import com.marketplace.mvc.database.model.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rchandrasekar on 4/5/2016.
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

    private CustomerDaoImpl customerDaoImpl;

    public CustomerDaoImpl getCustomerDaoImpl() {
        return customerDaoImpl;
    }

    @Autowired
    public void setCustomerDaoImpl(CustomerDaoImpl customerDaoImpl) {
        this.customerDaoImpl = customerDaoImpl;
    }

    public void registerCustomer(String userName, String firstName, String lastName, String email) {
        CustomerDto customerDto = new CustomerDto(userName, firstName, lastName, email);
        customerDaoImpl.save(customerDto);
    }
}
