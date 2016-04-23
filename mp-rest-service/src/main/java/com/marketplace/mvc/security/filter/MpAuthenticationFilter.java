package com.marketplace.mvc.security.filter;

import com.marketplace.mvc.security.domain.MpAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abhi on 3/29/16.
 */
public class MpAuthenticationFilter extends AbstractAuthenticationProcessingFilter{

    private static String login_url = "/login";

    private static String username = "username";
    private static String password = "password";

    protected MpAuthenticationFilter(){

       // super(login_url);
        super(new AntPathRequestMatcher("/login", "POST"));
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException {

        System.out.println(request.getParameterMap().size());
        String requestUsername = request.getParameter(username);
        String requestPassword = request.getParameter(password);
        System.out.println("WHAT THE FUCK ! " + requestUsername + "|"+requestPassword);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        MpAuthenticationToken rat = new MpAuthenticationToken(requestUsername, requestPassword, grantedAuthorities);
        return this.getAuthenticationManager().authenticate(rat);
    }
}
