package com.marketplace.mvc.domain.strategy;

import com.marketplace.mvc.domain.exceptions.UserNameAlreadyExistsException;
import com.marketplace.mvc.domain.request.CustomerInfo;
import org.springframework.stereotype.Service;

/**
 * Created by Abhi on 4/2/16.
 */
@Service("customerValidationStrategy")
public class CustomerValidationStrategyImpl implements CustomerValidationStrategy {

    public void validateCustomer(CustomerInfo custInfo){
        isExistsUserName(custInfo.getUsername());
        isExistsEmailId(custInfo.getEmailId());


    }


    public void isExistsUserName(String userName){

        if(userName.equals("Anup")) {
            throw new UserNameAlreadyExistsException("Username already exists");
        }
    }

    public void isExistsEmailId(String userName){

    //        throw new EmailAlreadyExistsException("Email ID already exists");
    }

}
