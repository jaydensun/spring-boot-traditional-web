package com.jayden.webtest.listener;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ListenerConfiguration {
    @Bean
    ServletListenerRegistrationBean<MyListener1> myListener1ServletListenerRegistrationBean() {
        ServletListenerRegistrationBean<MyListener1> bean = new ServletListenerRegistrationBean<>();
        bean.setListener(new MyListener1());
        bean.setOrder(2);
        return bean;
    }

    @Bean
    ServletListenerRegistrationBean<MyListener2> myListener2ServletListenerRegistrationBean() {
        ServletListenerRegistrationBean<MyListener2> bean = new ServletListenerRegistrationBean<>();
        bean.setListener(new MyListener2());
        bean.setOrder(1);
        return bean;
    }
}
