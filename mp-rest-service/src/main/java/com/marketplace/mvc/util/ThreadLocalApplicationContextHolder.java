package com.marketplace.mvc.util;

import com.marketplace.mvc.domain.context.ApplicationContext;

/**
 * Created by Abhi on 3/25/16.
 */
public class ThreadLocalApplicationContextHolder {

    private static final ThreadLocal<ApplicationContext> THREAD_LOCAL_APPLICATION_CONTEXT = new ThreadLocal<ApplicationContext>();

    public static void setApplicationContext(ApplicationContext ac){
        THREAD_LOCAL_APPLICATION_CONTEXT.set(ac);
    }

    public static ApplicationContext getApplicationContext(){
        return THREAD_LOCAL_APPLICATION_CONTEXT.get();
    }
}
