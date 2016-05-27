package com.marketplace.mvc.database.dao;

import com.marketplace.mvc.database.model.CustomerCredentialsDto;

/**
 * Created by rchandrasekar on 4/26/2016.
 */
public interface CustomerCredentialsDao {
    CustomerCredentialsDto getByPrimaryKey(int id);
}
