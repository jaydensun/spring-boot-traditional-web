package com.jayden.webtest.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@Slf4j
public class MyListener2 implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info(MyListener2.class + " contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info(MyListener2.class + " contextDestroyed");
    }
}
