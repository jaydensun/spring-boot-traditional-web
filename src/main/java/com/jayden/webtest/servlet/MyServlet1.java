package com.jayden.webtest.servlet;

import com.jayden.webtest.helper.Helper;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Slf4j
public class MyServlet1 extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log.info(MyServlet1.class + " init(config), servlet params: " + Helper.servletConfigParamMap(config));
        log.info(MyServlet1.class + " init(config), context params: " + Helper.servletContextParamMap(getServletContext()));
    }

    @Override
    public void init() throws ServletException {
        log.info(MyServlet1.class + " init");
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.append(MyServlet2.class.getName()).append(" servlet params ").append(Helper.servletConfigParamMap(getServletConfig()).toString());
        writer.append("\n");
        writer.append(MyServlet2.class.getName()).append(" context params ").append(Helper.servletContextParamMap(getServletContext()).toString());
    }
}
