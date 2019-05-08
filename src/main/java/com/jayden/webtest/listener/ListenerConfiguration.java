package com.jayden.webtest.listener;

import com.jayden.webtest.filter.MyFilter1;
import com.jayden.webtest.filter.MyFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

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
