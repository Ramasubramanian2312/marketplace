package com.marketplace.mvc.rest.controller.signup;

import com.marketplace.mvc.domain.response.MessageContent;
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
public class IsExistingEmailController extends BaseController{

        @Autowired
        private CustomerValidationStrategyImpl customerValidationStrategy;

        @RequestMapping(value = RequestMappingConstants.IS_EXISTING_EMAIL, method = RequestMethod.GET)
        public @ResponseBody
        MessageContent checkIfUsernameExists(@PathVariable("emailId") String emailId){
            customerValidationStrategy.isExistsEmailId(emailId);
            return new MessageContent("EmailId available");
        }

}
