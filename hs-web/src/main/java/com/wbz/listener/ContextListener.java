package com.wbz.listener;

import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by wei on 2016/12/17.
 */
public class ContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
     ServletContext servletContext =   (ServletContext)WebApplicationContextUtils.getWebApplicationContext(servletContextEvent.getServletContext()).getBean("servletContext");
        servletContext.setAttribute("user","User");

    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
