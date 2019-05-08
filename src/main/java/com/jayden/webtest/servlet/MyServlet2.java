package com.jayden.webtest.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class MyServlet2 extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        log.info(MyServlet2.class + " init(config)");
        super.init(config);
    }

    @Override
    public void init() throws ServletException {
        log.info(MyServlet2.class + " init");
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append(MyServlet2.class.getName());
    }
}
