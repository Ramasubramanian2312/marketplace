package com.marketplace.mvc.rest.filters;

import com.marketplace.mvc.domain.context.ApplicationContext;
import com.marketplace.mvc.util.ThreadLocalApplicationContextHolder;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by Abhi on 3/25/16.
 */
@Component
public class ApplicationContextFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        ApplicationContext ac = new ApplicationContext();
        ac.setAppName("Abhilash");
        ThreadLocalApplicationContextHolder.setApplicationContext(ac);
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
