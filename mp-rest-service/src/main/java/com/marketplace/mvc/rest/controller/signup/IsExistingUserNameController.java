package com.marketplace.mvc.rest.controller.signup;

import com.marketplace.mvc.domain.response.MessageContent;
import com.marketplace.mvc.domain.strategy.CustomerValidationStrategy;
import com.marketplace.mvc.domain.strategy.CustomerValidationStrategyImpl;
import com.marketplace.mvc.rest.RequestMappingConstants;
import com.marketplace.mvc.rest.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by amysoresomasheka on 4/10/16.
 */
@Controller
@RequestMapping("/")
public class IsExistingUserNameController extends BaseController{

    @Autowired
    private CustomerValidationStrategyImpl customerValidationStrategy;

    @RequestMapping(value = RequestMappingConstants.IS_EXISTING_USERNAME, method = RequestMethod.GET)
    public @ResponseBody MessageContent checkIfUsernameExists(@PathVariable("username") String username){
        customerValidationStrategy.isExistsUserName(username);
        return new MessageContent("Username available");
    }
}
