package com.jayden.webtest.helper;

import javax.servlet.FilterConfig;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Helper {
    public static Map<String, String> servletContextParamMap(ServletContext servletContext) {
        return Collections.list(servletContext.getInitParameterNames()).stream()
                .collect(Collectors.toMap(Function.identity(), servletContext::getInitParameter));
    }

    public static Map<String, String> servletConfigParamMap(ServletConfig servletConfig) {
        return Collections.list(servletConfig.getInitParameterNames()).stream()
                .collect(Collectors.toMap(Function.identity(), servletConfig::getInitParameter));
    }

    public static Map<String, String> filterConfigParamMap(FilterConfig filterConfig) {
        return Collections.list(filterConfig.getInitParameterNames()).stream()
                .collect(Collectors.toMap(Function.identity(), filterConfig::getInitParameter));
    }
}
