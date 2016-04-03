package com.marketplace.mvc.rest.controller;

import com.marketplace.mvc.domain.request.CustomerInfo;
import com.marketplace.mvc.domain.response.CustomerRegister;
import com.marketplace.mvc.rest.RequestMappingConstants;
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

    @RequestMapping(value = RequestMappingConstants.SIGNUP, method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody CustomerRegister userSignUp(@RequestBody CustomerInfo custInfo, HttpServletRequest request,
                                                     HttpServletResponse response){
            return new CustomerRegister(custInfo.getUsername(), "Registered Successfully");
    }


}
