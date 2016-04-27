package com.marketplace.mvc.database.dao;

import com.marketplace.mvc.database.model.CustomerDto;

import java.util.List;

/**
 * Created by rchandrasekar on 4/5/2016.
 */
public interface CustomerDao {
    void save(CustomerDto c);
    void update(CustomerDto c);
    CustomerDto getCustomerByUsername(String username);
    List<CustomerDto> list();
    boolean isExistsUsername(String username);
    boolean isExistsEmail(String email);
    boolean isValidUser(String username, String password);
}
