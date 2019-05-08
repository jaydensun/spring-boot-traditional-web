package com.jayden.webtest.listener;

import com.jayden.webtest.helper.Helper;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@Slf4j
public class MyListener1 implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info(MyListener1.class + " contextInitialized, context params: " + Helper.servletContextParamMap(sce.getServletContext()));
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info(MyListener1.class + " contextDestroyed");
    }
}
