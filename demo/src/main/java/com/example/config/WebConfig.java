package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import io.netty.handler.codec.http.HttpMethod;

@Configuration 
@EnableWebMvc 
public class WebConfig extends WebMvcConfigurerAdapter { 
	@Override public void addCorsMappings(CorsRegistry registry) { 
		registry.addMapping("/**") 
				.allowedOrigins("*") 
				.allowedMethods(HttpMethod.POST.name()) 
				.allowedHeaders("header1", "header2", "header3") 
				.exposedHeaders("header1", "header2") 
				.allowCredentials(false)
				.maxAge(3600);

	} 
}
