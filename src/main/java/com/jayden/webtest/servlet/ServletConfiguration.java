package com.jayden.webtest.servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfiguration {
    @Bean
    ServletRegistrationBean<MyServlet1> myServlet1ServletRegistrationBean() {
        ServletRegistrationBean<MyServlet1> bean = new ServletRegistrationBean<>();
        bean.setServlet(new MyServlet1());
        bean.setName(MyServlet1.class.getSimpleName());
        bean.addUrlMappings("/myservlet1");
        return bean;
    }

    @Bean
    ServletRegistrationBean<MyServlet2> myServlet2ServletRegistrationBean() {
        ServletRegistrationBean<MyServlet2> bean = new ServletRegistrationBean<>();
        bean.setServlet(new MyServlet2());
        bean.setName(MyServlet2.class.getSimpleName());
        bean.addUrlMappings("/myservlet2");
        return bean;
    }
}
