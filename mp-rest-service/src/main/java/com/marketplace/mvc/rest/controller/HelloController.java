package com.marketplace.mvc.rest.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Abhi on 2/28/16.
 */
@Controller
@RequestMapping("/")
public class HelloController extends BaseController{

    /*
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/sessionTimeout")
    public String timeOut(){
        return "sessionTimeout";
    }


    @RequestMapping("/welcome")
    public String welcome(ModelMap map, Principal principal){
        ApplicationContext ac = ThreadLocalApplicationContextHolder.getApplicationContext();
        map.addAttribute("userName",ac.getAppName());
        return "helloView";
    }
    */
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "logout";
    }
}
