package com.jayden.webtest.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
public class MyFilter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info(MyFilter2.class + " init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info(MyFilter2.class.getName() + " begin");
        filterChain.doFilter(servletRequest, servletResponse);
        log.info(MyFilter2.class.getName() + " end");
    }

    @Override
    public void destroy() {
        log.info(MyFilter2.class + " destroy");
    }

}