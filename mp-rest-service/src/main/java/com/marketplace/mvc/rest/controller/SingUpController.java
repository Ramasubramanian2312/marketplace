package com.marketplace.mvc.rest.controller;

import com.marketplace.mvc.domain.exceptions.InvalidUserNameException;
import com.marketplace.mvc.domain.exceptions.UserNameAlreadyExistsException;
import com.marketplace.mvc.domain.request.CustomerInfo;
import com.marketplace.mvc.domain.response.CustomerRegister;
import com.marketplace.mvc.domain.service.CustomerManagementService;
import com.marketplace.mvc.rest.RequestMappingConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Abhi on 4/2/16.
 * username
 * email
 * username no special characters
 * email should be valid including domain name
 */
@Controller
@RequestMapping("/")
public class SingUpController extends BaseController{

    @Autowired
    private CustomerManagementService customerManagementService;

    @RequestMapping(value = RequestMappingConstants.SIGNUP, method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody CustomerRegister userSignUp(@RequestBody CustomerInfo custInfo,
                                                     HttpServletRequest request,
                                                     HttpServletResponse response){

        CustomerRegister customerRegister;
        try {
             customerManagementService.registerCustomer(custInfo);
        }
        catch(InvalidUserNameException eae){

        }
        return new CustomerRegister(custInfo.getUsername(), "Registered successfully");
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({UserNameAlreadyExistsException.class})
    public void handleUserNameAlreadyExistsExeption (UserNameAlreadyExistsException e){

    }


}
