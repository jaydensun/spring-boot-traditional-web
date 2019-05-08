package com.jayden.webtest.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@Slf4j
public class MyListener1 implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info(MyListener1.class + " contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info(MyListener1.class + " contextDestroyed");
    }
}
