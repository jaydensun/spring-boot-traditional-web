package com.jayden.webtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class WebTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebTestApplication.class, args);
    }

}
