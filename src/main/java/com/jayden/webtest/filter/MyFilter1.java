package com.jayden.webtest.filter;

import com.jayden.webtest.helper.Helper;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
public class MyFilter1 implements Filter {

    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
        log.info(MyFilter1.class + " init, filter params: " + Helper.filterConfigParamMap(filterConfig));
        log.info(MyFilter1.class + " init, context params: " + Helper.servletContextParamMap(filterConfig.getServletContext()));
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info(MyFilter1.class.getName() + " begin, filter params: " + Helper.filterConfigParamMap(filterConfig));
        log.info(MyFilter1.class.getName() + " begin, context params: " + Helper.servletContextParamMap(filterConfig.getServletContext()));
        filterChain.doFilter(servletRequest, servletResponse);
        log.info(MyFilter1.class.getName() + " end");
    }

    @Override
    public void destroy() {
        log.info(MyFilter1.class + " destroy");
    }

}
