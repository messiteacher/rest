package com.example.rest.global.app;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    public static boolean isNotProd() {
        return true;
    }
}
