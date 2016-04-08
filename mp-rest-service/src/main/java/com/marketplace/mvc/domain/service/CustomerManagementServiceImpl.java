package com.marketplace.mvc.domain.service;

import com.marketplace.mvc.database.service.CustomerService;
import com.marketplace.mvc.domain.request.CustomerInfo;
import com.marketplace.mvc.domain.strategy.CustomerValidationStrategyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Abhi on 4/3/16.
 */
@Service("customerManagementService")
public class CustomerManagementServiceImpl implements  CustomerManagementService{

    @Autowired
    private CustomerValidationStrategyImpl customerValidationStrategy;
    @Autowired
    private CustomerService customerService;

    public void registerCustomer(CustomerInfo customerInfo) {
        customerValidationStrategy.validateCustomer(customerInfo);
        customerService.registerCustomer(
                customerInfo.getUsername(),
                customerInfo.getFirstName(),
                customerInfo.getLastName(),
                customerInfo.getEmailId());
    }
}
