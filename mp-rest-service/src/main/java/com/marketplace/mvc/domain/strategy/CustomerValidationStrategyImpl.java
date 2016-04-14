package com.marketplace.mvc.domain.strategy;

import com.marketplace.mvc.domain.exceptions.MpBadRequestException;
import com.marketplace.mvc.domain.exceptions.UserNameAlreadyExistsException;
import com.marketplace.mvc.domain.exceptions.EmailAlreadyExistsException;
import com.marketplace.mvc.domain.request.CustomerInfo;
import org.springframework.stereotype.Service;

/**
 * Created by Abhi on 4/2/16.
 */
@Service("customerValidationStrategy")
public class CustomerValidationStrategyImpl implements CustomerValidationStrategy {

    public void validateCustomer(CustomerInfo custInfo){

        String username = custInfo.getUsername();
        String firstName = custInfo.getFirstName();
        String lastName = custInfo.getLastName();
        String emailId = custInfo.getEmailId();

        validateRequest(username, firstName, lastName, emailId);
        isExistsUserName(username.trim());
        isExistsEmailId(custInfo.getEmailId());


    }

    public void validateRequest(String username, String firstName, String lastName, String emailId){

        if(username == null || firstName == null || lastName == null || emailId == null){
            throw new MpBadRequestException("Username/firstname/lastname is null");
        }
        if(username.trim() == "" || firstName.trim() == "" || lastName.trim() == "" || emailId.trim() == ""){
            throw new MpBadRequestException("Username/firstname/lastname is null");
        }
    }


    public void isExistsUserName(String userName){

        if(userName.equals("Anup")) {
            throw new UserNameAlreadyExistsException("Username already exists");
        }
    }

    public void isExistsEmailId(String userName){

           throw new EmailAlreadyExistsException("Email ID already exists");
    }

}
