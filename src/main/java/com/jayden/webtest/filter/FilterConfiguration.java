package com.jayden.webtest.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class FilterConfiguration {
    @Bean
    FilterRegistrationBean<MyFilter1> myFilter1FilterRegistrationBean() {
        FilterRegistrationBean<MyFilter1> bean = new FilterRegistrationBean<>();
        bean.setName(MyFilter1.class.getSimpleName());
        bean.setFilter(new MyFilter1());
        bean.setOrder(2);
        bean.addUrlPatterns("/*");
        return bean;
    }

    @Bean
    FilterRegistrationBean<MyFilter2> myFilter2FilterRegistrationBean() {
        FilterRegistrationBean<MyFilter2> bean = new FilterRegistrationBean<>();
        bean.setName(MyFilter2.class.getSimpleName());
        bean.setFilter(new MyFilter2());
        bean.setOrder(1);
        bean.addUrlPatterns("/*");
        return bean;
    }
}
