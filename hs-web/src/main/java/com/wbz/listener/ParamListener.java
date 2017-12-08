package com.wbz.listener;

import com.wbz.util.ConfigurationUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by wei on 2017/2/14.
 */
public class ParamListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        servletContextEvent.getServletContext().setAttribute("HTTP_URL",ConfigurationUtils.getString("HTTP_URL"));
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
