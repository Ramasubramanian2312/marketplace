package com.marketplace.mvc.security.filter;

import com.marketplace.mvc.security.domain.MpAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Abhi on 3/29/16.
 */
public class MpAuthenticationFilter extends AbstractAuthenticationProcessingFilter{

    private static String login_url = "/j_spring_security_check";

    private static String username = "/j_username";
    private static String password = "/j_password";

    protected MpAuthenticationFilter(){

        super(login_url);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException, IOException, ServletException {
        MpAuthenticationToken rat = new MpAuthenticationToken(request.getParameter(username),
                request.getParameter(password));
        return this.getAuthenticationManager().authenticate(rat);
    }
}
