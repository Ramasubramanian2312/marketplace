package com.marketplace.mvc.domain.context;

import java.io.Serializable;

/**
 * Created by Abhi on 3/25/16.
 */
public class ApplicationContext implements Serializable {

    private String AppName;

    public String getAppName() {
        return AppName;
    }

    public void setAppName(String appName) {
        AppName = appName;
    }




}
