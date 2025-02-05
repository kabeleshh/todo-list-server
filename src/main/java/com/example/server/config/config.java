package com.example.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class config implements WebMvcConfigurer {
    
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/api/**")
        .allowedOrigins("https://todo-list-gamma-blush-30.vercel.app/")
        .allowedMethods("GET","POST","PATCH","DELETE")
        .allowedHeaders("*")
        .allowCredentials(true);
    }
}
