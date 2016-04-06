package com.marketplace.mvc.database.dao;

import com.marketplace.mvc.database.model.CustomerDto;

import java.util.List;

/**
 * Created by rchandrasekar on 4/5/2016.
 */
public interface CustomerDao {
    public void save(CustomerDto c);
    public List<CustomerDto> list();
    public boolean isExistsUsername(String username);
    public boolean isExistsEmail(String email);
}
